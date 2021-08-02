package step2;

public class VendingMachineRequest {
    public Product product;
    public CoinBundle enteredCoins;

    public VendingMachineRequest(int selectedProduct, int...enteredCoins){

        this.product = null;
        this.enteredCoins = new CoinBundle(enteredCoins);
    }
}
