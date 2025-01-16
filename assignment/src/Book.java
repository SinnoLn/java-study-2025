public class Book implements Borrowable {
    String title;
    String author;
    int isbn;
    boolean borrowed;

    //생성자
    public Book(String title, String author, int isbn, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = borrowed;
    }

    @Override
    public void borrowBook() {
        if(borrowed) {
            System.out.println(title + "은 이미 대출 중 입니다.");
        }
        else {
            this.borrowed = true;
            System.out.println(title + "가 대출되었습니다.");
        }
    }

    @Override
    public void returnBook() {
        if(borrowed) {
            this.borrowed = false;
            System.out.println(title + "이 반납되었습니다.");
        }
        else {
            System.out.println(title + "은 대출 중이 아닙니다.");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}

