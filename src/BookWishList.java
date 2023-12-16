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