package Admin;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

import Admin.*;
	
public class Admin_passchange extends JFrame implements ActionListener{
	
	private File file;
	private Scanner sc;
	JLabel name,name1,name2,name3,back_gro;
	JPanel panel;
	JTextField txt1;
	JPasswordField txt2;
	ImageIcon background;
	Font f1,f2;
	JButton button1,button2;
	Color color1,color2;
	
	public Admin_passchange()
	{
		super("Star Cineplex");
		this.setSize(650,470);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		panel= new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("Change Admin id-password");
		name.setBounds(80,5,490,70);
		f1 = new Font("Monotype Corsiva", Font.BOLD, 45);
		name.setFont(f1);
		name.setForeground(Color.WHITE); 
		panel.add(name);
		
		name1 = new JLabel("ID          :");
		name1.setBounds(15,130,170,30);
		f2 = new Font("Monotype Corsiva", Font.BOLD, 35);
		name1.setFont(f2);
		name1.setForeground(Color.WHITE); 
		panel.add(name1);
		
		txt1 = new JTextField();
		txt1.setBounds(180,130,250,40);
		txt1.setFont(f2);
		panel.add(txt1);
		
		name2 = new JLabel("Password :");
		name2.setBounds(15,193,170,30);
		f2 = new Font("Monotype Corsiva", Font.BOLD, 35);
		name2.setFont(f2);
		name2.setForeground(Color.WHITE); 
		panel.add(name2);
		
		txt2 = new JPasswordField();
		txt2.setBounds(180,190,250,40);
		txt2.setFont(f2);
		panel.add(txt2);
		
		//button
		button1 = new JButton("Back");
		button1.setBounds(400,350,150,50);
		button1.setFont(f2);
		button1.addActionListener(this);		
		panel.add(button1);
		
		
		button2 = new JButton("Confirm!");
		button2.setBounds(100,350,190,50);
		button2.setFont(f2);
		button2.addActionListener(this);
		panel.add(button2);
		
		//image
		background = new ImageIcon("Image/admin.jpg");
		back_gro = new JLabel(background);
		back_gro.setSize(650,470);
		panel.add(back_gro);
	
		this.add(panel);
	}
	public void actionPerformed(ActionEvent e){

		if(e.getSource()== button1){
			Admin show = new Admin();
			show.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()== button2){
			String s1,s2;
			s1=txt1.getText();	//user id
			s2=txt2.getText();	//pass
			if(s1.isEmpty()||s2.isEmpty()){
				JOptionPane.showMessageDialog(null,"Please enter admin's id and password");
			}
			else{
				String adminFile = "Data/Admin_Info.txt";
                File oldFile = new File(adminFile);
                oldFile.delete();
                File dump = new File(adminFile);
				
				try {

					FileWriter fw = new FileWriter(adminFile, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					pw.print(s1+"\t");
					pw.println(s2);
					pw.flush();
					pw.close();
					bw.close();
					fw.close();

					JOptionPane.showMessageDialog(null, "Admin Name and Password has been changed.","Admin Passowrd", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					Admin obj1 = new Admin();
					obj1.setVisible(true);

                    }
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
		}
	}
	
}