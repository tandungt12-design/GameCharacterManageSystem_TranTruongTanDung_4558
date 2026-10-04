package TranTruongTanDung_4558;

import java.util.Scanner;

public class Magician extends Character {
	private double magicCoefficient;

	public Magician() {
		super();
		this.magicCoefficient = 0;
	}

	public Magician(String id, String name, double baseDameged, double healthPoint, String nameWeapon,
			double bonusDameged, double magicCoefficient) {
		super(id, name, baseDameged, healthPoint, nameWeapon, bonusDameged);
		this.magicCoefficient = magicCoefficient;
	}

	public double getMagicCoefficient() {
		return magicCoefficient;
	}

	public void setMagicCoefficient(double magicCoefficient) {
		this.magicCoefficient = magicCoefficient;
	}

	@Override
	public void addInfo() {
		System.out.println("\n[ADD MAGE - MAGICIAN]");
		super.addInfo();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter magic coefficient (1.0 < value <= 2.0): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 1 && value <= 2.0) {
					this.setMagicCoefficient(value);
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

	@Override
	public double damegedCaculate() {
		return (this.getBaseDameged() * this.getMagicCoefficient()) + this.getWeaponDameged();
	}

	@Override
	public void displayInfo() {
		System.out.printf("%-10s | %-15s | %-10s | %-10.1f | %-10.1f | %-25s\n", this.getId(), this.getName(),
				"Magician", this.getHealthPoint(), this.damegedCaculate(),
				this.getWeaponName() + " (+" + this.getWeaponDameged() + ")");
	}

	@Override
	public void updateInfo() {
		super.updateInfo();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter magic coefficient (1.0 < value <= 2.0): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 1 && value <= 2.0) {
					this.setMagicCoefficient(value);
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

}
