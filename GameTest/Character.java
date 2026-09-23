package GameTest;

import java.util.Scanner;

public abstract class Character implements ICharacter {
	protected String id;
	protected String name;
	protected Weapon weapon;
	protected double baseDameged;
	protected double healthPoint;

	// 2. Constructors
	public Character() {
		this.weapon = new Weapon(); // Ensure the weapon object always exists
	}

	public Character(String id, String name, double baseDameged, double healthPoint, Weapon weapon) {
		this.id = id;
		this.name = name;
		this.baseDameged = baseDameged;
		this.healthPoint = healthPoint;
		this.weapon = weapon;
	}

	// 3. Getters / Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public double getBaseDameged() {
		return baseDameged;
	}

	public void setBaseDameged(double baseDameged) {
		this.baseDameged = baseDameged;
	}

	public double getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(double healthPoint) {
		this.healthPoint = healthPoint;
	}

	@Override
	public void addInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter character ID: ");
		this.id = sc.nextLine();

		System.out.print("Enter character name: ");
		this.name = sc.nextLine();

		while (true) {
			System.out.print("Enter HP (Requirement: 2000-4000): ");
			double value = sc.nextDouble();
			sc.nextLine();
			if (value >= 2000 && value <= 4000) {
				this.setHealthPoint(value);
				break;
			}
			else {
				System.out.println("Wrong Value - Enter Again");
			}
		}

		while (true) {
			System.out.print("Enter base damage (0 < value <= 150): ");
			double value = sc.nextDouble();
			sc.nextLine();
			if (value > 0 && value <= 150) {
				this.setBaseDameged(value);
				break;
			}
			else {
				System.out.println("Wrong Value - Enter Again");
			}
		}

		System.out.println("--- Enter Weapon Information ---");
		this.weapon.addInfo();
	}

	public abstract double damegedCaculate();
	public abstract void displayInfo();
	public abstract void attack();

}
