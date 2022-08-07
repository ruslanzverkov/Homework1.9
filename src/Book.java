public class Book {

    int yearOfPublication;
    String nameBook;
    Author writer;

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
}
