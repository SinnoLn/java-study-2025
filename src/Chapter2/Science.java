package Chapter2;

public class Science extends Student {
    private int science_grade;

    public Science() {}

    public Science(String student_name, int computer_grade, int science_grade) {
        super(student_name, computer_grade);
        this.science_grade = science_grade;
    }

    public String getName() {
        return super.getName();
    }

    public int getScienceGrade() {
        return this.science_grade;
    }

    public int getAverage() {
        return (super.getAverage() + science_grade) /2;
    }

    public void setGrade(int grade) {
        System.out.println("과학 점수 변경!");
        this.science_grade = grade;
    }

}
