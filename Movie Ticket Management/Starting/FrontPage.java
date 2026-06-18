package Starting;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;
import Starting.*;
import Admin.*;

public class FrontPage extends JFrame implements ActionListener{
    /*MD JOBAYER SHAIKH, 23-50647-1 */
    JLabel  name1 , name2 , name3 , name4 , name5 , name6 , name7;
    Font f1, f2;
    JButton bt1 , bt2 , bt3, bt4;
    JPanel panel;
    ImageIcon  image1 , image2, image3 , image4, image5 , image6;

    public FrontPage(){
        super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);

        
        panel = new JPanel();
        panel.setLayout(null);
		
        name1 = new JLabel("Welcome to Star Cineplex Ticketing System");
        name1.setBounds(135,30,850,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);

        image1 = new ImageIcon("Image/LoginIcon.png");
        bt1 = new JButton(image1);
        bt1.setBounds(800,130,64,64);
		bt1.addActionListener(this);
        panel.add(bt1);

		name2 = new JLabel(" User Login");
		name2.setBounds(870,140,200,50);
		f2 = new Font("Cambria", Font.BOLD, 30);
		name2.setFont(f2);
		name2.setForeground(Color.BLACK);
		panel.add(name2);
      
		image2 = new ImageIcon("Image/signupIcon.png");
		bt2 = new JButton(image2);
		bt2.setBounds(800,240,60,60);
		bt2.addActionListener(this);
		panel.add(bt2);

        name3 = new JLabel(" Admin");
		name3.setBounds(870,245,120,50);
		name3.setFont(f2);
		name3.setForeground(Color.BLACK);
		panel.add(name3);
       
		image3 = new ImageIcon("Image/supportIcon.png");
		bt3 = new JButton(image3);
		bt3.setBounds(800,340,60,60);
		bt3.addActionListener(this);
		panel.add(bt3);

		name4 = new JLabel(" Support");
		name4.setBounds(870,345,130,50);
		name4.setForeground(Color.BLACK);
		name4.setFont(f2);
		panel.add(name4);

       
		image4 = new ImageIcon("Image/aboutUsIcon.png");
		bt4 = new JButton(image4);
		bt4.setBounds(800,440,60,60);
		bt4.addActionListener(this);
		panel.add(bt4);

		name5 = new JLabel("Contributions");
		name5.setBounds(870,445,200,50);
		name5.setFont(f2);
		name5.setForeground(Color.BLACK);
		panel.add(name5);
      
      
		image5 = new ImageIcon("Image/StarCineplexLogo.png");
		name6 = new JLabel(image5);
		name6.setBounds(250,200,416,203);
		panel.add(name6);
        

		image6 = new ImageIcon("Image/Background_Payment.jpg");
		name7 = new JLabel(image6);
		name7.setBounds(0,0,1100,700);
		panel.add(name7);

      
        this.add(panel);

    }
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == bt1){
			Sign_Up obj1 = new Sign_Up();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == bt2){
			AdminLogin obj1 = new AdminLogin();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == bt3){
			help obj1 = new help();
			obj1.setVisible(true);
			//this.setVisible(false);
		}
		else if (ae.getSource() == bt4){
			Contribuition obj1 = new Contribuition();
			obj1.setVisible(true);
			//this.setVisible(false);
		}
	}
    
}
