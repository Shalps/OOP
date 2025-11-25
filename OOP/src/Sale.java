public class Sale extends Deal {
    String product;
    int price;

    public Sale(String product, int price) {
        super("Продажа "+ product + " на "+ price + " руб.",0,price);
        this.product = product;
        this.price = price;

    }

}

