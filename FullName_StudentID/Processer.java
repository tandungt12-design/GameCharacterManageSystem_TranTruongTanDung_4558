package FullName_StudentID;

import java.util.Scanner;

public class Processer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseArrayList courseList = new CourseArrayList();
		Course course1 = new OfflineCourse(
			    "CMU-CS 252",               // id
			    1500000.0,                  // feePerStudent
			    java.sql.Date.valueOf("2026-10-15"), // startDate (Năm-Tháng-Ngày)
			    true,                       // isAvailable
			    35,                         // enrolledStudents
			    "Phòng A101",               // classroomNumber
			    50000.0                     // materialFeePerStudent
			);
		OfflineCourse course2 = new OfflineCourse(
			    "CMU-CS 311",               // id
			    1800000.0,                  // feePerStudent
			    java.sql.Date.valueOf("2026-11-20"), // startDate
			    false,                      // isAvailable
			    40,                         // enrolledStudents
			    "Phòng B205",               // classroomNumber
			    75000.0                     // materialFeePerStudent
			);
		OfflineCourse course3 = new OfflineCourse(
			    "ENG-101",                  // id
			    1200000.0,                  // feePerStudent
			    java.sql.Date.valueOf("2026-12-05"), // startDate
			    true,                       // isAvailable
			    25,                         // enrolledStudents
			    "Phòng C302",               // classroomNumber
			    45000.0                     // materialFeePerStudent
			);
		OnlineCourse online3 = new OnlineCourse(
			    "ONL-DB301",                // id
			    900000.0,                   // feePerStudent
			    java.sql.Date.valueOf("2026-12-01"), // startDate
			    false,                      // isAvailable
			    200,                        // enrolledStudents
			    "Microsoft Teams",          // platformName
			    15.0                        // discountPercent (Giảm 15%)
			);
		
		
		courseList.addCourse(course1);
		courseList.addCourse(course2);
		courseList.addCourse(course3);
		courseList.addCourse(online3);
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("| 1. Add Online Course            |");
			System.out.println("| 2. Add Offline Course           |");
			System.out.println("| 3. Update Course                |");
			System.out.println("| 4. Display All Course           |");
			System.out.println("| 5. Deleted Course               |");
			System.out.println("| 6. Display Availble Course      |");
			System.out.println("| 7. Caculate Total Fee           |");
			System.out.println("------------------------------------");
			System.out.println("Choice: ");
			int choice;
			try {
				choice = sc.nextInt();
				sc.nextLine();
			}
			catch(Exception E) {
				System.out.println("Wrong Value - Enter a nuber");
				sc.nextLine();
				choice = -2;
			}
			
			
			switch (choice) {
			case 1:
				Course offline = new OfflineCourse();
				offline.addCourse();
				courseList.addCourse(offline);
				break;
			case 2:
				Course online = new OnlineCourse();
				online.addCourse();
				courseList.addCourse(online);
				break;
			case 3:
				System.out.println("Enter ID to update: ");
				String id = sc.nextLine();
				courseList.updateCourseByID(id);
				break;
			case 4:
				courseList.displayAll();
				break;
			case 5: 
				System.out.println("Enter ID to deleted: ");
				String idDeleted = sc.nextLine();
				courseList.deleteCourseByID(idDeleted);
				break;
			case 6:
				courseList.displayAvailableCourse();
				break;
			case 7: 
				courseList.caculateTotalFees();break;
			default: 
				System.out.println("Wrong value");
			}

		}
	}
}
