package roman.numerals.perso.two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Number {

    private int value;

    Number(int value) {
        this.value = value;
    }

    String toRoman() {

        return IntStream.range(0, value)
                .mapToObj(i ->      "I")
                .collect(Collectors.joining())
                .replace("IIIII",   "V")
                .replace("IIII",    "IV")
                .replace("VV",      "X")
                .replace("VIV",     "IX")
                .replace("XXXXX",   "L")
                .replace("XXXX",    "XL")
                .replace("LL",      "C")
                .replace("LXL",     "XC")
                .replace("CCCCC",   "D")
                .replace("CCCC",    "CD")
                .replace("DD",      "M")
                .replace("DCD",     "CM");
    }
}
