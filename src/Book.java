import java.util.Objects;

public class Book {

    private int yearOfPublication;
    private String nameBook;
    private Author writer;

    public Book(int yearOfPublication,String nameBook,Author writer) {
        this.yearOfPublication=yearOfPublication;
        this.nameBook=nameBook;
        this.writer=writer;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getWriter() {
        return writer;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication=yearOfPublication;
    }

    @Override
    public String toString() {
        return yearOfPublication+","+nameBook+","+writer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(writer, book.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, writer);
    }
}
