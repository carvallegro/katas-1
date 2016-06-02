package perso1;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class FizzBuzz {
    public static String transform(int i) {
        if (i%15==0) {
            return "FizzBuzz";
        }
        if (i%5==0) {
            return "Buzz";
        }
        if (i%3==0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
