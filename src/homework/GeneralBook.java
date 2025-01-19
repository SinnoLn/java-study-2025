package homework;

public class GeneralBook extends Book { //일반도서

    public GeneralBook(String title, String author, int isbn, boolean borrowed) {
        super(title, author, isbn, borrowed);
    }

    @Override
    public String getBookType() {
        return "일반 도서";
    }
}
