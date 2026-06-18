package Signin;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;
import Starting.*;



public class Sign_Up extends JFrame implements ActionListener{
	JLabel name1,name2,name3,name4,name5,name6,back_gro;
	JPanel panel;
	ImageIcon background,signPic,loginPic,hlpSupportPic;
	Font f1,f4;
	JButton button1,button2,button3, button4;
	Cursor cursor;
	
	public Sign_Up()
	{
		super("Star Cineplex");
		
		this.setSize(1100,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		panel= new JPanel();
		panel.setLayout(null);
		
		cursor = new Cursor(Cursor.HAND_CURSOR);
		f4 = new Font("Times New Roman", Font.BOLD, 18);
		
		name1 = new JLabel("GET  THE  AMAZING  EXPERIENCE");
		name1.setBounds(60,10,1000,300);
		f1 = new Font("Monotype Corsiva", Font.BOLD, 40);// (font name, font style, font size)
		name1.setFont(f1);		
		name1.setForeground(Color.WHITE); 		
		panel.add(name1);
		
		name2 = new JLabel("OF");
		name2.setBounds(350,70,1000,300);		
		name2.setFont(f1);
		name2.setForeground(Color.WHITE); 
		panel.add(name2);
		
		name3 = new JLabel("ENTERTAINMENT");
		name3.setBounds(225,120,1000,300);		
		name3.setFont(f1);
		name3.setForeground(Color.WHITE);
		panel.add(name3);
		
		name4 = new JLabel("Sign Up");
		name4.setBounds(700,450,150,50);		
		name4.setFont(f1);
		name4.setForeground(Color.WHITE);
		panel.add(name4);
		
		name5 = new JLabel("Log in");
		name5.setBounds(700,520,150,50);		
		name5.setFont(f1);
		name5.setForeground(Color.WHITE);
		panel.add(name5);
		
		name6 = new JLabel("Help & Support");
		name6.setBounds(700,590,300,50);		
		name6.setFont(f1);
		name6.setForeground(Color.WHITE);
		panel.add(name6);//hlp&support.png
		
		//button
		button1 = new JButton();
		signPic = new ImageIcon("Image/pic4.png");
		button1.setBounds(630,450,54,54);		
		button1.setIcon(signPic);
		button1.setCursor(cursor);
		button1.addActionListener(this);
		panel.add(button1);
		
		button2 = new JButton();
		loginPic = new ImageIcon("Image/pic5.png");		
		button2.setBounds(630,520,50,50);
		button2.setIcon(loginPic);
		button2.setCursor(cursor);
		button2.addActionListener(this);
		panel.add(button2);
		
		button3 = new JButton();
		hlpSupportPic = new ImageIcon("Image/hlp&support.png");		
		button3.setBounds(630,590,50,50);
		button3.setIcon(hlpSupportPic);
		button3.setCursor(cursor);
		button3.addActionListener(this);
		panel.add(button3);
		
		
		button4 = new JButton("Back");
		button4.setBounds(10,590,75,50);
		button4.addActionListener(this);
		button4.setFont(f4);
		button4.setCursor(cursor);
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false);
		button4.setForeground(Color.WHITE);
		panel.add(button4);
		
		//image
		background = new ImageIcon("Image/pic2.jpg");
		back_gro = new JLabel(background);
		back_gro.setBounds(0,0,1100,700);
		
		panel.add(back_gro);
		
		
		
		this.add(panel);
	}
	
	
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == button1){
			Sign_Up1 obj1 = new Sign_Up1();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == button2){
			LogIn obj1 = new LogIn();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == button3){
			help obj1 = new help();
			obj1.setVisible(true);
			//this.setVisible(false);
		}
		else if (ae.getSource() == button4){
			FrontPage obj1 = new FrontPage();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		
		
	}
	
}