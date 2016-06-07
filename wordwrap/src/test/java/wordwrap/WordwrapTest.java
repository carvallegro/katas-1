package wordwrap;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by HadrienMP on 07/06/2016.
 */
public class WordwrapTest {

    @Test
    public void empty_zero() {
        String wrapped = Wordwrap.wrap("", 0);
        Assertions.assertThat(wrapped).isEqualTo("");
    }

    @Test
    public void empty_10() {
        String wrapped = Wordwrap.wrap("", 10);
        Assertions.assertThat(wrapped).isEqualTo("");
    }

    @Test
    public void nospace_bigger() {
        String wrapped = Wordwrap.wrap("azerty", 10);
        Assertions.assertThat(wrapped).isEqualTo("azerty");
    }

    @Test
    public void nospace_bigger2() {
        String wrapped = Wordwrap.wrap("toto", 10);
        Assertions.assertThat(wrapped).isEqualTo("toto");
    }

    @Test
    public void nospace_bigger3() {
        String wrapped = Wordwrap.wrap("qdfqgf", 10);
        Assertions.assertThat(wrapped).isEqualTo("qdfqgf");
    }

    // TODO espaces autour
    // TODO null parameters
    // TODO 0 et chaine plus grande

    @Test
    @Ignore
    // TODO
    public void nospace_zero() {
        String wrapped = Wordwrap.wrap("dqkfqskjfqhsfhkqsjfqksjhfqsf", 0);
        Assertions.assertThat(wrapped).isEqualTo("");
    }

    // TODO test negative number
    // TODO test non zero number
}