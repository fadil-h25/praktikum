
public class ContohMultiEksepsi {
    public static void  cobaEksepsi(int pembilang, int penyebut){
      try {
        int hasil = pembilang / penyebut;
        System.out.println("Hasil bagi : " + hasil);
        int[] Arr = {1,2,3,4,5};
        Arr[10] = 23;
          
      } catch (ArithmeticException e) {
        System.out.println("terdapat pembagian dengan 0");

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Indeks diluar rentang");
      }

    };
    public static void main(String[] args) {
        cobaEksepsi(4, 0);
        System.out.println();
        cobaEksepsi(12, 4);
        
    }
}
