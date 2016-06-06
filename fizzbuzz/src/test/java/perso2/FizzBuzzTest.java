package perso2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by had1men on 06/06/2016.
 */
public class FizzBuzzTest {

    // TODO test negatif
    // TODO test null

    @Test
    public void zero() {
        String result = FizzBuzz.toString(0);
        assertThat(result).isEqualTo("0");
    }

    @Test
    public void one() {
        String result = FizzBuzz.toString(1);
        assertThat(result).isEqualTo("1");
    }

}