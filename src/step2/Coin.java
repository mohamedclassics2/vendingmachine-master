package step2;

public enum Coin {
    ONE_CENT (1), FIVE_CENTS(5), TEN_CENTS(10), TWENTYFIVE_CENTS(25);

    private int value;
    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
