package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  //String description = "Unkown Beverage";
  
  public Mocha(Beverage b){
    this.beverage = b;
  }

  public String getDescription(){
    return beverage.getDescription() + " adding Mocha";
  }
  public double cost(){
    return beverage.cost() + .20;
  }
}