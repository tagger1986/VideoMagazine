
package videomagazin;

public abstract class Video implements Comparable<Video>{
    private String naziv;
    private int trajanje;
    private int rejting;
    private String zanr;
    private String zemljaPorekla;
 


    public Video( String naziv, int trajanje, int rejting, String zanr, String zemljaPorekla) {
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.rejting = rejting;
        this.zanr = zanr;
        this.zemljaPorekla = zemljaPorekla;
       
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        if(trajanje > 0)
        this.trajanje = trajanje;
        else System.out.println("Greska!");
    }

    public int getRejting() {
        return rejting;
    }

    public void setRejting(int rejting) {
        if (rejting >0 && rejting <=10)
        this.rejting = rejting;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    @Override
    public int compareTo(Video o) {
        if (this.rejting == o.rejting) {
            return 0;
        } else if (this.rejting < o.rejting) {
            return 1;
        } else {
            return -1;
        }
    }

}
