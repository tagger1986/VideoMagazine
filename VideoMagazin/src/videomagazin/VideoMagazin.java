package videomagazin;
/**
 *
 * @author NIKOLA OSTOJIC
 */
import java.util.Scanner;

public class VideoMagazin {
    


    public static void main(String[] args) {
        
         VideoManager vm = new VideoManager();
          Scanner sc = new Scanner(System.in);
    
        System.out.println("**************DOBRODOSLI U VIDEO MAGAZIN**************");
        System.out.println("(Unesite 1,2 ili q)");
        System.out.println("MENU :\n 1\t- Unos Film\n 2\t- Unos Serija\n q\t- Izlaz i prikaz video magazina ");
        String odgovor = sc.nextLine();
        while (odgovor.equalsIgnoreCase("1")) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Unesite naziv filma: ");
            String nazivFilma = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Unesite godinu premijere: ");
            String godiste = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Unesite trajanje u minutima: ");
            int trajanje = sc3.nextInt();
            Scanner sc4 = new Scanner(System.in);
            System.out.print("Unesite zanr: ");
            String zanrFilma = sc4.nextLine();
            Scanner sc5 = new Scanner(System.in);
            System.out.print("Unesite ocenu filma (1-10): ");
            int ocena = sc5.nextInt();
            Scanner sc6 = new Scanner(System.in);
            System.out.print("Unesite zemlju: ");
            String zemlja = sc6.nextLine();
            Scanner sc7 = new Scanner(System.in);
            System.out.print("Unesite bioskope u kojima se prikazuje (bioskope odvajati sa /): ");
            String cinema = sc7.nextLine();
            String[] bioskopi = cinema.split("/");
            
            Film film = new Film(nazivFilma, godiste, trajanje, zanrFilma, ocena, zemlja, bioskopi);
            
            vm.dodajVideo(film);
        Scanner sc8 = new Scanner(System.in); 
        System.out.println("Uspesno uneseno u bazu. Izaberi dalje.");
        System.out.println("MENU :\n 1- Unos Film\n 2- Unos Serija\n q- Izlaz i prikaz video magazina ");
        odgovor = sc8.nextLine();
            
        }
        while  (odgovor.equalsIgnoreCase("2")){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Unesite naziv serije: ");
            String nazivSerije= sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Unesite sezonu: ");
            int sezona = sc2.nextInt();
            Scanner sc3 = new Scanner(System.in);
            System.out.print("Unesite epizodu: ");
            int epizoda = sc3.nextInt();
             Scanner sc4 = new Scanner(System.in);
            System.out.print("Unesite trajanje u minutima: ");
            int trajanje = sc4.nextInt();
            Scanner sc5 = new Scanner(System.in);
            System.out.print("Unesite zanr: ");
            String zanrFilma = sc5.nextLine();
            Scanner sc6 = new Scanner(System.in);
            System.out.print("Unesite ocenu filma (1-10): ");
            int ocena = sc6.nextInt();
            Scanner sc7 = new Scanner(System.in);
            System.out.print("Unesite zemlju: ");
            String zemlja = sc7.nextLine();
            
            
            Serija serija = new Serija(sezona, epizoda, nazivSerije, trajanje, ocena, zanrFilma, zemlja);
            
            vm.dodajVideo(serija);
        Scanner sc8 = new Scanner(System.in); 
        System.out.println("Uspesno uneseno u bazu. Izaberi dalje.");
        System.out.println("MENU :\n 1- Unos Film\n 2- Unos Serija\n q- Izlaz i prikaz video magazina ");
        odgovor = sc8.nextLine();
            
        }
        if (odgovor.equalsIgnoreCase("q")) {

            vm.printMagazin();

        }
           
   //ZA TESTIRANJE-----------------------------RUCNI UNOS-------------------------------------------        
    
        System.out.println("****************************************************");
        VideoManager v = new VideoManager();
     
        Film f1 = new Film("Umri Muski", "1992", 92, "akcija", 9, "usa", new String[]{"Usce", "Takvud"});
        Film f2 = new Film("Halloween", "1992", 92, "akcija", 5, "usa", new String[]{"Usce", "Takvud"});
        Film f3 = new Film("TERMINATOR  1", "1992", 92, "akcija", 8, "usa", new String[]{"Usce", "Takvud"});
        Film f4 = new Film("Kum  3 ", "1992", 92, "akcija", 3, "usa", new String[]{"Usce", "Takvud"});
        Film f5 = new Film("FilMsKi TeST  4", "1992", 92, "akcija", 10, "usa", new String[]{"Usce", "Takvud"});
        Film f6 = new Film("Sicario", "1992", 92, "akcija", 6, "usa", new String[]{"Usce", "Takvud"});
        Film f7 = new Film("Kum  2", "1992", 92, "akcija", 4, "usa", new String[]{"Usce", "Takvud"});
        Film f8 = new Film("Terminator 2", "1992", 92, "akcija", 10, "usa", new String[]{"Usce", "Takvud"});
        Film f9 = new Film("pOVRATAK kRALJA:", "1992", 92, "akcija", 9, "usa", new String[]{"Usce", "Takvud"});
        Film f10 = new Film("Umri Muski", "1992", 92, "akcija", 9, "usa", new String[]{"Usce", "Takvud"});
        Film f11 = new Film("Dzejms Bond", "1992", 92, "akcija", 8, "usa", new String[]{"Usce", "Takvud"});
        Film f12 = new Film("Sibirski berberin", "1992", 92, "akcija", 6, "usa", new String[]{"Usce", "Takvud"});
        Film f13 = new Film("Profesionalac", "1992", 92, "akcija", 10, "usa", new String[]{"Usce", "Takvud"});
        Film f14 = new Film("Sudija Dred", "1992", 92, "akcija", 7, "usa", new String[]{"Usce", "Takvud"});
        Film f15 = new Film("DARK kNIGTH", "1992", 92, "akcija", 9, "usa", new String[]{"Usce", "Takvud"});

        v.dodajVideo(f1);
        v.dodajVideo(f2);
        v.dodajVideo(f3);
        v.dodajVideo(f4);
        v.dodajVideo(f5);
        v.dodajVideo(f6);
        v.dodajVideo(f7);
        v.dodajVideo(f8);
        v.dodajVideo(f9);
        v.dodajVideo(f10);
        v.dodajVideo(f11);
        v.dodajVideo(f12);
        v.dodajVideo(f13);
        v.dodajVideo(f14);
        v.dodajVideo(f15);

        Serija s1 = new Serija(5, 12, "Prijatelji", 22, 9, "komedija", "USa");
        Serija s2 = new Serija(5, 17, "Prijatelji", 22, 8, "komedija", "USa");
        Serija s3 = new Serija(5, 15, "Prijatelji", 22, 7, "komedija", "USa");
        Serija s4 = new Serija(5, 16, "Prijatelji", 22, 10, "komedija", "USa");
        Serija s5 = new Serija(5, 18, "Prijatelji", 22, 9, "komedija", "USa");
        Serija s6 = new Serija(5, 17, "Prijatelji", 22, 10, "komedija", "USa");
        Serija s7 = new Serija(5, 16, "Prijatelji", 22, 7, "komedija", "USa");
        Serija s8 = new Serija(5, 14, "Prijatelji", 22, 2, "komedija", "USa");
        Serija s9 = new Serija(5, 16, "Prijatelji", 22, 9, "komedija", "USa");
        Serija s10 = new Serija(5, 12, "Prijatelji", 22, 8, "komedija", "USa");
        Serija s11 = new Serija(5, 11, "Prijatelji", 22, 7, "komedija", "USa");
        Serija s12 = new Serija(5, 11, "Prijatelji", 22, 6, "komedija", "USa");

        v.dodajVideo(s1);
        v.dodajVideo(s2);
        v.dodajVideo(s3);
        v.dodajVideo(s4);
        v.dodajVideo(s5);
        v.dodajVideo(s6);
        v.dodajVideo(s7);
        v.dodajVideo(s8);
        v.dodajVideo(s9);
        v.dodajVideo(s10);
        v.dodajVideo(s11);
        v.dodajVideo(s12);

        v.printMagazin();

}
    
} 
    

    

    

