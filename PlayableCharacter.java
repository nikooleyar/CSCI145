public class PlayableCharacter {
	protected String name;
	protected int level;
	protected int health;

	public PlayableCharacter(String name, int level, int health) {
		this.name = name;
		this.level = level;
		this.health = health;
	}

	public void attack() {
		System.out.println(name + " attacks!");
	}
}

class Rogue extends PlayableCharacter {
	public Rogue(String name, int level, int health) {
		super(name, level, health); //allows this to pass into the constructor of the main class
	}

	public void hide() {
		System.out.println(name + " is hiding!"); //only public attributes (name) can be inherited
	}

	@Override //allows thhis method to override the other attack() method
	public void attack() {
		System.out.println(name + " backstabs!");
	}
}
