package lesson9.lab.prob2;

public class Main {
    public static void main(String[] args) {
        // (2+3)∗4 = 20
        Expr expr1 = new Multiplication(new Addition(new Constants(2), new Constants(3)), new Constants(4));
        System.out.println(eval(expr1));

        // (2+3)∗(4*5) = 100
        Expr expr2 = new Multiplication(new Addition(new Constants(2), new Constants(3)), new Multiplication(new Constants(4), new Constants(5)));
        System.out.println(eval(expr2));
    }

    public static int eval(Expr expr) {
        if (expr instanceof Constants constants) {
            return constants.a();
        }
        if (expr instanceof Addition addition) {
            return eval(addition.a()) + eval(addition.b());
        }
        if (expr instanceof Multiplication multiplication) {
            return eval(multiplication.a()) * eval(multiplication.b());
        }
        return 0;
    }
}
