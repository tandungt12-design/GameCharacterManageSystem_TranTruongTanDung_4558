package GameTest;

import java.util.Scanner;

public class Attacker extends Character {
	private double kickKnockPower;

    public Attacker() {
        super();
    }

    public Attacker(String id, String name, double baseDameged, double healthPoint, Weapon weapon, double kickKnockPower) {
        super(id, name, baseDameged, healthPoint, weapon);
        this.kickKnockPower = kickKnockPower;
    }

    public double getKickKnockPower() { return kickKnockPower; }
    public void setKickKnockPower(double kickKnockPower) { this.kickKnockPower = kickKnockPower; }

    @Override
    public void addInfo() {
        System.out.println("\n[ADD WARRIOR - ATTACKER]");
        super.addInfo();
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter kick knock power (0 < value <= 150): ");
            	double value = sc.nextDouble();
    			sc.nextLine();
    			if (value > 0 && value <= 150) {
    				this.setKickKnockPower(value);
    				break;
    			}
    			else {
    				System.out.println("Wrong Value - Enter Again");
    			}
        }
    }

    @Override
    public double damegedCaculate() {
        return this.baseDameged + this.weapon.getBonusDameged() + this.kickKnockPower;
    }

    @Override
    public void attack() {
        System.out.printf("%s swings %s powerfully! Causes %.1f physical damage.\n", 
                          this.name, this.weapon.getNameWeapon(), this.damegedCaculate());
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-10s | %-15s | %-10s | %-10.1f | %-10.1f | %-25s\n", 
                this.id, this.name, "Attacker", this.healthPoint, this.damegedCaculate(), 
                this.weapon.getNameWeapon() + " (+" + this.weapon.getBonusDameged() + ")");
    }

	
	
	
	
}
