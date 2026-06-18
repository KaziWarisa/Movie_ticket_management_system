package Admin;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; //for file 
import java.util.Scanner;

import Starting.*;
import Admin.*;


public class AdminLogin extends JFrame implements ActionListener{
    private File file;
	private Scanner sc;
	JLabel  name1 , name2, name3, name4;
    Font f1, f2;
    JTextArea adminId;
    JPasswordField password;
    JButton bt1 , backButton;
    JPanel panel;
    ImageIcon  image1 , image2, bgimage ;

      public AdminLogin(){
         super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
        
  
		
        name1 = new JLabel("Admin Login Center");
        name1.setBounds(350,30,450,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);

        image1 = new ImageIcon("Image/LoginIcon.png");
        bt1 = new JButton(image1);
        bt1.setBounds(780,395,64,64);
		bt1.addActionListener(this);
        panel.add(bt1);

       name2 = new JLabel(" Admin Login");
       name2.setBounds(850,400,300,50);
       f2 = new Font("Cambria", Font.BOLD, 30);
       name2.setFont(f2);
       name2.setForeground(Color.WHITE);
       panel.add(name2);

       name3 = new JLabel(" ADMIN ID");
       name3.setBounds(600,200,300,50);
       name3.setFont(f2);
       name3.setForeground(Color.WHITE);
       panel.add(name3); 
      
       adminId = new JTextArea();
       adminId.setBounds(750,200,250,45);
       adminId.setFont(f2);
       adminId.setForeground(Color.BLACK);
       panel.add(adminId); 

       image2 = new ImageIcon("Image/StarCineplexLogo.png");
       name3 = new JLabel(image2);
       name3.setBounds(120,200,416,203);
       panel.add(name3);


       name4 = new JLabel(" Password");
       name4.setBounds(600,300,300,50);
       name4.setFont(f2);
       name4.setForeground(Color.WHITE);
       panel.add(name4); 
      
       password = new JPasswordField();
       password.setBounds(750,300,250,45);
       password.setFont(f2);
       password.setForeground(Color.BLACK);
       panel.add(password); 
       
       backButton = new JButton("Back");
       backButton.setBounds(420,550,150,45);
       backButton.setFont(f2);
       backButton.setForeground(Color.BLACK);
	   backButton.addActionListener(this);
       panel.add(backButton); 

      
    

       bgimage = new ImageIcon("Image/oke.jpg");
       name4 = new JLabel(bgimage);
       name4.setBounds(0,0,1100,700);
       panel.add(name4);

      
        this.add(panel);

    }
    
	
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == backButton){
			FrontPage obj1 = new FrontPage();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == bt1){
			String s1,s2;
			s1=adminId.getText();	//user id
			s2=password.getText();	//pass
			if(s1.isEmpty()||s2.isEmpty()){
				JOptionPane.showMessageDialog(null,"Please enter admin's id and password");
			}
			else{
				file= new File("Data/Admin_Info.txt");
				try{
					boolean flag=false;
					sc=new Scanner(file);
					while(sc.hasNextLine()){
						String line=sc.nextLine();
						String[] value=line.split("\t");
						if(value[0].equals(s1)&&value[1].equals(s2)){
							flag=true;
							JOptionPane.showMessageDialog(null,"Welcome! Admin");
							dispose();
							Admin show = new Admin();
							show.setVisible(true);	
						}
					}
					if(flag==false){JOptionPane.showMessageDialog(null,"**Invalid Id password!**");}
				}
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
		}	
	}	
}
