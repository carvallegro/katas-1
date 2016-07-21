package roman.numerals.perso.one;

class Number {
    private int value;

    Number(int value) {
        this.value = value;
    }

    String toRomanNumeral() {

        for (RomanSign romanSign : RomanSign.values()) {
            if (romanSign.getNumber() == value + 1 && romanSign != RomanSign.I) {
                return RomanSign.I + romanSign.getSign();
            }
            if (value >= romanSign.getNumber()) {
                return romanSign.getSign() + new Number(value - romanSign.getNumber()).toRomanNumeral();
            }
        }

        return "";
    }

    private enum RomanSign {
        M( 1000, "M" ),
        D( 500, "D" ),
        C( 100, "C" ),
        L(50, "L"),
        X(10, "X"),
        V(5, "V"),
        I(1, "I");

        private int number;
        private String sign;

        RomanSign(int number, String sign) {
            this.number = number;
            this.sign = sign;
        }

        public int getNumber() {
            return number;
        }

        public String getSign() {
            return sign;
        }
    }
}
