package GrapBike_Caculator_ManagementSystem;

public class Processor {
	public static void main(String[] args) {
		GrapTrip_LowerCost a = new GrapTrip_LowerCost("GR01", 10, 15000, 20);
		GrapTrip_HigherCost b = new GrapTrip_HigherCost("VIP01", 5, 20000, 50000);
		System.out.println("---Grap Trip With Lower Cost");
		a.displayInfor();
		System.out.println("---Grap Trip With Higher Cost");
		b.displayInfor();
		
	}
}
