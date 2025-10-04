class Room {
    int roomNumber;
    boolean isBooked;
    double pricePerNight;
    int nightsBooked;

    void bookRoom(int nights) {
        if (!isBooked) {
            isBooked = true;
            nightsBooked = nights;
            System.out.println("Room " + roomNumber + " booked for " + nights + " night(s).");
        } else {
            System.out.println("Room " + roomNumber + " is already booked!");
        }
    }

    double calculateBill() {
        return pricePerNight * nightsBooked;
    }

    void showInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Booked: " + isBooked);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Bill: " + calculateBill());
        System.out.println("------------------------");
    }
}

public class HotelBookingC {
    public static void main(String[] args) {

        Room r1 = new Room();
        r1.roomNumber = 101;
        r1.pricePerNight = 2000;
        r1.isBooked = false;
        r1.nightsBooked = 0;

        Room r2 = new Room();
        r2.roomNumber = 102;
        r2.pricePerNight = 2500;
        r2.isBooked = false;
        r2.nightsBooked = 0;

        r1.bookRoom(3);
        r2.bookRoom(2);

        r1.showInfo();
        r2.showInfo();
    }
}
