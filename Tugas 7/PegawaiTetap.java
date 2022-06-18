package Praktikum.Tugas7;

public class PegawaiTetap extends Pegawai {
    private double upah;

    //Construcctor
    PegawaiTetap(String name, String noKTP, double upah){
        super(name, noKTP);
        this.upah = upah;
    }

    //SetterGetter
    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        // TODO Auto-generated method stub
        return getUpah();
    }

    @Override
    public String toString() {
        return "Pegawai Tetap\t: " + super.getName()+
                "\nNo KTP\t\t: " + super.getNoKTP()+
                "\nUpah\t\t: " + this.getUpah() +
                "\nPendapatan\t: " + super.formatGaji(this.gaji());
    }
    
}
