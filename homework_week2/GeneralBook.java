package homework_week2;

public class GeneralBook extends Book{
    GeneralBook(String title, String author, int isbn, boolean borrowed) {
        super(title, author, isbn, borrowed);
    }

    @Override
    public String toString(){
        return "[일반서적]"+super.toString();
    }
}
