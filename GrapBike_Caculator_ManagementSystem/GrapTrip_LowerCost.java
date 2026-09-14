package GrapBike_Caculator_ManagementSystem;

public class GrapTrip_LowerCost extends GrapTrip {
	public double voucher;
	GrapTrip_LowerCost(String a, double b, double c, double d)
	{
		super(a,b,c);
		this.voucher= d/100;
	}
	public double total()
	{
		double total = super.total();
		return total - (total * voucher);
	}
	public void displayInfor()
	{
		super.displayInfor();
		System.out.println("After assign voucher: "+ this.total() + " VND");
	}
}
