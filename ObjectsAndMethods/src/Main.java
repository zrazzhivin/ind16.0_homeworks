public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("Война и Мир", 1900, author);

        System.out.println("Год публикации переменной book до использования сеттера:" + book.getPublicationYear());
        book.setPublicationYear(1910);
        System.out.println("Год публикации переменной book после использования сеттера:" + book.getPublicationYear());

        Author author1 = new Author("Joanne", "Rowling");
        Book book1 = new Book("Harry Potter", 2000, author1);
        System.out.println("book1, вызов .toString(): " + book1);
        System.out.println("book1, вызов .hashCode(): " + book1.hashCode());

        Author copyAuthor1 = new Author("Joanne", "Rowling");
        System.out.println("author1.equals(copyAuthor1) returns " + author1.equals(copyAuthor1));

    }
}