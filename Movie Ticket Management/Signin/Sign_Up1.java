package Signin;
	
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; //for file

import Signin.*;


	
public class Sign_Up1 extends JFrame implements ActionListener{
	private File file;
	private FileWriter fwriter; //for insert
	
	
	JPanel panel;
	JLabel back_gro, title, name1, name2, name3, name4, name5, name6, name7;
	JTextField txt1, txt2, txt4, txt5, txt6;                               
	JPasswordField pf1, pf2;
	ImageIcon background;
	JButton back, sign;
	Font f1, f2, f3;
	Color color1,color2;
	public Sign_Up1(){
		
		super("Star Cineplex");
		this.setSize(1100, 700);
		//this.setBounds(500,200,1100,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		
		f1 = new Font("Times New Roman", Font.BOLD, 34);
		f2 = new Font("Times New Roman", Font.BOLD, 30);	
		color1 = new Color(176,224,230);
		color2 = new Color(128,0,128);
		
		title = new JLabel("Create an Account");
		title.setBounds(410,15,280,40);
		title.setFont(f1);
		title.setForeground(color1);
		panel.add(title);
		
		name1 = new JLabel("First Name");
		name1.setBounds(160,80,150,30);
		name1.setFont(f2);
		name1.setForeground(color1);
		panel.add(name1);
		
		txt1 = new JTextField();
		txt1.setBounds(160,120,250,40);
		txt1.setFont(f2);
		panel.add(txt1);
		
		name2 = new JLabel("Last Name");
		name2.setBounds(610,80,150,30);
		name2.setFont(f2);
		name2.setForeground(color1);
		panel.add(name2);
		
		txt2 = new JTextField();
		txt2.setBounds(610,120,250,40);
		txt2.setFont(f2);
		panel.add(txt2);
		

		name3 = new JLabel("Password");
		name3.setBounds(160,200,150,30);
		name3.setFont(f2);
		name3.setForeground(color1);
		panel.add(name3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(160,240,250,40);
		pf1.setEchoChar('*');
		pf1.setFont(f2);
		panel.add(pf1);
		
		name4 = new JLabel("Phone number");
		name4.setBounds(610,200,250,30);
		name4.setFont(f2);
		name4.setForeground(color1);
		panel.add(name4);
		
		txt4 = new JTextField();
		txt4.setBounds(610,240,250,40);
		txt4.setFont(f2);
		panel.add(txt4);
		
		
		name5 = new JLabel("User Name");
		name5.setBounds(160,320,150,30);
		name5.setFont(f2);
		name5.setForeground(color1);
		panel.add(name5);
		
		txt5 = new JTextField();
		txt5.setBounds(160,360,250,40);
		txt5.setFont(f2);
		panel.add(txt5);
		
		name6 = new JLabel("Email");
		name6.setBounds(610,320,150,30);
		name6.setFont(f2);
		name6.setForeground(color1);
		panel.add(name6);
		
		txt6 = new JTextField();
		txt6.setBounds(610,360,250,40);
		txt6.setFont(f2);
		panel.add(txt6);
		
		
		//button
		
		back = new JButton("BACK");
		back.setBounds(10,10,130,30);
		back.setFont(f2);
		back.setForeground(color2);
		back.addActionListener(this);
		panel.add(back);
		
		sign = new JButton("SIGN UP");
		sign.setBounds(420,480,180,40);
		sign.setForeground(color2);
		sign.setFont(f1);
		sign.addActionListener(this);
		panel.add(sign);
		
		
		
		background = new ImageIcon("Image/pp.jpg");
		back_gro = new JLabel(background);
		back_gro.setBounds(0,0,1100,700);
		panel.add(back_gro);
		
		this.add(panel);
	}
	
	
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == sign){
			String s1,s2,s3,s4,s5,s6;
			s1=txt1.getText();		//First name
			s2=txt2.getText();		//Last name
			s3=pf1.getText();		//pass
			s4=txt4.getText();		//phone
			s5=txt5.getText();		//user
			s6=txt6.getText();		//email
			
			if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()){
				JOptionPane.showMessageDialog(this,"Fill All");
			}
			else{
				try{
					file= new File("Data/User_Info.txt");
					file.createNewFile();
					fwriter=new FileWriter(file,true);
					fwriter.write(s5+"\t");	//username
					fwriter.write(s3+"\t");	//pass
					fwriter.write(s1+"\t");	//fast name
					fwriter.write(s2+"\t");	//last name
					fwriter.write(s4+"\t");	//phone
					fwriter.write(s6+"\n");	//email
					fwriter.flush();
					fwriter.close();
				}
				catch(IOException ioe){ioe.printStackTrace();}
				JOptionPane.showMessageDialog(null,"Sign Up Complete");
				dispose();
				LogIn obj1 = new LogIn();
				obj1.setVisible(true);
			}
		}
		else if (ae.getSource() == back){
			Sign_Up r1=new Sign_Up();
			r1.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
	
	
	
}