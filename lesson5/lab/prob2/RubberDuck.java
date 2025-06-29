package lesson5.lab.prob2;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        super.display();
    }
}
