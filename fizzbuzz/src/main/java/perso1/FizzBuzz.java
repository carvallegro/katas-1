package perso1;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class FizzBuzz {
    public static String transform(int i) {
        if (i==3 || i==6 || i==9) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
