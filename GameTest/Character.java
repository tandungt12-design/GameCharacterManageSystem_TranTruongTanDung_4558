package GameTest;

public class Character {
	public String name;
	public double baseDamaged;
	Character(String a, double b)
	{
		this.name= a;
		this.baseDamaged= b;
	}
	public double damagedCaculate() {
		return this.baseDamaged;
	}
	public void attack()
	{
		System.out.println(this.name+ " is attacking monster by hand that caused "+ this.damagedCaculate()+ " dameged");
	}
}
