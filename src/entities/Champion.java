package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	
	public Champion(String name, int life, int attack, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		int damage = other.getAttack() - this.armor;
		if (damage <= 0) {
			damage = 1;
		}
		this.life = this.life - damage;
	}
	
	public String status() {
		if (life > 0) {
			return this.name +": "+ this.life +" de vida ";
		}
		else {
			life = 0;
			return this.name +": "+ this.life +" de vida (morreu)";
		}
	}
}
