package GameTest;

import java.util.Scanner;

public class Weapon {
	private String nameWeapon;
	private double bonusDameged;

	public Weapon() {

	}

	public Weapon(String nameWeapon, double bonusDameged) {
		this.nameWeapon = nameWeapon;
		this.bonusDameged = bonusDameged;
	}

	public String getNameWeapon() {
		return nameWeapon;
	}

	public void setNameWeapon(String nameWeapon) {
		this.nameWeapon = nameWeapon;
	}

	public double getBonusDameged() {
		return bonusDameged;
	}

	public void setBonusDameged(double bonusDameged) {
		this.bonusDameged = bonusDameged;
	}

	public void addInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weapon name: ");
		this.nameWeapon = sc.nextLine();

		while (true) {
			System.out.print("Enter bonus damage (0 < value <= 150): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 0 && value <= 150) {
					this.setBonusDameged(value);
					break;
				} else {
					System.out.println("Wrong Value - Enter Again");
				}

			} catch (Exception E) {
				System.out.println("Not identify this value - Enter again");
				sc.nextLine();
			}

		}
	}

	public void displayInfo() {
		System.out.printf("Weapon: %s (+%.1f DMG)", this.getNameWeapon(), this.getBonusDameged());
	}
}
