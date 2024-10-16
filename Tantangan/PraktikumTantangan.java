
import java.io.IOException;

public class PraktikumTantangan {
    public static void validation(int  noHp,String ktp, String email) throws  NullPointerException,IOException{
        if(ktp.length()  <= 0 || email.length() <= 0){
            throw new NullPointerException("input tidak boleh kosong");
        }

        if(ktp.length() != 16){
            throw  new IOException("Jumlah karakter KTP harus berjumlah 16");
        }else if (!email.contains("@") || !email.contains(".com")  ) {
            throw  new IOException("Email tidak valid");
        }

        System.out.println("Data yang anda masukan valid : ");
        System.out.println("No Hp : " + noHp);
        System.out.println("No KTP : " + ktp);
        System.out.println("Email : " + email);
        
    }
    public static void main(String[] args) {
        try {
            validation(0, "".repeat(4), "fadil25@gmail.com");
        } catch (NullPointerException e) {
            System.out.println("input tidak boleh kosong ");
        }
         catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
