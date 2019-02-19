// filename: FindRent.java
// author: Kadeem
// date: 2/12/19
// simple application to demonstrate multi-dimensional arrays

import javax.swing.*;

public class FindRent
{
	public static void main(String[] args)
	{
		int[][] rentArray = { {400, 450, 510},
							  {500, 560, 630},
							  {625, 676, 740},
							  {1000, 1250, 1600} };
							  
		String entry;
		int floor;
		int bedrooms;
		
		entry = JOptionPane.showInputDialog(null, "Enter a floor number from 0 to 3: ");
		floor = Integer.parseInt(entry);
		entry = JOptionPane.showInputDialog(null, "Enter the number of bedrooms (type 0 for a studio apartment): ");
		bedrooms = Integer.parseInt(entry);
		
		JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedroom apartment on floor " + floor + " is $" + rentArray[floor][bedrooms]);
		
	}
}