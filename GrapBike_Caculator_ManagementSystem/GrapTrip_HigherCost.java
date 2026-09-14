package GrapBike_Caculator_ManagementSystem;

public class GrapTrip_HigherCost extends GrapTrip {
	public double extraCost;
	GrapTrip_HigherCost(String a, double b , double c , double d)
	{
		super(a,b,c);
		this.extraCost= d;
	}
	public double total()
	{
		return super.total() + this.extraCost;
	}
	public void displayInfor()
	{
		super.displayInfor();
		System.out.println("After plus extra cost: "+ this.total());
	}
}
