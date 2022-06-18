package Praktikum.Tugas7;

public abstract class Pegawai {
    private String name;
    private String noKTP;

    //Constructor
    Pegawai(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }

    //SetterGetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    //Method
    public String toString(){
        return "Nama\t\t: " + this.getName() +
        "\nNo KTP\t\t: " + this.getNoKTP();
    }

    public abstract double gaji();
    
    public String formatGaji(double gaji){
        return "Rp. " + gaji;

    }

    
}
