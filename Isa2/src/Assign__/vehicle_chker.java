package Assign__;

class Vehicle {
	int horsepower;
   public Vehicle(int horsepower) {
	this.horsepower = horsepower;
   }
   public void drive() {
	   System.out.println("Vehicle is driving with " + horsepower + "horsepower.");
	   }
   }
class Car extends Vehicle {
	private int horsepower = 80;
	private String make;
	Car(String make) {
		super(50);
		this.make = make;
		}
	@Override
	public void drive() {
		super.drive();
		System.out.println("Car is driving with " + horsepower + " horsepower.");
		}
	}

public class vehicle_chker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car("Maruti Suzuki");
		myCar.drive();
		}
	}

