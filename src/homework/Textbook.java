package homework;

public class Textbook extends Book {

    public Textbook(String title, String author, int isbn, boolean borrowed) {
        super(title, author, isbn, borrowed);
    }

    @Override
    public String getBookType() {
        return "전공 도서";
    }
}
