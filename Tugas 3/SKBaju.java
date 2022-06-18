import java.util.Scanner;
    public class SKBaju {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String merek = "erigo";
            int jumlah = 10;
            String jenisBaju; int jumlahBaju;
            Baju baju1 = new Baju(merek, jumlah);
            System.out.println("Baju yang tersedia : ");
            System.out.println("Baju A dengan harga "+baju1.bajua);
            System.out.println("Baju B dengan harga "+baju1.bajub);
            System.out.println("Baju C dengan harga "+baju1.bajuc);
            System.out.print("Baju yang akan anda beli bertipe : ");
            jenisBaju = sc.next();
            System.out.print("Jumlah Baju yang akan anda beli adalah : ");
            jumlahBaju = sc.nextInt();
            Baju baju2 = new Baju(jenisBaju, jumlahBaju);
            baju2.display();

        }
    }