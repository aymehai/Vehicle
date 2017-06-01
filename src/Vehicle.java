
public abstract class Vehicle {
	
	public String run(){
		return "The car is now running";
	}
	
	public String accelerate(){
		return "the car is now accelerating";
	}
	
	public String stop(){
		return "the car has now stopped"; 
	}
	
	abstract String Help();
	
}
