class Booking extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " booking room");
    }
}

public class Uc11 {
    public static void main(String[] args) {

        Booking b1 = new Booking();
        Booking b2 = new Booking();

        b1.start();
        b2.start();
    }
}