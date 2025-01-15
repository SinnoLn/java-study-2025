package homework_week2;

public class TextBook extends Book {
    TextBook(String title, String author , int isbn , boolean borrowed) {
        super(title, author, isbn, borrowed);
    }

    @Override
    public void borrowBook(){
        super.borrowBook();
        System.out.println("전공 도서 대출 이력을 남겼습니다.");
    }
    @Override
//    public String toString(){
//        String status = this.borrowed ? "[대출 가능]" : "[대출 중]";
//        return status + " 전공서적 \""+this.title+"\" 저자: "+this.author+" (ISBN:"+this.isbn+")";
//    }
    public String toString(){
        return "[전공서적]"+super.toString();
    }
}
