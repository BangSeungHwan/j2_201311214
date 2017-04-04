package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
    //setFlyBehavior(new FlyWithWings());
  }
  public void display(){
   System.out.println("mallard..."); 
  }
}