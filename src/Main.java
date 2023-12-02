public class Main {
    public static void main(String[] args) {
        BookAuthor bookAuthor = new BookAuthor();
        BookWishList bookWishList = new BookWishList();

        BookAuthor author1 = bookAuthor.Randomizer();
        bookWishList.addBookToWishList(author1.Author, author1.Book);
        BookAuthor author2 = bookAuthor.Randomizer();
        bookWishList.removeBookFromWishList(author2.Author, author2.Book);
    }
}

interface BooksManager{
    void removeBookFromWishList(String author, String book);
    void addBookToWishList(String author, String book);
}

class BookWishList implements BooksManager{

    @Override
    public void removeBookFromWishList(String author, String book) {
        System.out.println("Книжка: '" + book + "' видалена з вашого списку. ЇЇ автор: " + author);
    }

    @Override
    public void addBookToWishList(String author, String book) {
        System.out.println("Книжка: '" + book + "' додана до вашого списку. ЇЇ автор: " + author);
    }
}