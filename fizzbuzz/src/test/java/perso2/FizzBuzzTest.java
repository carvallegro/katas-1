package perso2;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;

/**
 * Created by had1men on 06/06/2016.
 */
public class FizzBuzzTest {

    // TODO test negatif
    // TODO test null

    @Test
    public void zero() {
        String result = FizzBuzz.toString(0);
        Java6Assertions.assertThat(result).isEqualTo("0");
    }

}