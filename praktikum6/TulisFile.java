
import java.io.File;
import java.io.PrintWriter;

public class TulisFile {
    public static void main(String[] args) {
        File file = new File("java.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Fadil Hambali");
            output.println("Pemograman lanjut");
            output.println("Universitas Negeri Makassar");
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
