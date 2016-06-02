package perso1;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class FizzBuzzTest {

    @Test
    public void one() {
        String fizzbuzz = FizzBuzz.transform(1);
        assertThat(fizzbuzz).isEqualTo("1");
    }

    @Test
    public void two() {
        String fizzbuzz = FizzBuzz.transform(2);
        assertThat(fizzbuzz).isEqualTo("2");
    }

    // TODO test 3
    // TODO test null
    // TODO test negative

    @Test
    public void four() {
        String fizzbuzz = FizzBuzz.transform(4);
        assertThat(fizzbuzz).isEqualTo("4");
    }
}