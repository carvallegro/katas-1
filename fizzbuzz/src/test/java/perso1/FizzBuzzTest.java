package perso1;


import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by HadrienMP on 02/06/2016.
 */
public class FizzBuzzTest {

    @Test
    public void one() {
        String fizzbuzz = FizzBuzz.play(1);
        assertThat(fizzbuzz).isEqualTo("1");
    }
}