package numbergame;
import javax.swing.*;  

import java.util.Random;     
public class randomGen 
{
	JFrame j=new JFrame();
	int int_random , b;
	void numbergen()
	{
	
	      Random rand = new Random(); //instance of random class
	      int upperbound = 26;
	        //generate random values from 0-25
	      int_random = rand.nextInt(upperbound);
	      System.out.println(int_random);
	}
	void userin(String n)
	{
		b=Integer.parseInt(n);
		compare();
	}
	void compare()
	{
		if(int_random==b)
			JOptionPane.showMessageDialog(j,"You won");
		else
			JOptionPane.showMessageDialog(j,"Computer's choice :"+int_random+"\nBetter luck next time");
	}
}
