public class Character {
	protected String name;
	protected int level;
	protected int health;

	public Character(String name, int level, int health) {
		this.name = name;
		this.level = level;
		this.health = health;
	}

	public void attack() {
		System.out.println(name + " attacks!");
	}

	/*@Override
	public String toString(); {
		return "NAME: " + name + "\nLEVEL: " + level;*/ //idk what this is supposed to do
	//}
}

class Rogue extends Character {
	private int stealth;

	public Rogue(String name, int level, int health, int stealth) {
		super(name, level, health);
		this.stealth = stealth;
	}

	public void hide() {
		System.out.println(name + " hides in the shadows! (" + stealth + ")");
	}
	
	@Override
	public void attack() {
		System.out.println(name + " backstabs!");
	}
}

class Bard extends Character {
	private String instrument;

	public Bard(String name, int level, int health, String instrument) {
		super(name, level, health);
		this.instrument = instrument;
	}

	public void playSong() {
		System.out.println(name + " plays a song on their " + instrument + ".");
	}
}
