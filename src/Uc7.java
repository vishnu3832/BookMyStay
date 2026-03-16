import java.util.*;

public class Uc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Add-On Service");
        System.out.println("1. Breakfast");
        System.out.println("2. Airport Pickup");
        System.out.println("3. Extra Bed");

        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println("Breakfast Added"); break;
            case 2: System.out.println("Airport Pickup Added"); break;
            case 3: System.out.println("Extra Bed Added"); break;
            default: System.out.println("Invalid Option");
        }
    }
}