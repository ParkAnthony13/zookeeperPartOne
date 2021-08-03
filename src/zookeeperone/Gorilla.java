package zookeeperone;

public class Gorilla extends Mammal{

	public Gorilla() {
//		this.energyLevel = 100;
		this.setEnergyLevel(50);
	}
	public void throwSomething() {
		System.out.println("Gorrilla throws banana peel");
//		this.energyLevel -= 5;
		this.setEnergyLevel(-5);
	}
	public void eatBananas() {
		System.out.println("Yum");
//		this.energyLevel += 10;
		this.setEnergyLevel(10);
	}
	public void climb() {
		System.out.println("Gorrilla climbs tree");
//		this.energyLevel -= 10;
		this.setEnergyLevel(-10);
	}
}
