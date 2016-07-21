package roman.numerals.perso.one;

import org.junit.Test;

import java.lang.*;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    @Test
    public void one() {
        roman.numerals.perso.one.Number service = new roman.numerals.perso.one.Number(1);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    public void five() {
        roman.numerals.perso.one.Number service = new roman.numerals.perso.one.Number(5);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("V");
    }

    @Test
    public void ten() {
        roman.numerals.perso.one.Number service = new roman.numerals.perso.one.Number(10);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("X");
    }
}