
package all_classes;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class openURL {
    public static void go() throws URISyntaxException
    {
        final URI uri1 = new URI("mailto:mfislam_2323@yahoo.com?Subject=Feedback");
        open(uri1);
    }
     public static void go_set(String url) throws URISyntaxException
    {
        final URI uri1 = new URI(url);
        open(uri1);
    }
    private static void open(URI uri) {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(uri);
      } catch (IOException e) {
          
      }
    }
    }
}
