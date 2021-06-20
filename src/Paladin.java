import java.util.Random;

public class Paladin {
	private int strength; 
	private int dex;
	private int constitution;
	private int intel; 
	private int wisdom;
	private int charisma;

	private Random rand = new Random();
	
	public Paladin() {
		rollStats();
	}
	public void rollStats() {
		strength = rand.nextInt(16)+3;
		dex = rand.nextInt(16)+3;
		constitution = rand.nextInt(16)+3;
		intel = rand.nextInt(16)+3;
		wisdom = rand.nextInt(16)+3;
		charisma = rand.nextInt(16)+3;
		
	}
	public String toString() {
		return ("PALADIN" + "\n" + "strength: " + strength + "\nDex: " + dex + "\nConst: " + constitution + "\nIntel: " +
				intel + "\nWisdom: " + wisdom + "\nCharisma " + charisma);
	}
	public int getStrength() {
		return this.strength; 
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDex() {
		return this.dex;
	}
	
	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getConstitution() {
		return this.constitution;
	}
	
	public void setConsitution(int constitution) {
		this.constitution = constitution;
	}
	
	public int getIntel() {
		return this.intel; 
	}
	
	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWisdom() {
		return this.wisdom;
	}
	
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom; 
	}

	public int getCharisma() {
		return this.charisma;
	}
	
	public void setCharisma(int charisma) {
		this.charisma = charisma; 
	}
	
}
