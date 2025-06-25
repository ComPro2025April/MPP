package lesson2.lab.prob2A;

public class Student {
    private String name;
    private GradeReport gradeReport;

    public Student(String name) {
        this.name = name;
        this.gradeReport = new GradeReport(this);
    }

    //getter
    public String getName() {
        return name;
    }
    public GradeReport getGradeReport() {
        return gradeReport;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student " + getName() + " has " + getGradeReport().toString();
    }
}
