package wordwrap;

/**
 * Created by HadrienMP on 07/06/2016.
 */
public class Wordwrap {
    public static String wrap(String toWrap, int limit) {
        return toWrap.replace(" ", "\n");
    }
}
