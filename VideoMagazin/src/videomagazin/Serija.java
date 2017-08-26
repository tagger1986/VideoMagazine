
package videomagazin;


public class Serija extends Video {
   
    private int sezona;
    private int epizoda;

    public Serija(int sezona, int epizoda, String naziv, int trajanje, int rejting, String zanr, String zemljaPorekla) {
        super(naziv, trajanje, rejting, zanr, zemljaPorekla);
        this.sezona = sezona;
        this.epizoda = epizoda;
    }

    public int getSezona() {
        return sezona;
    }

    public void setSezona(int sezona) {
        if(sezona >0 && sezona <50)
        this.sezona = sezona;
    }

    public int getEpizoda() {
        return epizoda;
    }

    public void setEpizoda(int epizoda) {
        if(sezona >0)
        this.epizoda = epizoda;
    }

       @Override
    public String toString() {
        
        return String.format("SERIJA\t %s\t\tS%sE%s\t\t%smin\tRejting: %s\tZanr:%s Zemlja porekla: %s\n",
               getNaziv().toUpperCase(),getSezona(),getEpizoda(),getTrajanje(),getRejting(), getZanr(), getZemljaPorekla().toUpperCase());
    }
}
