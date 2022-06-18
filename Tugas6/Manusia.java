package Praktikum.Tugas6;

public class Manusia {
    private String name;
    private String NIK;
    private boolean jenisKelamin; //True : laki-laki, False : perempuan
    private boolean menikah;

    //Constructor
    Manusia(){

    }
    
    Manusia(String name, String NIK, boolean jenisKelamin, boolean menikah){
        this.name = name;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    //Setter Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    //Method
    public double getPendapatan(){
        return getTunjangan();
    }

    public double getTunjangan(){
        double Tunjangan = 0;
        if (isMenikah()== true){
            if (isJenisKelamin() == true){
                Tunjangan = 25;
            } else {
                Tunjangan = 20;
            }
        } else {
            Tunjangan = 15;
        }
        return Tunjangan;
    }

    public String getJenisKelamin(){
        return this.isJenisKelamin() == true ? "Laki-Laki":"Perempuan";
    }

    public String toString(){ 
        return "Nama\t\t: "+this.getName()+
                "\nNIK\t\t: "+this.getNIK()+
                "\nJenis Kelamin\t: "+this.getJenisKelamin()+
                "\nPendapatan\t: "+this.getPendapatan()+"$";
}
}