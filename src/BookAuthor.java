// клас де є книжки і їх автори

import java.util.Random;

class BookAuthor {
    private String Author;
    private String Book;

// тут завжди на першому місці автор книжки а дальше його книжки
    // двохвимірний масив

    String [][] books = {{"Джордж Р. Р. Мартін",   "Гра престолів", "Битва королів", "Буря мечів"},
                         {"Джоан Роулінг",         "Гаррі Поттер і філософський камінь", "Гаррі Поттер і таємна кімната", "Гаррі Поттер і в'язень Азкабан"},
                         {"Джеймс Паттерсон",      "Забуті", "Робинзон", "Перехрестя"}};


    public BookAuthor Randomizer(){
        Random random = new Random();
        int randomIndexOfAuthor = random.nextInt(books.length); // рандомний індекс автора
        int randomIndexOfBook = random.nextInt(3) + 1; // рандомний індекс книжки

        String randomAuthor = books[randomIndexOfAuthor][0]; // рандомний автор
        String randomBook = books[randomIndexOfAuthor][randomIndexOfBook]; // рандомна книжка


        // фінальний результат
        Author = randomAuthor;
        Book = randomBook;

        return this; // повертає автора і його книжку
    }

//--------------------------------------------GETTERS-----------------------------------------------

    public String getAuthor() {
        return Author;
    }

    public String getBook() {
        return Book;
    }
}