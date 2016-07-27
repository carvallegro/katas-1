package yahtzee.perso.one;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YahtzeeTest {

    @Test
    public void ones_single() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(1,2,3,4,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategory.ONES);

        // THEN
        assertThat(score).isEqualTo(1);
    }

    @Test
    public void twos_single() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(1,2,3,4,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategory.TWOS);

        // THEN
        assertThat(score).isEqualTo(2);
    }

    @Test
    public void threes_single() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(1,2,3,4,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategory.THREES);

        // THEN
        assertThat(score).isEqualTo(3);
    }

    @Test
    public void ones_double() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(1,1,3,4,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategory.ONES);

        // THEN
        assertThat(score).isEqualTo(2);
    }

    @Test
    public void twos_double() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(2,1,3,2,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategory.TWOS);

        // THEN
        assertThat(score).isEqualTo(4);
    }

    // TODO tester avec des valeurs <= 0
    // TODO tester avec des valeurs supérieures à 6
}