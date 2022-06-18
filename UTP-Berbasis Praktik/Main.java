package UTP;

public class Main {
    public static void main(String[] args) {
        
        BookReader Ajeng = new BookReader("Ajeng", 19, "08182737389");
        BookReader Nazwa = new BookReader("Nazwa", 18, "08182798944");
        BookReader Putri = new BookReader("Putri", 17, "08182192108");
        BookReader Bila = new BookReader("Bila", 19, "08182732972");

        BookData info = new BookData();
        info.addBook("Belajar Pyhton", "Dr.Jublis", 125);
        info.addBook("Belajar Java", "Prof.Dr.Jambira", 100);
        info.addBook("Belajar SQL", "Dr.Bandana", 190);
        info.addBook("Belajar C++", "Dr.Once", 115);

        info.listBukunya();

        RentArchive archive = new RentArchive();
        archive.Rent(Ajeng, BookData.bookList.get(2), 5);
        archive.Rent(Nazwa, BookData.bookList.get(1), 1);
        archive.Rent(Putri, BookData.bookList.get(3), 4);
        archive.Rent(Bila, BookData.bookList.get(2), 6);

        archive.Info();
    }
}
