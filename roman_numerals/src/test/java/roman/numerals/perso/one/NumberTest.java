package roman.numerals.perso.one;

import org.junit.Test;

import java.lang.*;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {

    /*
     * ##########################################################################
     *
     * Single Letters
     *
     * ##########################################################################
     */

    @Test
    public void one() {
        Number service = new Number(1);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("I");
    }

    @Test
    public void five() {
        Number service = new Number(5);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("V");
    }

    @Test
    public void ten() {
        Number service = new Number(10);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("X");
    }

    /*
     * ##########################################################################
     *
     * Double Letters
     *
     * ##########################################################################
     */

    @Test
    public void two() {
        Number service = new Number(2);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("II");
    }

    @Test
    public void twenty() {
        Number service = new Number(20);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("XX");
    }

    /*
     * ##########################################################################
     *
     * Triple Letters
     *
     * ##########################################################################
     */

    @Test
    public void three() {
        Number service = new Number(3);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("III");
    }

    @Test
    public void thirty() {
        Number service = new Number(30);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("XXX");
    }

    /*
     * ##########################################################################
     *
     * Two different letters
     *
     * ##########################################################################
     */

    @Test
    public void six() {
        Number service = new Number(6);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("VI");
    }

    @Test
    public void eleven() {
        Number service = new Number(11);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("XI");
    }

    @Test
    public void fifteen() {
        Number service = new Number(15);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("XV");
    }

    @Test
    public void four() {
        Number service = new Number(4);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("IV");
    }

    @Test
    public void nine() {
        Number service = new Number(9);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("IX");
    }

    @Test
    public void nineteen() {
        Number service = new Number(19);

        String romanNumber = service.toRomanNumeral();

        assertThat(romanNumber).isEqualTo("XIX");
    }
}