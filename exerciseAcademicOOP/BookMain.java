class Book {
    String title;
    String author;
    int price;

    void showBook() {
        System.out.println("title : " + title);
        System.out.println("author : " + author);
        System.out.println("price : " + price);
        System.out.println("--------------------");
    }

}

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.title = "ষোলো";
        b1.author = "lost modesty";
        b1.price = 50;
        b1.showBook();

        b2.title = "তুমি ফিরবে বলে";
        b2.author = "abcde";
        b2.price = 200;
        b2.showBook();

        b3.title = "আকাশের ওপারে আকাশ";
        b3.author = "lost modesty";
        b3.price = 220;
        b3.showBook();
    }
}