public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Conan", "Doyle");
        Author author2 = new Author("Stephen", "King");

        Book book1 = new Book("The Hound of the Baskervilles.", 1901, author1);
        Book book2 = new Book("Dead zone.", 1979, author2);

        book1.setYearOfPublication(1980);
        System.out.println();

        System.out.println("Книга 1: " + book1.getTitleOfTheBook() + " Автор: " + book1.getAuthor().getFirstName());
        System.out.println();
        System.out.println("Книга 2: " + book2.getTitleOfTheBook() + " Автор: " + book2.getAuthor().getFirstName());


    }
}