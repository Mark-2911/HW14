import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    private int yearOfPublication;
    private final Author author;

    public Book(String titleOfTheBook, int yearOfPublication, Author author) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга 1: " + titleOfTheBook + " Автор: " + author.toString() + ". " + " Год издания " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleOfTheBook, book.titleOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, yearOfPublication, author);

    }
}

