package Praktikum.Tugas6;

public class Manajer extends Pekerja{
    private int lamaKerja;
    
    //Constructor
    Manajer(int jamKerja, int hariKerja, String NIP, String name, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, name, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    //SetterGetter
    public int getLamaKerja(){
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja){
        this.lamaKerja = lamaKerja;
    }

    //Method
    @Override
    public double getTunjangan() {
        return super.getTunjangan()+15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + (super.getBonus()*0.3);
    }

    @Override
    public double getPendapatan() {
        return this.getTunjangan()+super.getGaji()+this.getBonus();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLama Kerja\t: "+this.getLamaKerja();
    }
}
