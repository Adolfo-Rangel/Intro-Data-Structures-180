import java.util.ArrayList;

import javax.swing.JOptionPane;


public class arrayex {
	 public static void main(String[] args) {
		 
		
		 ArrayList<String> shoppingList = new ArrayList<String>();
		 
		int numItems = 5;
		
		for (int i = 1; i < numItems; i++)
		{
			String input = JOptionPane.showInputDialog("enter five Items. ");
			shoppingList.add(input);
		}	
		
		String searchItems = JOptionPane.showInputDialog("Enter the item. ");
		
		
		
		boolean Items = shoppingList.contains(searchItems);
		
		if(Items)
		{
			System.out.print("List contains item. ");
		}
		
		else 
		{
			System.out.println("List does not contain item. ");
		}
		
		String removeItems = JOptionPane.showInputDialog("Which item do you want to remove? ");
		
		if(shoppingList.contains(removeItems))
		{
			shoppingList.remove(removeItems);
		}
		
		else 
		{
			System.out.println("The item does not contain in the list. ");
		}
		String addItem = JOptionPane.showInputDialog("What item do you want to add on the list ");
		
		String afterItem = JOptionPane.showInputDialog("What item do you want to add it after ");
		
		shoppingList.add(15);
	 }
}
