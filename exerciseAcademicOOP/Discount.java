class Product {
    String name;
    float price;
    float discountPercentage;

    float calculateDiscountPrice() {
        price = price - price * discountPercentage;
        return price;
    }
}

public class Discount {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "RAM";
        p1.price = 2500;
        p1.discountPercentage = 0.13f;

        float currentPrice = p1.calculateDiscountPrice();
        System.out.println("Current Price : " + currentPrice);
    }
}
