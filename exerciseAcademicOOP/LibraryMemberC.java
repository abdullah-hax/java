class LibraryMember {
    String memberName;
    String membershipType;
    int booksBorrowed;

    void borrowBook(int count) {
        booksBorrowed += count;
        System.out.println(memberName + " borrowed " + count + " books");
        showStatus();
    }

    void returnBook(int count) {
        if (booksBorrowed >= count) {
            booksBorrowed -= count;
            System.out.println(memberName + " returned " + count + " books");
        } else {
            System.out.println("Error: " + memberName + " cannot return more books than borrowed!");
        }
        showStatus();
    }

    void showStatus() {
        System.out.println("Member: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Books Borrowed: " + booksBorrowed);
        System.out.println("------------------------");
    }
}

public class LibraryMemberC {
    public static void main(String[] args) {

        LibraryMember m1 = new LibraryMember();
        m1.memberName = "Akther";
        m1.membershipType = "Premium";
        m1.booksBorrowed = 2;

        LibraryMember m2 = new LibraryMember();
        m2.memberName = "Rosen";
        m2.membershipType = "Regular";
        m2.booksBorrowed = 0;

        m1.showStatus();
        m2.showStatus();

        m1.borrowBook(1);
        m1.returnBook(2);
        m2.borrowBook(3);
        m2.returnBook(1);
    }
}
