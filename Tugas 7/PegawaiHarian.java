package Praktikum.Tugas7;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    //Constructor
    PegawaiHarian(String name, String noKTP, double upahPerJam, int totalJam){
        super(name, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }
    
    //SetterGetter
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double gajiHarian = 0;
        if (getTotalJam() <= 40) {
            gajiHarian = getUpahPerJam() * getTotalJam();
        }else {
            gajiHarian = (40 * getUpahPerJam()) + ((getTotalJam()-40) * getUpahPerJam() * 1.5); 
        }
        return gajiHarian;   
    }

    @Override
    public String toString() {
        return "Pegawai Harian\t: "+super.getName()+
                "\nNo KTP\t\t: "+super.getNoKTP()+
                "\nUpah per Jam\t: "+this.getUpahPerJam()+
                "\nTotal Jam Kerja : "+this.getTotalJam()+
                "\nPendapatan\t: " + super.formatGaji(this.gaji());
    }
}