package GameTest;

import java.util.Scanner;

public class Attacker extends Character {
	private double kickKnockPower;

	public Attacker() {
		super();
		this.kickKnockPower=0;
	}

	public Attacker(String id, String name, double baseDameged, double healthPoint, String nameWeapon,
			double bonusDameged, double kickKnockPower) {
		super(id, name, baseDameged, healthPoint, nameWeapon, bonusDameged);
		this.kickKnockPower = kickKnockPower;
	}

	public double getKickKnockPower() {
		return kickKnockPower;
	}

	public void setKickKnockPower(double kickKnockPower) {
		this.kickKnockPower = kickKnockPower;
	}

	@Override
	public void addInfo() {
		System.out.println("\n[ADD WARRIOR - ATTACKER]");
		super.addInfo();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter kick knock power (0 < value <= 150): ");
			try {
				double value = sc.nextDouble();
				sc.nextLine();
				if (value > 0 && value <= 150) {
					this.setKickKnockPower(value);
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
		return this.getBaseDameged() + this.getWeaponDameged() + this.getKickKnockPower();
	}

	@Override
	public void displayInfo() {
		System.out.printf("%-10s | %-15s | %-10s | %-10.1f | %-10.1f | %-25s\n", this.getId(), this.getName(), "Attacker",
				this.getHealthPoint(), this.damegedCaculate(),
				this.getWeaponName() + " (+" + this.getWeaponDameged() + ")");
	}

	

}
