
class CartItem {
    String itemName;
    int unitPrice;
    int quantity;
    int price;

    void calculate() {
        price = unitPrice * quantity;
    }

    void display() {
        System.out.println("Item name : " + itemName);
        System.out.println("price : " + unitPrice);
        System.out.println("quantity : " + quantity);
        System.out.println("total price : " + price);
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        CartItem item1 = new CartItem();

        item1.itemName = "book";
        item1.unitPrice = 220;
        item1.quantity = 7;

        item1.calculate();
        item1.display();

    }
}
