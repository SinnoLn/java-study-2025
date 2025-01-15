package homework_week2;

public class Library {
    public static void main(String[] args) {
        GeneralBook generalBook = new GeneralBook("어린왕자","생텍쥐페리",12345 , true);
        TextBook textBook = new TextBook("자바의 정석" , "남궁성" , 54321 , false);

        textBook.borrowBook();
        generalBook.borrowBook();
        textBook.returnBook();
        generalBook.returnBook();
        System.out.println(textBook.toString());
        System.out.println(generalBook.toString());
    }
}
