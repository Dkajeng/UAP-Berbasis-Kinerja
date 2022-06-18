package UTP;

import java.util.ArrayList;

public class BookData {
    public static ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String judul, String pengarang, int halaman){
        Book buku = new Book(judul, pengarang, halaman, true);
        bookList.add(buku);
    }

    public void listBukunya(){
        System.out.println("--------------------------------");
        System.out.println("----------- LIST BUKU ----------");
        System.out.println("--------------------------------");
        for (Book buku : bookList){
            System.out.println("JUDUL BUKU : " + buku.getJudul());
            System.out.println("PENGARANG : " + buku.getPengarang());
            System.out.println("HALAMAN : " + buku.getHalaman());
            System.out.println("--------------------------------");
        }
    }
}
