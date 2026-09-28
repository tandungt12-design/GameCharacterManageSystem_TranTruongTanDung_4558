package FullName_StudentID;

import java.util.Date;
import java.util.Scanner;

public class OfflineCourse extends Course {
	private String classroomNumber;
	private double materialFeePerStudent;
	public String getClassroomNumber() {
		return classroomNumber;
	}
	public void setClassroomNumber(String classroomNumber) {
		this.classroomNumber = classroomNumber;
	}
	public double getMaterialFeePerStudent() {
		return materialFeePerStudent;
	}
	public void setMaterialFeePerStudent(double materialFeePerStudent) {
		this.materialFeePerStudent = materialFeePerStudent;
	}
	
	public OfflineCourse(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents,String classroomNumber,double materialFeePerStudent ) {
		super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
		this.classroomNumber= classroomNumber;
		this.materialFeePerStudent= materialFeePerStudent;
		// TODO Auto-generated constructor stub
	}
	OfflineCourse(){
		
	}
	@Override
	void addCourse() {
		
		super.addCourse();
		System.out.println("classroomNumer: ");
		Scanner sc= new Scanner(System.in);
		String tamnumber = sc.nextLine();
		this.setClassroomNumber(tamnumber);
		System.out.println("MaterialFeePerStudent: ");
		double tamFee= sc.nextDouble();
		sc.nextLine();
		this.setFeePerStudent(tamFee);
	}
	@Override
	void updateCourse() {
		// TODO Auto-generated method stub
		super.updateCourse();
		System.out.println("classroomNumer: ");
		Scanner sc= new Scanner(System.in);
		String tamnumber = sc.nextLine();
		this.setClassroomNumber(tamnumber);
		System.out.println("MaterialFeePerStudent: ");
		double tamFee= sc.nextDouble();
		sc.nextLine();
		this.setFeePerStudent(tamFee);
	}
	public double caculateTotalFee() {
		return super.getFeePerStudent() + this.getMaterialFeePerStudent() * this.getEnrolledStudents();
	}
	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("ClassroomNumber: "+ this.getClassroomNumber()+ " | MaterialFeePerStudent: "+ this.getMaterialFeePerStudent());
		System.out.println("TotalFee: "+ this.caculateTotalFee());
	}
	

}
