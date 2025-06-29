package lesson5.lab.prob2;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }


    @Override
    public void display() {
        super.display();
    }
}
