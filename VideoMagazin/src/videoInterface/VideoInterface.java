
package videoInterface;

import java.util.List;
import java.util.Set;
import videomagazin.Video;
import videomagazin.VideoException;

public interface VideoInterface {
      public void dodajVideo(Video video);
      public void obrisiVideo(Video video);
      public Set<Video> vratiVideaPoRejtingu(int rejting);
      public Set<Video> vratiVideaPoRejtingu(int rejtingDonji, int rejtingGornji);
      public int vratiUkupnoTrajanje(Set<Video> spisakVidea)throws VideoException;
      public List<Video> topTen(String vrstaVidea);
      
}
