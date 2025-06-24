package lesson2.lecture.dependency_example;

public class RightTriangle{
    public double computeHypotenuseLength(double base, double height){
        //The class, RightTriangle uses Math class only when
        //computeHypotenuseLength() is called
        return Math.sqrt(Match.pow(base, 2) + Math.pow(height, 2));
    }
}