package yahtzee.perso.one;

import java.util.ArrayList;
import java.util.List;

class Yahtzee {
    private List<Integer> diceResults = new ArrayList<>();

    Yahtzee(int dice1, int dice2, int dice3, int dice4, int dice5) {
        diceResults.add(dice1);
        diceResults.add(dice2);
        diceResults.add(dice3);
        diceResults.add(dice4);
        diceResults.add(dice5);
    }

    int score(YahtzeeCategory category) {
        return diceResults.stream()
                .filter(dice -> dice == category.getNumber())
                .mapToInt(x -> x)
                .sum();
    }
}
