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

    private String representation(int i) {
        return i % divisor == 0 ? this.representation : "";
    }

    public static String transform(int i) {
        String representation = "";

        for (FizzBuzz value : FizzBuzz.values()) {
            representation += value.representation(i);
        }

        if (representation.isEmpty()) {
            representation += String.valueOf(i);
        }

        return representation;
    }
}
