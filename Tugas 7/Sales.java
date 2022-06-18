package Praktikum.Tugas7;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    
    //Constructor
    Sales(String name, String noKTP, int penjualan, double komisi){
        super(name, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    //SetterGetter
    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        // TODO Auto-generated method stub
        return getPenjualan() * getKomisi();
    }
    
    @Override
    public String toString() {
        return "Sales\t\t: "+super.getName() +
                "\nNo KTP\t\t: "+super.getNoKTP() +
                "\nTotal Penjualan : "+getPenjualan() +
                "\nBesaran Komisi  : "+getKomisi() +
                "\nPendapatan\t: " + super.formatGaji(this.gaji());
    }


    

    
}