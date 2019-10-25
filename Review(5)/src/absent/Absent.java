package absent;

import java.util.Calendar;

public class Absent {
	private Calendar timeAbsent;
	private String employeeName;
	
	public Absent(String employeeName) {
		super();
		this.employeeName = employeeName;
	}
	public Absent() {
		
	}
	public Calendar getTimeAbsent() {
		return timeAbsent;
	}
	public void setTimeAbsent(Calendar timeAbsent) {
		this.timeAbsent = timeAbsent;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public String getTimeInString(){
		int hour = timeAbsent.HOUR;
		int minute = timeAbsent.MINUTE;
		return String.format("%2d:%2d", hour, minute);
	}
	
	public void printTime(){
		int hour = timeAbsent.HOUR;
		int minute = timeAbsent.MINUTE;
		
		System.out.printf("%2d:%2d", hour, minute);
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\n"
				+ "Time: %s\n", employeeName, getTimeInString());
	}

}
