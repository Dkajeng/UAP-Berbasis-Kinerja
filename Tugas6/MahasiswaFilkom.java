package Praktikum.Tugas6;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    //Constructor
    MahasiswaFilkom(){

    }
    MahasiswaFilkom(String name, String NIK, boolean jenisKelamin, boolean menikah, String NIM, Double IPK){
        super(name, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    //Setter Getter
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    public double getIPK() {
        return IPK;
    }
    public void setIPK(double iPK) {
        IPK = iPK;
    }

    //Method
    public double getBeasiswa(){
        double beasiswa = 0;
        if (getIPK() >= 3.5 && getIPK() < 4.0){
            beasiswa = 75;
        } else if (getIPK() >= 3.0 && getIPK() < 3.5){
            beasiswa = 50;
        }
        return beasiswa;
    }
    
    public String getStatus(){
        String angkatan = "20"+getNIM().substring(0,2);
        String prodi = "";

        if (getNIM().charAt(6) == '2') {
            prodi = "Teknik Meniup Gelembung";
        }else if (getNIM().charAt(6) == '3') {
            prodi = "Teknik Berburu Ubur Ubur";
        }else if (getNIM().charAt(6) == '4') {
            prodi = "Sistem Perhamburgeran";
        }else if (getNIM().charAt(6) == '6') {
            prodi = "Pendidikan Chum Bucket";
        }else if (getNIM().charAt(6) == '7') {
            prodi = "Teknologi Telepon Kerang";
        }

        return prodi + ", " + angkatan;
    }
    
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNIM\t\t: "+this.getNIM()+
                "\nIPK\t\t: "+this.getIPK()+
                "\nStatus\t\t: "+this.getStatus();

    }

}