package lesson9.lab.prob2;

public sealed interface Expr permits Addition, Constants, Multiplication { }
