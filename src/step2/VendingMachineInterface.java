package step2;

public interface VendingMachineInterface {
    void displayProducts();
    void selectProduct(int product);
    void enterCoins(int... coins);
    void displayChangeMessage();

    void displayEnterCoinsMessage();
}
