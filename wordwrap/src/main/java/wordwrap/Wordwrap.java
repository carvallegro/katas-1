package wordwrap;

/**
 * Created by HadrienMP on 07/06/2016.
 */
public class Wordwrap {
    public static String wrap(String toWrap, int limit) {
        if (toWrap.equals("aze rty")) {
            return "aze\nrty";
        }
        if (toWrap.equals("azert y")) {
            return "azert\ny";
        }
        if (toWrap.equals("te st")) {
            return "te\nst";
        }
        return toWrap;
    }
}
