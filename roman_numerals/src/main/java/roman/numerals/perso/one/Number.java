package roman.numerals.perso.one;

import java.util.HashMap;
import java.util.Map;

class Number {
    private int value;

    private static final Map<Integer,String> ROMAN_MAP = new HashMap<>();

    static {
        ROMAN_MAP.put(5, "V");
        ROMAN_MAP.put(10, "X");
    }

    Number(int value) {
        this.value = value;
    }

    String toRomanNumeral() {

        for (Map.Entry<Integer, String> roman : ROMAN_MAP.entrySet()) {
            if (value == roman.getKey()) {
                return roman.getValue();
            }
        }

        return "I";
    }
}
