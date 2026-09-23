package GameTest;

import java.util.Scanner;

public class Magician extends Character {
	private double magicCoefficient;

    public Magician() {
        super();
    }

    public Magician(String id, String name, double baseDameged, double healthPoint, Weapon weapon, double magicCoefficient) {
        super(id, name, baseDameged, healthPoint, weapon);
        this.magicCoefficient = magicCoefficient;
    }

    public double getMagicCoefficient() { return magicCoefficient; }
    public void setMagicCoefficient(double magicCoefficient) { this.magicCoefficient = magicCoefficient; }

    @Override
    public void addInfo() {
        System.out.println("\n[ADD MAGE - MAGICIAN]");
        super.addInfo();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter magic coefficient (1.0 < value <= 2.0): ");
            double value = sc.nextDouble();
			sc.nextLine();
			if (value > 1 && value <= 2.0) {
				this.setMagicCoefficient(value);
				break;
			}
			else {
				System.out.println("Wrong Value - Enter Again");
			}
        }
    }

    @Override
    public double damegedCaculate() {
        return (this.baseDameged * this.magicCoefficient) + this.weapon.getBonusDameged();
    }

    @Override
    public void attack() {
        System.out.printf("%s casts a spell using %s! Causes %.1f magic damage.\n", 
                          this.name, this.weapon.getNameWeapon(), this.damegedCaculate());
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-10s | %-15s | %-10s | %-10.1f | %-10.1f | %-25s\n", 
                this.id, this.name, "Magician", this.healthPoint, this.damegedCaculate(), 
                this.weapon.getNameWeapon() + " (+" + this.weapon.getBonusDameged() + ")");
    }
	
}
