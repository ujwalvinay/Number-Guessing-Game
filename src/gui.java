package numbergame;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gui extends JFrame implements ActionListener
{
	Container container = getContentPane();
	JLabel user =new JLabel("Enter your Choice : ");
	JLabel computer = new JLabel("computer choice : ");
	JTextField user_enter = new JTextField();
	JButton Enter = new JButton("Enter");
	
	String nameData,regData,markData;
	
	gui()
	{
		setTitle("Student Entry");
		setVisible(true);
		setBounds(10,10,400,600);
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
		user.setBounds(50,150,100,30);
		computer.setBounds(50,220,100,30);
		user_enter.setBounds(150,150,150,30);
		Enter.setBounds(20,370,150,30);
		
		Enter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
				{
				 String userData = user_enter.getText();
				
				}
		});;
		
		
	}
	public void addComponents()
	{
		container.add(user);
		container.add(computer);
		container.add(user_enter);
		container.add(Enter);
	}

}