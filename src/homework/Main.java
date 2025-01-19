package homework;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book book1 = new GeneralBook("어린왕자","생텍쥐페리",12345,false);
        Book book2 = new Textbook("자바의 정석","남궁성",54321,true);

        lib.addBook(book1);
        lib.addBook(book2);

        lib.printBooks();
        System.out.println();

        System.out.println("도서 목록");
        System.out.print("1. ");
        book1.printInfo();
        System.out.print("2. ");
        book2.printInfo();
        System.out.println();

        book1.borrowBook();
        System.out.println();
        book2.returnBook();
        System.out.println();

        lib.removeBook("어린왕자");
        lib.printBooks();
        System.out.println();
        lib.removeBook("파이썬의 정석");
    }
}
