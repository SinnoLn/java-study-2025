package homework;

public class Book implements Borrowable {
    String title;
    String author;
    int isbn;
    boolean borrowed; //대출여부

    public Book(String title, String author, int isbn,Boolean borrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = borrowed;
    }

    @Override
    public void borrowBook() {
            System.out.println(title + "를 대출합니다.");
            System.out.println(title + "가 대출되었습니다.");

    }

    @Override
    public void returnBook() {
            System.out.println(title + "을 반납합니다.");
            System.out.println(title + "이 반납되었습니다.");

    }

    public String getBookType() {
        return "도서";
    }

    public void printInfo() {
        if(borrowed) {
            //println하면 안됨
            System.out.println("[대출 중] " + getBookType() + ": \"" + title + "\" (ISBN:"
                    + isbn + ") -저자: " + author);
        }
        else {
            System.out.println("[대출 가능] " + getBookType() + ": \"" + title + "\" (ISBN:"
                    + isbn + ") -저자: " + author);
        }
    }

}
