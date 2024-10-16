
import javax.swing.JOptionPane;

public class ContohInputJOption {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null,"Name : ");
        JOptionPane.showMessageDialog(null, "Nama Anda : " + nama);
    }
}
