package UTP;

import java.util.ArrayList;

public class RentArchive {
    private ArrayList<BookRent> rentData = new ArrayList<>();

    public void Rent(BookReader reader, Book book, int rentDur){
        BookRent bRent = new BookRent(reader, book, rentDur);

        if(book.isStatus() == true){
            System.out.println("BUKU BERHASIL DIPINJAM");
            rentData.add(bRent);
            book.setStatus(String.valueOf(false));
        } else {
            System.out.println("MAAF, BUKU SUDAH DIPINJAM");
        }
    }

    public void Info(){
        System.out.println("-----------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-----------------------");
        for (BookRent rent : rentData){
            System.out.println("NAMA PELANGGAN : "+rent.getReader().getName());
            System.out.println("JUDUL BUKU     : "+rent.getBook().getJudul());
            System.out.println("PENGARANG      : "+rent.getBook().getPengarang());
            System.out.println("LAMA PINJAM    : "+rent.getRentDur() + " Hari");
            System.out.println("-----------------------");
        }

    }
}
