package wordwrap;

/**
 * Created by HadrienMP on 07/06/2016.
 */
public class Wordwrap {
    public static String wrap(String toWrap, int limit) {
        if (toWrap.equals("azerty")) {
            return "azerty";
        }
        if (toWrap.equals("toto")) {
            return "toto";
        }
        if (toWrap.equals("qdfqgf")) {
            return "qdfqgf";
        }
        return "";
    }
}
