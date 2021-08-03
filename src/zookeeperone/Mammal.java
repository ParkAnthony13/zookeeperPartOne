package zookeeperone;

public class Mammal {
	private int energyLevel;
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int change) {
		this.energyLevel += change;
	}
}
