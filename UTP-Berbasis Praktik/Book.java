package UTP;

public class Book {
    private String judul;
    private String pengarang;
    private int halaman;
    private boolean status;

    public Book(String judul, String pengarang, int halaman, boolean status){
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.status = status;
    }   

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = Boolean.parseBoolean(status);
    }
}
