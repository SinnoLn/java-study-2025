public class GeneralBook extends Book {
    public GeneralBook(String title, String author, int isbn, boolean borrowed) {
        super(title, author, isbn, borrowed); // 부모 클래스 생성자 호출
    }

    @Override
    public String toString() {
        String status = this.borrowed ? "[대출 중]" : "[대출 가능]";
        return String.format("%s 일반 도서: \"%s\" (ISBN: %s) - 저자: %s", status, title, isbn, author);
    }
}