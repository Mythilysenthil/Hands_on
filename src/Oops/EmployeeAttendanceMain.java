package Oops;

import java.time.LocalTime;

class Employe {
	private int empId;
	private String empName;
  
  public Employe(int empId,String empName) {
	  this.empId = empId;
	  this.empName = empName;
  }
  public void markCheckIn(Attendance attendance) {
	  attendance.markCheckIn();
  }
  public void markCheckOut(Attendance attendance) {
	  attendance.markCheckOut();
  }
  public int getEmpId() { 
	  return empId; 
  } 
  public String getEmpName() { 
	  return empName; 
  }
} 
  class Attendance {
	  private int empId;
	  private LocalTime checkInTime;
	  private LocalTime checkOutTime;
	  private boolean isCheckedIn = false;
	  private boolean isCheckedOut = false;
	  
	  public Attendance(int empId) {
		  this.empId = empId;
	  }
	  public void markCheckIn() {
		  if(!isCheckedIn) {
			  checkInTime = LocalTime.now();
			  isCheckedIn = true;
			  System.out.println("Check-In successfully at "+checkInTime);
		  }else {
			  System.out.println("Already Checked-In today");
		  }
	  }
	  public void markCheckOut() {
		  if(isCheckedIn && !isCheckedOut) {
			  checkOutTime = LocalTime.now();
			  isCheckedOut = true;
		  }
		  else if (!isCheckedIn) { 
			  System.out.println("Cannot check out without check-in!"); 
		  }
		  else { 
			  System.out.println("Already checked out today!"); 
		  }
	  }
	  public String getAttendanceDetails() {
		  return "Employee ID: " + empId +"\nCheck-in Time: " + (checkInTime != null ? checkInTime : "Not Checked In") + "\nCheck-out Time: " + (checkOutTime != null ? checkOutTime : "Not Checked Out");
	  }
  }

public class EmployeeAttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp = new Employe(101, "Mythily");
		Attendance attendance = new Attendance(101);
		emp.markCheckIn(attendance);
		emp.markCheckIn(attendance);
		emp.markCheckOut(attendance);
		emp.markCheckOut(attendance);
		
		System.out.println("----Attendance Summary----");
		System.out.println(attendance.getAttendanceDetails());

	}

}
