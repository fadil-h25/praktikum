
import java.io.File;

public class ContohFile {
    public static void main(String[] args) {
        File file = new  File("java.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File berhasil dibuat");
            }else{
                System.out.println("File gagal dibuat");
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("Apakah file ada ? " + file.exists());
        System.out.println("Apakah file bisa dibaca ? " + file.canRead());
        System.out.println("Apakah file bisa ditulis ? " + file.canWrite());
        System.out.println("Apakah berupa direktori ? " + file.isDirectory());
        System.out.println("Apakah berupa file ? " + file.isFile());
        System.out.println("Apa Namanya ? " + file.getName());
        System.out.println("dimana lokasinya ? " + file.getPath());
        System.out.println("dimana lokasinya lengkapnya ? " + file.getAbsolutePath());
    }
}
