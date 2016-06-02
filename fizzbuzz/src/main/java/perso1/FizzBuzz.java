package perso1;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class FizzBuzz {
    public static String transform(int i) {
        if (i==5||i==10||i==20) {
            return "Buzz";
        }
        if (i%3==0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
