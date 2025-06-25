package lesson2.lab.prob2A.ext;

import lesson2.lab.prob2A.GradeReport;
import lesson2.lab.prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Orgil");
        GradeReport gradeReport = student.getGradeReport();
        gradeReport.setGrade("A");

        System.out.println(student);
    }
}
