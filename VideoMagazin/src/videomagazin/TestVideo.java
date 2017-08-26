
package videomagazin;

import java.util.Set;
/**
 *
 * @author NIKOLA OSTOJIC
 */
public class TestVideo  {
    
    
    public static void main(String[] args)throws VideoException {
        VideoManager vm = new VideoManager();
        
      
 
    
    Serija s1 = new Serija(5, 12, "Prijatelji", 22, 9, "komedija", "USa");
    Serija s2 = new Serija(3, 17, "Vesele 70", 22, 8, "komedija", "USa");
    Serija s3 = new Serija(5, 5, "Prijatelji", 21, 7, "komedija", "USa");
    Serija s4 = new Serija(5, 16, "Vesele 70", 22, 6, "komedija", "USa");
    Serija s5 = new Serija(4, 18, "Prijatelji", 22, 9, "komedija", "USa");
    Serija s6 = new Serija(5, 17, "Prijatelji", 22, 8, "komedija", "USa");
    Serija s7 = new Serija(11, 16, "Prijatelji", 22, 7, "komedija", "USa");
    Serija s8 = new Serija(5, 14, "Vesele 70", 22, 6, "komedija", "USa");
    Serija s9 = new Serija(8, 16, "Prijatelji", 22, 9, "komedija", "USa");
    Serija s10 = new Serija(9, 12, "Prijatelji", 22, 8, "komedija", "USa");
    Serija s11= new Serija(5, 11, "Vesele 70", 22, 7, "komedija", "USa");
    Serija s12 = new Serija(5, 4, "Vesele 70", 2200, 6, "komedija", "USa");
  
        vm.dodajVideo(s1);
        vm.dodajVideo(s2);
        vm.dodajVideo(s3);
        vm.dodajVideo(s4);
        vm.dodajVideo(s5);
        vm.dodajVideo(s6);
        vm.dodajVideo(s7);
        vm.dodajVideo(s8);
        vm.dodajVideo(s9);
        vm.dodajVideo(s10);
        vm.dodajVideo(s11);
        vm.dodajVideo(s12);

 
       
        Set<Video> nocFilmofila = vm.getSerije();
        System.out.println(nocFilmofila);
        
        //TEST ZA THROW VIDEO EXCEPTION
//        System.out.println(vm.vratiUkupnoTrajanje(lista));
        
     Film f1 = new Film("Umri Muski", "1992", 85, "akcija", 9, "usa", new String[]{"Usce","Takvud","20.Oktobar"});
     Film f2 = new Film("Halloween", "1992", 92, "horor", 5, "usa", new String[]{"Usce","Takvud","Delta"});
     Film f3 = new Film("TERMINATOR  1", "1992", 96, "SF", 8, "usa", new String[]{"Usce","Takvud"});
     Film f4 = new Film("Kum  3 ", "1992", 115, "krimi", 3, "usa", new String[]{"Usce","Takvud","Fontana"});
     Film f5 = new Film("Tarzan  4", "1992", 88, "deciji", 10, "usa", new String[]{"Usce","Takvud","Delta"});
     Film f6 = new Film("Sicario", "1992", 92, "akcija", 6, "usa", new String[]{"Usce","Takvud"});
     Film f7 = new Film("Kum  2", "1992", 99, "krimi", 4, "usa", new String[]{"Usce","Takvud"});
     Film f8 = new Film("Terminator 2", "1992", 92, "SF", 7, "usa", new String[]{"Usce","Takvud","Delta"});
     Film f9 = new Film("pOvratnik", "1992", 154, "akcija", 9, "usa", new String[]{"Usce","Takvud"});
     Film f10 = new Film("Umri Muski 2", "1992", 93, "akcija", 9, "usa", new String[]{"Usce","Takvud"});
     Film f11 = new Film("Dzejms Bond", "1989", 95, "akcija", 8, "usa", new String[]{"Usce","Takvud"});
     Film f12 = new Film("Sibirski berberin", "1999", 92, "romantika", 6, "usa", new String[]{"Usce","Takvud"});
     Film f13 = new Film("Profesionalac", "1998", 92, "akcija", 7, "usa", new String[]{"Usce","Takvud"});
     Film f14 = new Film("Sudija Dred", "1992", 92, "akcija", 7, "usa", new String[]{"Usce","Takvud"});
     Film f15 = new Film("DARK kNIGTH", "2004", 92, "akcija", 9, "usa", new String[]{"Usce","Takvud","Delta"});
      
     
     vm.dodajVideo(f1);
     vm.dodajVideo(f2);
     vm.dodajVideo(f3);
     vm.dodajVideo(f4);
     vm.dodajVideo(f5);
     vm.dodajVideo(f6);
     vm.dodajVideo(f7);
     vm.dodajVideo(f8);
     vm.dodajVideo(f9);
     vm.dodajVideo(f10);
     vm.dodajVideo(f11);
     vm.dodajVideo(f12);
     vm.dodajVideo(f13);
     vm.dodajVideo(f14);
     vm.dodajVideo(f15);
     
  
        String ser = "serija";
        String fil = "film";
  
        System.out.println("-------------top10 serija-------------");
        System.out.println(vm.topTen(ser));
        System.out.println("-------------top 10 filmova-------------");
        System.out.println(vm.topTen(fil));
    }
}
