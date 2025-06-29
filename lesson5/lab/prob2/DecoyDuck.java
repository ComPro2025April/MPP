package lesson5.lab.prob2;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        super.display();
    }
}
