package zookeepertwo;
import zookeeperone.Mammal;

public class Bat extends Mammal{

	public Bat() {
		this.setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("Fwoosh");
		this.setEnergyLevel(-50);
	}
	public void eatHumans() {
		this.setEnergyLevel(25);
	}
	public void attackTown() {
		System.out.println("AHHHHHHHHHHHHHHHHHHHHHHHH");
		this.setEnergyLevel(-100);
	}
}
