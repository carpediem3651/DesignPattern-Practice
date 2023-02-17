package Decorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ÈÖÇÎ";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
 