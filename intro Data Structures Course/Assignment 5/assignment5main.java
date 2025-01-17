import java.util.Stack;
import javax.swing.JOptionPane;

public class assignment5main {

	public static String getInputWord()
	{
		String input = JOptionPane.showInputDialog("Please enter Palindrome ");
		return input;
	
	}
	
	public static boolean palindromeCheck(String str)
	{
		Stack<Character> myStack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++)
		{
			myStack.push(str.charAt(i));
		}
		
		String reverse = "";
		
		while(!myStack.isEmpty())
		{
			reverse = reverse+myStack.pop();	
		}
		
		if (str.equals(reverse))
		
			return true;
		
		else
				
			return false;
		}
	
	public static void main(String[] args) {
		String input = getInputWord();
		
		boolean result = palindromeCheck(input);
		
		if(result)
			
			JOptionPane.showMessageDialog(null,"Given string is palindrome.");  
		
		else 
			
			JOptionPane.showMessageDialog(null,"Given string is not palindrome.");

	}
}
