package Jul26;

public class Novel extends Book {
    String description;

    @Override
    public void bookDetails() {
        super.bookDetails();
        System.out.println(description);
    }
}
