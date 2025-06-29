package lesson5.lab.prob2;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        super.display();
    }
}
