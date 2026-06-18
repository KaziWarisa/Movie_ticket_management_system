package Starting;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

	
public class Contribuition extends JFrame implements ActionListener{
	JLabel name,name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,back_gro;
	JPanel panel;
	ImageIcon background;
	Font f1,f2,f3,f4;
	JButton button1;
	Color color1,color2;
	
	public Contribuition()
	{
		super("Star Cineplex");
		
		this.setSize(900,600);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		panel= new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("CONTRIBUITION");
		name.setBounds(250,5,370,40);
		f1 = new Font("Monotype Corsiva", Font.BOLD, 45);
		name.setFont(f1);
		name.setForeground(Color.WHITE); 
		panel.add(name);		
		
		name1 = new JLabel("Sadia Islam(23-51934-2)");
		name1.setBounds(10,75,450,30);
		f2 = new Font("Monotype Corsiva", Font.BOLD, 30);
		name1.setFont(f2);
		name1.setForeground(Color.WHITE); 
		panel.add(name1);
		
		name2 = new JLabel("Sign up,");
		name2.setBounds(10,110,270,30);
		f3 = new Font("Monotype Corsiva", Font.PLAIN, 25);
		name2.setFont(f3);
		name2.setForeground(Color.WHITE); 
		panel.add(name2);
		
		name3 = new JLabel("Payment frames,Admin, I/O Files");
		name3.setBounds(10,140,320,50);		
		name3.setFont(f3);
		name3.setForeground(Color.WHITE); 
		panel.add(name3);
		
		
		name4 = new JLabel("Kazi Warisa Tabassum(23-52623-2)");
		name4.setBounds(10,190,520,30);		
		name4.setFont(f2);
		name4.setForeground(Color.WHITE); 
		panel.add(name4);
		
		name5 = new JLabel("Home pages,Interface");
		name5.setBounds(10,220,500,30);		
		name5.setFont(f3);
		name5.setForeground(Color.WHITE); 
		panel.add(name5);
		
		name6 = new JLabel("I/O files");
		name6.setBounds(10,250,390,30);
		f1 = new Font("Monotype Corsiva", Font.PLAIN, 25);
		name6.setFont(f3);
		name6.setForeground(Color.WHITE); 
		panel.add(name6);
		
		name7 = new JLabel("Tabassum Shifa,( 23-54077-3)");
		name7.setBounds(10,300,520,30);		
		name7.setFont(f2);
		name7.setForeground(Color.WHITE); 
		panel.add(name7);
		
		name8 = new JLabel("Starting page,I/O Files");
		name8.setBounds(10,330,390,30);		
		name8.setFont(f3);
		name8.setForeground(Color.WHITE); 
		panel.add(name8);
		
		name9 = new JLabel(" Tanvir Hosen Nishat,( 23-51941-2)");
		name9.setBounds(10,380,520,30);		
		name9.setFont(f2);
		name9.setForeground(Color.WHITE); 
		panel.add(name9);
		
		name10 = new JLabel("lOG in, Admin");
		name10.setBounds(10,410,390,30);		
		name10.setFont(f3);
		name10.setForeground(Color.WHITE); 
		panel.add(name10);
		
		name10 = new JLabel("Help & Support");
		name10.setBounds(10,440,390,30);		
		name10.setFont(f3);
		name10.setForeground(Color.WHITE); 
		panel.add(name10);
		
		//button
		button1 = new JButton("OK");
		button1.setBounds(400,490,70,50);
		button1.setFont(f1);
		color1 = new Color(102,0,102);
		button1.addActionListener(this);
		button1.setForeground(color1); 
		panel.add(button1);
		
		//image
		background = new ImageIcon("Image/contribuition.jpg");
		back_gro = new JLabel(background);
		back_gro.setBounds(0,0,1100,600);
		panel.add(back_gro);
	
		this.add(panel);
	
	}
	
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == button1){
			this.setVisible(false);
		}
	}





}