package Jul26;

public class Novel extends Book {
    String description ="No Description";

    public Novel()
    {
     super();
    }
    @Override
    public void bookDetails() {




        System.out.println("Upcasting");
        String x= super.author;

    }


}
