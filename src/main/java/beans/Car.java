package beans;

public class Car {
	
	 private Engine engine;

	 public Car(Engine engine) {
	     this.engine = engine;
	 }

	 public void drive() {
	     System.out.println("Driving a car with a " + engine.getType() + " engine.");
	 }
	}
