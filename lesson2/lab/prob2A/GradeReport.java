package lesson2.lab.prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    GradeReport(Student student) {
        this.grade = "";
        this.student = student;
    }

    //getter
    public String getGrade() {
        return grade;
    }
    //setter
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "GradeReport [grade=" + grade + "]";
    }
}
