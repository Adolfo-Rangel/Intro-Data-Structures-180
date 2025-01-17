
public class Appointment {

	private String name;
	private String reason;
	private int hr;
	private int min;
	private int rawTime;
	
	Appointment(String name, String reason, String time){
		this.name = name;
		this.reason = reason;
		rawTime = Integer.parseInt(time);

		hr = rawTime / 100;
		min = rawTime % 100;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getReason() {
		return reason;
	}
	
	public int getRawTime() {
		return rawTime;
	}

}
