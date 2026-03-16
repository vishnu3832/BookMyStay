import java.io.*;

public class Uc12  {

    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("booking.txt");
        fw.write("Room101 booked by John");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("booking.txt"));
        System.out.println("Recovered Data:");
        System.out.println(br.readLine());
        br.close();
    }
}