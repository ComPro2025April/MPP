package lesson5.lab.prob2;

public abstract class Duck implements FlyBehavior, QuackBehavior {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void display() {
        System.out.println("Displaying");
        fly();
        quack();
        swim();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
