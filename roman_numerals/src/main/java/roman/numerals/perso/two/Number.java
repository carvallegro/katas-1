package roman.numerals.perso.two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static roman.numerals.perso.two.RomanDigit.*;

class Number {

    private int value;

    Number(int value) {
        this.value = value;
    }

    String toRoman() {

        return IntStream.range(0, value)
                .mapToObj(i -> ONE.getRepresentation())
                .collect(Collectors.joining())
                .replace(ONE.times(5),                      FIVE.getRepresentation())
                .replace(ONE.times(4),                      FOUR.getRepresentation())
                .replace(FIVE.plus(FIVE),                   TEN.getRepresentation())
                .replace(FIVE.plus(FOUR),                   NINE.getRepresentation())
                .replace(TEN.times(5),                      FIFTY.getRepresentation())
                .replace(TEN.times(4),                      FOURTY.getRepresentation())
                .replace(FIFTY.plus(FIFTY),                 HUNDRED.getRepresentation())
                .replace(FIFTY.plus(FOURTY),                NINETY.getRepresentation())
                .replace(HUNDRED.times(5),                  FIVE_HUNDRED.getRepresentation())
                .replace(HUNDRED.times(4),                  FOUR_HUNDRED.getRepresentation())
                .replace(FIVE_HUNDRED.plus(FIVE_HUNDRED),   THOUSAND.getRepresentation())
                .replace(FIVE_HUNDRED.plus(FOUR_HUNDRED),   NINE_HUNDRED.getRepresentation());
    }
}
