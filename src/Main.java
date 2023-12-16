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