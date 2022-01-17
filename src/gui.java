package numbergame;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui extends JFrame implements ActionListener
{
	randomGen rand = new randomGen();
	Container container = getContentPane();
	JLabel banner =new JLabel("NUMBER GUESSING GAME");
	JLabel user =new JLabel("Enter Choice : ");
	JLabel computer = new JLabel("Enter a number from 1-25");
	JTextField user_enter = new JTextField();
	JButton Enter = new JButton("Enter");
	
	String nameData,regData,markData;
	
	gui()
	{
		setTitle("Main Frame");
		setVisible(true);
		setBounds(400,200,600,400);
		setDefaultCloseOperation(3);
		setResizable(false);
		setLayoutManager();
		setLocationAndSize();
		addComponents();
	}
	public void setLayoutManager()
	{
		container.setLayout(null);
	}
	public void setLocationAndSize()
	{
		banner.setBounds(40,30,500,30);
		user.setBounds(50,130,300,30);
		computer.setBounds(100,180,300,30);
		user_enter.setBounds(300,130,100,40);
		Enter.setBounds(150,250,150,30);
	
		banner.setFont(new Font("SansSerif", Font.BOLD, 35));
		
		user.setFont(new Font("Monospaced", Font.PLAIN, 25));
		
		computer.setFont(new Font("Monospaced", Font.BOLD, 20));
		
		Enter.setFont(new Font("SansSerif", Font.BOLD, 25));
		
		Enter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
				{
				 String userData = user_enter.getText();
				 rand.numbergen();
				 rand.userin(userData);
				
				}
		});;
		
		
	}
	public void addComponents()
	{
		container.add(banner);
		container.add(user);
		container.add(computer);
		container.add(user_enter);
		container.add(Enter);
	}

}
