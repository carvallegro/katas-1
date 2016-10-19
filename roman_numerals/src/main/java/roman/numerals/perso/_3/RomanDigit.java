package roman.numerals.perso._3;

import java.util.Arrays;

enum RomanDigit {
    _500(500, "D"),
    _100(100, "C"),
    _50(50, "L"),
    _10(10, "X"),
    _9(9, "IX"),
    _5(5, "V"),
    _4(4, "IV"),
    _1(1, "I");

    private final int arabic;
    private final String roman;

    RomanDigit(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    public int getArabic() {
        return arabic;
    }

    public String getRoman() {
        return roman;
    }

    public static RomanDigit fromArabic(int number) {
        return Arrays.stream(values())
                .filter(candidate -> number >= candidate.getArabic())
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
