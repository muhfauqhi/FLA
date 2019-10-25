package absent;

public class NewAbsent {
	private Absent adaptee;
	
	public NewAbsent(Absent adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public String getTimeInString(){
		int second = adaptee.getTimeAbsent().SECOND;
		return adaptee.getTimeInString() + 
				String.format(":%2d", second);
	}
	
	public void printTime(){
		adaptee.printTime();
		int second = adaptee.getTimeAbsent().SECOND;
		System.out.printf(":%2d",second);
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\n"
				+ "Time: %s\n", adaptee.getEmployeeName(), getTimeInString());
	}
	
}
