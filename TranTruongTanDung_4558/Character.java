package TranTruongTanDung_4558;

import java.util.Scanner;

public abstract class Character implements ICharacter {
	private String id;
	private String name;
	private Weapon weapon;
	private double baseDameged;
	private double healthPoint;

	public Character() {
		this.weapon = new Weapon();
		this.id = "";
		this.name = "";
		this.baseDameged = 0;
		this.healthPoint = 0;
	}

	public Character(String id, String name, double baseDameged, double healthPoint, String nameWeapon,
			double bonusDameged) {
		this.id = id;
		this.name = name;
		this.baseDameged = baseDameged;
		this.healthPoint = healthPoint;
		weapon = new Weapon(nameWeapon, bonusDameged);
	}

	public void setUpdateWeaponName(String a) {
		this.weapon.setNameWeapon(a);
	}

	public void setUpdateWeaponDameged(double dameged) {
		this.weapon.setBonusDameged(dameged);
	}

	public double getWeaponDameged() {
		return this.weapon.getBonusDameged();
	}

	public String getWeaponName() {
		return this.weapon.getNameWeapon();
	}

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
			double value;
			try {
				value = sc.nextDouble();

				sc.nextLine();

				if (value >= 2000 && value <= 4000) {
					this.setHealthPoint(value);
					break;
				} else {
					System.out.println("Wrong value - Enter again");

				}
			} catch (Exception E) {
				System.out.println("Not identify this value - Enter again");
				sc.nextLine();
				value = 0;
			}

		}

		while (true) {
			System.out.print("Enter base damage (0 < value <= 150): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 0 && value <= 150) {
					this.setBaseDameged(value);
					break;
				} else {
					System.out.println("Wrong Value - Enter Again");
				}
			} catch (Exception E) {
				System.out.println("Not identify this value - Enter again");
				sc.nextLine();
			}

		}

		System.out.println("--- Enter Weapon Information ---");
		this.weapon.addInfo();
	}

	public void updateInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character name: ");
		this.name = sc.nextLine();

		while (true) {
			System.out.print("Enter HP (Requirement: 2000-4000): ");
			double value;
			try {
				value = sc.nextDouble();

				sc.nextLine();

				if (value >= 2000 && value <= 4000) {
					this.setHealthPoint(value);
					break;
				} else {
					System.out.println("Wrong value - Enter again");

				}
			} catch (Exception E) {
				System.out.println("Not identify this value - Enter again");
				sc.nextLine();
				value = 0;
			}

		}

		while (true) {
			System.out.print("Enter base damage (0 < value <= 150): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 0 && value <= 150) {
					this.setBaseDameged(value);
					break;
				} else {
					System.out.println("Wrong Value - Enter Again");
				}
			} catch (Exception E) {
				System.out.println("Not identify this value - Enter again");
				sc.nextLine();
			}

		}

		System.out.println("--- Enter Weapon Information ---");
		this.weapon.addInfo();
	}

	public abstract double damegedCaculate();

	public abstract void displayInfo();

}
