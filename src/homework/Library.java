package homework;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.title + "이(가) 도서 목록에 추가되었습니다.");
    }

    public void removeBook(String title) {
        for(Book book : books) {
            if(book.title.equals(title)) {
                books.remove(book);
                System.out.println(title + " 이(가) 도서 목록에서 삭제되었습니다.");
            }
            System.out.println(title + " 책을 찾을 수 없습니다.");

        }

    }

    public void printBooks() {
        System.out.println("현재 도서 목록: ");
        for(int i=0; i<books.size(); i++) {
            System.out.print((i+1) + ". ");
            books.get(i).printInfo();
        }
    }


}
