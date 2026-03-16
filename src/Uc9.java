import java.util.*;

public class Uc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter number of rooms:");
            int rooms = sc.nextInt();
            System.out.println("Rooms booked: " + rooms);
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
    }
}