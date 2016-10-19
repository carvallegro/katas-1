package roman.numerals.perso._3;

class Number {

    static String toRoman(int number) {
        if (number <= 0) {
            return "";
        }

        RomanDigit firstDigit = RomanDigit.fromArabic(number);

        return firstDigit.getRoman() + toRoman(number - firstDigit.getArabic());
    }
}
