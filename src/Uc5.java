import java.util.Scanner;

public class Uc5 {

    public static void bookingRequest() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter room type: ");
        String room = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        System.out.println("Booking Confirmed!");
        System.out.println("Guest Name: " + name);
        System.out.println("Room Type: " + room);
        System.out.println("Nights: " + nights);

    }
}