package yahtzee.perso.one;

public enum YahtzeeCategory {
    ONES(1), THREES(3), TWOS(2);

    private int number;

    YahtzeeCategory(int number) {

        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
