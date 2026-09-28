package FullName_StudentID;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {
	private String platformName;
	private double discountPercent;
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public OnlineCourse(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents,
			String platformName, double discountPercent) {
		super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
		this.platformName = platformName;
		this.discountPercent = discountPercent;
	}
	public OnlineCourse(){
		
	}
	public void addCourse() {
		System.out.println("---Online Course");
		super.addCourse();
		System.out.println("PlatformName: ");
		Scanner sc = new Scanner (System.in);
		this.setPlatformName(sc.nextLine());
		System.out.println("DiscountPercent: ");
		double tamDiscount = sc.nextDouble();
		sc.nextLine();
	}
	public void updateCourse() {
		super.updateCourse();
		System.out.println("PlatformName: ");
		Scanner sc = new Scanner (System.in);
		this.setPlatformName(sc.nextLine());
		System.out.println("DiscountPercent: ");
		double tamDiscount = sc.nextDouble();
		sc.nextLine();
	}
	public double caculateTotalFee() {
		return super.getFeePerStudent() * super.getEnrolledStudents() * (1-this.getDiscountPercent()/100); 
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Platform Name: "+ this.getPlatformName()+ " | DiscountPercent: "+ this.getDiscountPercent());
		System.out.println("TotalFee: "+ this.caculateTotalFee());
	}
}
