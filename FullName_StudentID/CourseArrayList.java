package FullName_StudentID;

import java.util.ArrayList;

public class CourseArrayList {
	ArrayList<Course> courseList;
	CourseArrayList(){
		courseList = new ArrayList<Course>();
	}
	public void addCourse(Course course) {
		courseList.add(course);
	}
	public void updateCourseByID(String id) {
		for(Course c : courseList) {
			if(c.getId().equals(id))
			{
				c.updateCourse();
				System.out.println("Update Completely");
				return;
			}
		}
	}
	public void deleteCourseByID(String id) {
		for(int i = 0; i<courseList.size();i++) {
			if(courseList.get(i).getId().equals(id)) {
				courseList.remove(i);
				System.out.println("Deleted");
				return;
			}
		}
	}
	void displayAll() {
		for(int i=0;i<courseList.size();i++) {
			courseList.get(i).displayDetails();
		}
	}
	void displayAvailableCourse() {
		for(int i=0;i<courseList.size();i++) {
			if(courseList.get(i).isAvailable()==true) {
				courseList.get(i).displayDetails();
			}
		}
	}
	public double caculateTotalFees() {
		double sum=0;
		for(int i=0;i<courseList.size();i++) {
			sum+= courseList.get(i).caculateTotalFee();
		}
		return sum;
	}
	
}
