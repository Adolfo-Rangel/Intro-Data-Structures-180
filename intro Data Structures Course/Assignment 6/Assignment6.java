import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment6 {

	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\be\\Downloads\\DMV_Appointments.txt");
		Appointment newApp;
		String serve;
		AppointmentQueue queue = new AppointmentQueue();
		
		try 
		{
			Scanner sc = new Scanner(myFile);
			
			while (sc.hasNextLine()) 
			{
				String line = sc.nextLine();
				String[] values = line.split(",");
				newApp = new Appointment(values[0], values[1], values[2]);
				queue.push(newApp);
			}
			sc.close();
			
		} catch (FileNotFoundException e) 
		{
			System.out.println("Exception: " + e.toString());
			
			e.printStackTrace();
		}
		
		serve = queue.pop();
	
		while (!queue.isEmpty()) 
		{
			String name = JOptionPane.showInputDialog("Please enter your name");
			if (name.contentEquals(serve))
			{
				JOptionPane.showMessageDialog(null, "You are ready to be served");
				serve = queue.pop();
			}
			else 
				JOptionPane.showMessageDialog(null,"Please wait another hour");		
		}
	}

}
 // for employee

public static void main(String[] args) throws IOException {

TableEntry[] tableentries=new TableEntry[7];

HashTable table=new HashTable(7);

BufferedReader reader = new BufferedReader(new FileReader(new File(

"D:\\employee.txt")));

String line = null;

int count=0;

while ((line = reader.readLine()) != null) {

String[] words = line.split(",");

if(words.length==2)

{

if(line!=null)

{

String key=words[0];

String value=words[1];

TableEntry entry=new TableEntry(Integer.parseInt(key), value);

tableentries[count]=entry;

count++;

table.put(Integer.parseInt(key), value);

}

}

  

}

for(TableEntry entry:tableentries)

{

System.out.println(entry);

}

}