package UTP;

public class BookRent {
    private BookReader reader;
    private Book book;
    private int rentDur;

    public BookRent(BookReader reader, Book book, int rentDur){
        this.reader = reader;
        this.book = book;
        this.rentDur = rentDur;
    }

    public BookReader getReader() {
        return reader;
    }

    public Book getBook() {
        return book;
    }

    public int getRentDur() {
        return rentDur;
    }
}
