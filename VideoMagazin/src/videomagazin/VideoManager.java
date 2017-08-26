
package videomagazin;


import videoInterface.VideoInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author NIKOLA OSTOJIC
 */
public class VideoManager implements VideoInterface {
    
    protected Set<Video> videoBaza = new HashSet<>();
    
    protected Set <Video> serije = new HashSet<>();
    protected Set <Video> filmovi = new HashSet<>();

    public Set<Video> getVideoBaza() {
        videoBaza.addAll(serije);
        videoBaza.addAll(filmovi);
        return videoBaza;
    }

    public Set<Video> getSerije() {
        return serije;
    }

    public Set<Video> getFilmovi() {
        return filmovi;
    }
    
    

    @Override
    public void dodajVideo(Video video) {
        if(video instanceof Serija)
        this.serije.add(video);
        else 
        this.filmovi.add(video);
    }

    @Override
    public void obrisiVideo(Video video) {
        if(video instanceof Serija)
        this.serije.remove(video);
        else 
        this.filmovi.remove(video);
    }

    @Override
      public Set<Video> vratiVideaPoRejtingu(int rejting) {
        Set rejtingLista1 = new HashSet();
        for(Video video: getVideoBaza()){
            if(video.getRejting() == rejting){
                rejtingLista1.add(video);
            }
        }
        return rejtingLista1;
    } 
    

    @Override
    public Set<Video> vratiVideaPoRejtingu(int rejtingDonji, int rejtingGornji) {
        Set<Video> rejtingLista2 = new HashSet<>();
        for (Video video : getVideoBaza()) {
            if (video.getRejting() >= rejtingDonji && video.getRejting() <= rejtingGornji) {
                rejtingLista2.add(video);
            }
        }
        return rejtingLista2;
    }

    @Override
    public int vratiUkupnoTrajanje(Set<Video> spisakVidea)throws VideoException {
        int ukTrajanje = 0;
        for (Video video : spisakVidea) {

            ukTrajanje += video.getTrajanje();
        }
        if (ukTrajanje > 1440) {
            throw new VideoException();
        } else {
            return ukTrajanje;
        }
    }

  
    @Override
    public List<Video> topTen(String vrstaVidea) {
        List<Video> lista = new ArrayList<>();

        if (vrstaVidea.equalsIgnoreCase("serija")) {
            lista.addAll(serije);
        } else if (vrstaVidea.equalsIgnoreCase("film")) {
            lista.addAll(filmovi);
        }
        Collections.sort(lista);
         return lista.subList(0, 10);
    }

    public void printMagazin(){
        
        Set<Serija> listaSerija10 = new HashSet<>();
        Set<Film> listaFilmova10 = new HashSet<>();
        Set<Serija> listaSerijaR5 = new HashSet<>();
        Set<Film>   listaFilmovaR5 = new HashSet<>();
        
        Set <Video> sviSa10= vratiVideaPoRejtingu(10);
        Set <Video> rejtingManjiOd5 = vratiVideaPoRejtingu(1, 5);
        
        for (Video video : sviSa10) {
            if (video instanceof Serija) {
                listaSerija10.add((Serija) video);
            }else if(video instanceof Film)
                listaFilmova10.add((Film) video);
        }
        System.out.println("-------Lista filmova sa rejtingom 10-------");
        for (Film film : listaFilmova10) {
            System.out.println(film.getNaziv().toUpperCase());
        }
        System.out.println("------------------------------------------");
        System.out.println("-------Lista serija sa rejtingom 10-------");
        for (Serija serija : listaSerija10) {
            System.out.println(serija.getNaziv().toUpperCase()+" S"+serija.getSezona()+"E"+serija.getEpizoda());
        }
        
        for (Video video : rejtingManjiOd5) {
            if (video instanceof Serija) {
                listaSerijaR5.add((Serija) video);
            }else if (video instanceof Film) {
                listaFilmovaR5.add((Film) video);
            }
        }
        System.out.println("----------------------------------------------------");    
        System.out.println("-------Lista filmova sa rejtingom manjim od 5-------");
        for (Film film : listaFilmovaR5) {
            System.out.println(film.getNaziv().toUpperCase());
            }
        System.out.println("----------------------------------------------------");
        System.out.println("-------Lista serija sa rejtingom manjim od 5-------");
            for (Serija serija : listaSerijaR5) {
                System.out.println(serija.getNaziv().toUpperCase()+" S"+serija.getSezona()+"E"+serija.getEpizoda());
            }
    }
}
