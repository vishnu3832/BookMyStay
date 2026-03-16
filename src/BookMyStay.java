import java.util.Scanner;

public class BookMyStay{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       BOOK MY STAY APP");
        System.out.println("=================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hotel name: ");
        String hotel = scanner.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        int pricePerNight = 2000;
        int total = nights * pricePerNight;

        System.out.println("\nBooking Confirmation");
        System.out.println("---------------------");
        System.out.println("Guest Name: " + name);
        System.out.println("Hotel: " + hotel);
        System.out.println("Nights: " + nights);
        System.out.println("Total Price: ₹" + total);

        scanner.close();
    }
}