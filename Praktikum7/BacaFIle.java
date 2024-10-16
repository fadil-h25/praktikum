import java.io.File;
import java.util.Scanner;

public class BacaFIle {
    public static void main(String[] args) {
        File file = new File("java.txt");
        try {
            Scanner input = new Scanner(file);
            input.useDelimiter("\n");
            while (input.hasNext()) {
                String nama = input.next();
                String mk = input.next();
                String pt = input.next();
                System.out.println("Nama : " +nama);
                System.out.println("Mata Kuliah : " +mk);
                System.out.println("Perguruan Tinggi : " +pt);
                
            }
        } catch (Exception e) {
        }
    }
}
