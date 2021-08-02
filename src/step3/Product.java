package step3;

public enum Product {
    COKE(1, 25), PEPSI(2, 35), SODA (3, 45), EMPTY (0, 0);
    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
}

public int getSelectionNumber(){
    return selectionNumber;
    }
    public int getPrice(){
        return this.price;
    }

    public static Product valueOf(int numberSelection){
        for(Product product: Product.values()){
            if(numberSelection== product.getSelectionNumber()){
                return product;
            }
        }
        return EMPTY;
    }
}
