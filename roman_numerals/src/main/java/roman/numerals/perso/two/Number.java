package roman.numerals.perso.two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Number {

    private static final String ONE = "I";
    private static final String FOUR = "IV";
    private static final String FIVE = "V";
    private static final String NINE = "IX";
    private static final String TEN = "X";
    private static final String FOURTY = "XL";
    private static final String FIFTY = "L";
    private static final String NINETY = "XC";
    private static final String HUNDRED = "C";
    private static final String FOUR_HUNDRED = "CD";
    private static final String FIVE_HUNDRED = "D";
    private static final String NINE_HUNDRED = "CM";
    private static final String THOUSAND = "M";
    private int value;

    Number(int value) {
        this.value = value;
    }

    String toRoman() {

        return IntStream.range(0, value)
                .mapToObj(i ->      ONE)
                .collect(Collectors.joining())
                .replace("IIIII",                       FIVE)
                .replace("IIII",                        FOUR)
                .replace(FIVE + FIVE,                   TEN)
                .replace(FIVE + FOUR,                   NINE)
                .replace("XXXXX",                       FIFTY)
                .replace("XXXX",                        FOURTY)
                .replace(FIFTY + FIFTY,                 HUNDRED)
                .replace(FIFTY + FOURTY,                NINETY)
                .replace("CCCCC",                       FIVE_HUNDRED)
                .replace("CCCC",                        FOUR_HUNDRED)
                .replace(FIVE_HUNDRED + FIVE_HUNDRED,   THOUSAND)
                .replace(FIVE_HUNDRED + FOUR_HUNDRED,   NINE_HUNDRED);
    }
}
