package Tugas4Enkapsulasi;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        boolean kondisi = true;
        do{
            System.out.println("\n==== Selamat Datang di UBFood ====");
            System.out.println("1. Tampil Data");
            System.out.println("2. Tambah Merchant");
            System.out.println("3. Cari Merchant");
            System.out.println("4. Update Merchant");
            System.out.println("5. Keluar");

            System.out.print("\nMasukkan pilihan anda : ");
            int pilih = input.nextInt();
            System.out.println();
         switch (pilih) {
             case 1:
                 DataMerchant.tampilMerchant();
                 break;
             case 2:
                 DataMerchant.nambahMerchant();
                 break;
             case 3:
                 DataMerchant.cariMerchant();
                 break;
             case 4:
                 DataMerchant.updateMerchant();
                 break;
             case 5:
                 kondisi = false;
                 System.out.println("Terima Kasih Telah Menggunakan UBFood");
                 System.exit(0);
             default:
                 System.out.println("Inputan yang anda masukkan salah");
                 break;
         }
     } while (kondisi);

   }
}
