package Chapter2;

public class Student {
    private String student_name;
    private int computer_grade;

    public Student() {
    }
    public Student(String student_name, int computer_grade) {
        this.student_name = student_name;
        this.computer_grade = computer_grade;
    }

    public String getName() {
        return this.student_name;
    }

    public int getAverage() {
        return this.computer_grade;
    }

    public void setGrade(int grade) {
        System.out.println("컴퓨터 점수 변경!");
        this.computer_grade = grade;
    }

}
