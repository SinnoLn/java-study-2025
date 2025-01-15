package homework_week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void BookListUp(){
        System.out.println("********************[책 목록]********************");
        for(int i = 0 ; i < this.books.size() ; i++){
            System.out.println((i+1)+"."+this.books.get(i).toString());
        }
    }

    public void BorrowBook(int index){
        if(!this.books.get(index).isBorrowed()) {
            this.books.get(index).borrowBook();
        }else{
            System.out.println("책을 빌릴 수 없습니다.");
        }
    }

    public void ReturnBook(int index){
        if(this.books.get(index).isBorrowed()) {
            this.books.get(index).returnBook();
        }else{
            System.out.println("책을 반납할 수 없습니다.");
        }
    }

    public void RemoveBook(int index){
        if(!this.books.get(index).isBorrowed()) {
            books.remove(index);
        }else{
            System.out.println("책이 반납되어야 삭제할 수 있습니다.");
        }
    }

    public void AddBook(Book book){
        this.books.add(book);
    }

    public void SearchTitle(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                System.out.println("책이 발견되었습니다");
                System.out.println( i + 1 + ". " + this.books.get(i).toString());
                return; // 책을 찾으면 메서드 종료
            }
        }
        System.out.println("책을 찾을 수 없습니다.");
    }

    public void SearchISBN(int isbn){
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getISBN() == isbn) {
                System.out.println("책이 발견되었습니다");
                System.out.println( i + 1 + ". " + this.books.get(i).toString());
                return; // 책을 찾으면 메서드 종료
            }
        }
        System.out.println("책을 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner in = new Scanner(System.in);

        library.books.add(new GeneralBook("어린왕자","생텍쥐페리",12345 , false));
        library.books.add(new GeneralBook("책먹는여우","김범수",33456,true));
        library.books.add(new GeneralBook("자바의 정석" , "남궁성" , 54321 , false));
        library.books.add(new GeneralBook("파이썬의 정석" , "python" , 27527 , true));

        while(true) {
            CommandNotice();
            String command = in.nextLine().toLowerCase();

            switch (command) {
                case "q":
                    System.out.println("종료합니다.");
                    return;
                case "l":
                    library.BookListUp();
                    break;
                case "b":
                    System.out.println("빌릴 책의 index를 입력해주세요");
                    int borrowIndex = in.nextInt()-1;
                    in.nextLine();
                    library.BorrowBook(borrowIndex);
                    break;
                case "r":
                    System.out.println("반납할 책의 index를 입력해주세요");
                    int returnIndex = in.nextInt()-1;
                    in.nextLine();
                    library.ReturnBook(returnIndex);
                    break;
                case "d":
                    // 책 삭제 로직
                    System.out.println("삭제할 책의 index를 입력해주세요");
                    int removeIndex = in.nextInt()-1;
                    in.nextLine();
                    library.RemoveBook(removeIndex);
                    break;
                case "a":
                    // 책 추가 로직
                    Book newBook = makeBook();
                    library.AddBook(newBook);
                    break;
                case "t":
                    //제목으로 책을 찾는 로직
                    System.out.println("책의 제목을 입력해주세요");
                    String title = in.nextLine();
                    library.SearchTitle(title);
                    break;
                case "i":
                    //ISBN으로 책을 찾는 로직
                    System.out.println("책의 ISBN 번호를 입력해주세요");
                    int isbn = in.nextInt();
                    in.nextLine();
                    library.SearchISBN(isbn);
                    break;
                default:
                    System.out.println("잘못된 명령어를 입력하였습니다.");
                    break;

            }
        }
    }
    
    public static void CommandNotice(){
        System.out.println("**********************[명령어 리스트]**********************");
        System.out.println("종료를 원하면 \"Q,q\"          책 목록 조회를 원하면 \"L,l\"");
        System.out.println("책 대출을 원하면 \"B,b\"       책 반납을 원하면 \"R,r\"");
        System.out.println("책 삭제을 원하면 \"D,d\"       책 추가를 원하면 \"A,a\"");
        System.out.println("책제목으로 검색을 원하면 \"T,t\" ISBN으로 책 검색을 원하면 \"I,i\"");
    }
    
    public static Book makeBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("책 제목을 입력해주세요");
        String title = in.nextLine();
        System.out.println("책 저자를 입력해주세요");
        String author = in.nextLine();
        System.out.println("책의 ISBN을 입력해주세요");
        int isbn = in.nextInt();
        in.nextLine();
        System.out.println("책이 전공서적이면 1, 일반서적이면 이외의 값을 입력해주세요");
        int isText = in.nextInt();
        in.nextLine();

        if(isText == 1){
            return new TextBook(title , author,isbn,false);
        }else{
            return new GeneralBook(title, author, isbn, false);
        }
    }
}
