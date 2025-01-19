package Chapter2;

import Chapter2.Student;
import Chapter2.Science;

public class StudentTest {
    public static void main(String[] args) {
        Student[]  studentList = new Student[3];

        studentList[0] = new Student("짱구",25);
        studentList[1] = new Science("아름",33,89);
        studentList[2] = new Science("석찬", 59,78);

        for(int i=0; i<studentList.length; i++) {
            System.out.println("이름: " +studentList[i].getName());
            System.out.println("평균: " + studentList[i].getAverage());
            studentList[i].setGrade(50);
            System.out.println("바뀐 평균: " +studentList[i].getAverage());
            System.out.println();

        }


    }
}
