package Tugas4Enkapsulasi;

import java.util.Scanner;

public class DataMerchant {
    static Merchant[] merc = new Merchant[0];
    static Scanner input = new Scanner(System.in);
    static double harga;
    public static int tambah(int baru){
        return baru;
    }
    public static void nambahMerchant(){
                System.out.print("Masukkan Merchant : ");
                String merchant = input.nextLine();
                System.out.print("Masukkan Produk   : ");
                String produk = input.nextLine();
                System.out.print("Harga barang      : ");
                double harga = input.nextDouble();
        DataMerchant.merc = tambahMerchant(new Merchant(merchant, produk, harga));
    }
    public static void cariMerchant(){
        System.out.print("Pilih Merchant yang mau dicari : ");
        String namaMerchant = input.nextLine();
        for(Merchant merchant : merc){
            if(namaMerchant.equalsIgnoreCase(merchant.getNamaMerchant())){
                System.out.println("\nHasil Pencarian Anda \n");
                System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
                System.out.println("Nama Produk     : " + merchant.getNamaProduk());
                System.out.println("Harga           : " + (int)merchant.getHargaMakanan());
            }
        }
    }
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] temp = new Merchant[DataMerchant.merc.length+1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            temp[i] = DataMerchant.merc[i];
        }
        temp[temp.length - 1] = merchant;
        return temp;
    }
    public static void tampilMerchant(){
        for (Merchant merchant : merc) {
            System.out.println("==== Tampilan Data Merchant UBFood ====");
            System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
            System.out.println("Nama Produk     : " + merchant.getNamaProduk());
            System.out.println("Harga           : " + (int)merchant.getHargaMakanan());
        }
    }
    public static void updateMerchant(){
        System.out.print("Nama Merchant yang akan di update\t\t  : ");
        String nama = input.nextLine();
        for(Merchant merchant : merc){
            if(nama.equalsIgnoreCase(merchant.getNamaMerchant())){
                System.out.print("Masukkan nama produk\t\t\t\t\t  : ");
                String namaProduk = input.nextLine();
                System.out.print("Masukkan Harga Produk yang akan di update : ");
                harga = input.nextDouble();
                merchant.setHargaMakanan(harga);
            }
        }
    }
}