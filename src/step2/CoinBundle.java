package step2;

public class CoinBundle {
    public int number1CentCoins;
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number25CentsCoins;

    public CoinBundle (int... enteredCoins){
        this.number1CentCoins = enteredCoins[0];
        this.number5CentsCoins = enteredCoins[1];
        this.number10CentsCoins = enteredCoins[2];
        this.number25CentsCoins = enteredCoins[3];

    }
}
