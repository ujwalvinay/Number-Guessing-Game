package numbergame;
import java.util.Random;     
public class randomGen 
{
	public static void main( String args[] ) {
		
		  gui frame = new gui();
	      Random rand = new Random(); //instance of random class
	      int upperbound = 25;
	        //generate random values from 0-24
	      int int_random = rand.nextInt(upperbound);
	      System.out.println(int_random);
	}

}
