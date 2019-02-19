// filename: JMovie.java
// author: Kadeem
// date: 2/15/19
// Graphical application that will display a movie quote. if the user wants to see which movie the quote came from, they click the button, and the movie title will display.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovie extends JFrame implements ActionListener
{
	// create the components
	JLabel quote = new JLabel("Game over man!");
	JLabel movie = new JLabel("*** Aliens (1986) ***");
	JButton button = new JButton("Show Movie");
	
	// create a constructor for the JMovie class
	public JMovie()
	{
		super("Movie Quote");
		setSize(240, 180);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(quote);
		add(button);
		add(movie);
		button.addActionListener(this);
	}
	
	// Event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		add(movie);
	}
	
	// main method to execute the application
	public static void main(String[] args)
	{
		JMovie myFrame = new JMovie();
	}
	
}