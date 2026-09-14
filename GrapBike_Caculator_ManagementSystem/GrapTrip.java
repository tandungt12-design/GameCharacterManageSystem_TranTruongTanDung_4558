package GrapBike_Caculator_ManagementSystem;

public class GrapTrip {
	public String code;
	public double distance;
	public double normalCost;
	GrapTrip(String a, double b, double c){
		this.code= a;
		this.distance= b;
		this.normalCost= c;
	}
	public double total()
	{
		return this.distance * this.normalCost;
	}
	public void displayInfor()
	{
		System.out.println("Ma Chuyen: "+ this.code+ " | Khoang Cach: "+ this.distance+" km | giaCoBan: "+ this.normalCost+" VND ");
		System.out.println("Tong Tien: "+ this.total()+ " VND");
	}
}
