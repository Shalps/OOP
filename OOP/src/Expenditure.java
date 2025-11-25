public class Expenditure extends Deal {

    String product;
    int price;

    public Expenditure(String product, int price) {
        super("Продажа "+ product + " на "+ price + " руб.",price,0);
        this.product = product;
        this.price = price;
    }

}
