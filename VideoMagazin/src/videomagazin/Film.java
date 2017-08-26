
package videomagazin;

import java.util.Arrays;

public class Film extends Video {
    private String[] bioskopi;
    private String godinaIzdavanja;

    public Film(String naziv, String godinaIzdavanja, int trajanje, String zanr, int rejting,  String zemljaPorekla, String[] bioskopi) {
        super(naziv, trajanje, rejting, zanr, zemljaPorekla);
        this.bioskopi = bioskopi;
        this.godinaIzdavanja = godinaIzdavanja;
    }
    public String[] getBioskopi() {
        return bioskopi;
    }

    public void setBioskopi(String[] bioskopi) {
        this.bioskopi = bioskopi;
    }

    public String getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public void setGodinaIzdavanja(String godinaIzdavanja) {
        this.godinaIzdavanja = godinaIzdavanja;
    }

    @Override
    public String toString() {
        return String.format("FILM\t %s\tGod:%s\t%smin\tZanr:%s\tRejting:%s\tZemlja:%s\tBioskopi: %s\n",
                getNaziv().toUpperCase(), getGodinaIzdavanja(), getTrajanje(), getZanr(), getRejting(), getZemljaPorekla().toUpperCase(), Arrays.toString(getBioskopi()));

    }







    



   
    


}
