public class TextBook extends Book {
    public TextBook(String title, String author, int isbn, boolean borrowed) {
        super(title, author, isbn, borrowed);
    }

    @Override
    public String toString() {
        String status = borrowed ? "[대출 중]" : "[대출 가능]";
        return String.format("%s 전공 도서: \"%s\" (ISBN: %s) - 저자: %s", status, title, isbn, author);
    }

    @Override
    public void borrowBook() {
        if (!borrowed) {
            super.borrowBook();
            System.out.println("전공 도서 대출 기록을 남겼습니다.");
        } else {
            System.out.println(title + "은 이미 대출 중입니다.");
        }
    }
}
