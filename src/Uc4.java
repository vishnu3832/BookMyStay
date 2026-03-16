import java.util.Scanner;

public class Uc4 {

    public static void searchRoom() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room type: ");
        String room = sc.nextLine();

        System.out.println("Checking availability for " + room + "...");
        System.out.println("Room Available!");

    }
}