package FullName_StudentID;

//import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class Course {
	private String id;
	private double feePerStudent;
	private Date startDate;
	private boolean isAvailable;
	private int enrolledStudents;
	
	Course(){
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFeePerStudent() {
		return feePerStudent;
	}

	public void setFeePerStudent(double feePerStudent) {
		this.feePerStudent = feePerStudent;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(int enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	
	
	public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
		super();
		this.id = id;
		this.feePerStudent = feePerStudent;
		this.startDate = startDate;
		this.isAvailable = isAvailable;
		this.enrolledStudents = enrolledStudents;
	}
	
	public abstract double caculateTotalFee();

	void addCourse() {
		System.out.println("ID: ");
		Scanner sc = new Scanner(System.in);
		String tamID= sc.nextLine();
		this.setId(tamID);
		System.out.println("feePerStudent: ");
		double tam = sc.nextDouble();
		sc.nextLine();
		this.setFeePerStudent(tam);
		System.out.println("StartDate(DD/MM/yyyy): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String tamDate= sc.nextLine();
		try {
			this.setStartDate(sdf.parse(tamDate));
		}
		catch(Exception E)
		{
			System.out.println("Wrong value");
		}
		System.out.println("isAvailable: ");
		boolean tamAvail= sc.nextBoolean();
		this.setAvailable(tamAvail);
		System.out.println("EnrolledStudent: ");
		int tamEnrolled= sc.nextInt();
		sc.nextLine();		
	}
	void updateCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("feePerStudent: ");
		double tam = sc.nextDouble();
		sc.nextLine();
		this.setFeePerStudent(tam);
		System.out.println("StartDate(DD/MM/yyyy): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String tamDate= sc.nextLine();
		try {
			this.setStartDate(sdf.parse(tamDate));
		}
		catch(Exception E)
		{
			System.out.println("Wrong value");
		}
		System.out.println("isAvailable: ");
		boolean tamAvail= sc.nextBoolean();
		this.setAvailable(tamAvail);
		System.out.println("EnrolledStudent: ");
		int tamEnrolled= sc.nextInt();
		sc.nextLine();
	}
	void displayDetails() {
		System.out.println("ID: "+ this.getId()+" | FeePerStudent: "+ this.getFeePerStudent()+" | StartDate: "+ this.getStartDate()+" | IsAvailable: "+ this.isAvailable()+ " | EnrolledStudents: "+ this.getEnrolledStudents());
	}
	
}
