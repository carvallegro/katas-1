package yahtzee.perso.one;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class YahtzeeTest {

    @Test
    public void ones_one() {
        // GIVEN
        Yahtzee yahtzee = new Yahtzee(1,2,3,4,5);

        // WHEN
        int score = yahtzee.score(YahtzeeCategories.ONES);

        // THEN
        assertThat(score).isEqualTo(1);
    }

    // TODO tester avec des valeurs <= 0
    // TODO tester avec des valeurs supérieures à 6
}