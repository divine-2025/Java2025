package Jul26;

public class BookMain {
    public static void main(String[] args) {



        Fiction fiction = new Fiction();
        NonFiction nonFiction = new NonFiction();

        fiction.author = "George Orwell";
        fiction.price = 200;
        fiction.title = "Animal Farm";
        fiction.productionCompany = "Printing Press.Inc";
        fiction.description = "Animal Farm is a satirical allegorical novella, in the form of a beast fable, by George Orwell, first published in England on 17 August 1945";

        nonFiction.author = "John Hersey";
        nonFiction.price = 200;
        nonFiction.title = "Hiroshima";
        nonFiction.productionCompany = "Book Company";
        nonFiction.description = "it is a novel";

//        fiction.bookDetails(fiction.description);
//        fiction.bookDetails();
//        nonFiction.bookDetails(nonFiction.description);
        Book book = new Fiction();
        book.bookDetails();
    }
}
