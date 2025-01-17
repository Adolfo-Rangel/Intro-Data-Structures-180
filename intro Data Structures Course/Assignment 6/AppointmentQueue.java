
public class AppointmentQueue {
	
	private Appointment[] appQueue;
	private int sizeQueue;
	private int tailIndex;
	
	AppointmentQueue() {
		sizeQueue = 5;
		appQueue = new Appointment[sizeQueue];
		tailIndex = 0;
	}
	
	public void push(Appointment newAppoint) {
		int newAppTime = newAppoint.getRawTime();
		boolean addNew = false;
		
		if (tailIndex != appQueue.length - 1) 
		{
			for (int i = 0; i < tailIndex; ++i) 
			{
				if (newAppTime < appQueue[i].getRawTime()) 
				{
					for (int j = i; j < tailIndex; ++j)
					{
						appQueue[j + 1] = appQueue[j];
					}
					appQueue[i] = newAppoint;
					++tailIndex;
					addNew = true;
					break;
				}
			}
			if (!addNew) 
			{
				appQueue[tailIndex] = newAppoint;
				++tailIndex;
			}
		}
		else 
		{
			sizeQueue *= 2;
			Appointment[] tempQueue = new Appointment[sizeQueue];
			
			for (int i = 0; i < appQueue.length; ++i) 
			{
				tempQueue[i] = appQueue[i];
			}
			appQueue = tempQueue;
			push(newAppoint);
		}
	}
	
	public String pop() {
		String servName = appQueue[0].getName();
		for(int i = 0; i < tailIndex; ++i)
		{
			appQueue[i] = appQueue[i + 1];
		}
		--tailIndex;
		return servName;
	}
	
	public boolean isEmpty() {
		if (tailIndex == 0)
			return true;
		else
			return false;
	}
}
