package perso1;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public enum FizzBuzz {

    FIZZ(3, "Fizz"), BUZZ(5, "Buzz");

    private int divisor;
    private String representation;

    FizzBuzz(int divisor, String representation) {
        this.divisor = divisor;
        this.representation = representation;
    }

    public static String transform(int i) {
        if (i%(FIZZ.divisor * BUZZ.divisor)==0) {
            return FIZZ.representation + BUZZ.representation;
        }
        if (i%BUZZ.divisor==0) {
            return BUZZ.representation;
        }
        if (i% FIZZ.divisor ==0) {
            return FIZZ.representation;
        }
        return String.valueOf(i);
    }
}
