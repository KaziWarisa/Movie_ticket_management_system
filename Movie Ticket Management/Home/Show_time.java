package Home;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;
import Starting.*;
	
public class Show_time extends JFrame implements ActionListener{
	
	JPanel panel;
	JLabel back_gro, upper_Line, image_1, name1, name2, name3, name4, t1, t2, t3, t4, t5, t6, t7, t8 ,t9, t10,t11, t12, t13 , t14, t15,
					t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27,t28, t29, t30, t31, t32, t33, t34, t35, t36, t37;
	ImageIcon background, upperLine, image1;
	JButton showing, up_coming, buy_ticket, show_time ,log_out ,help_support ,x_solve_error;
	Color color1, color2, color3;
	Font f0, f1, f2, f3, f4, f5;
	Cursor cursor;
	
	

	public Show_time(){
		
		super("Star Cineplex");
		this.setSize(1100, 700);
		//this.setBounds(500,200,1100,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);


		f0 = new Font("Britannic Bold", Font.BOLD + Font.ITALIC, 26);
		f1 = new Font("Monotype Corsiva", Font.BOLD + Font.ITALIC, 26);
		f2 = new Font("Monotype Corsiva",  Font.ITALIC, 20);
		f3 = new Font("Monotype Corsiva",  Font.ITALIC, 18);
		f4 = new Font("Times New Roman", Font.BOLD, 24);
		f5 = new Font("Times New Roman",Font.ITALIC, 20);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		color1 = new Color(69,25,61);
		color2 = new Color(255,253,208);
		color3 = new Color(178,102,255);
		
		
		//Buttons
		
		
		x_solve_error = new JButton();
		x_solve_error.setBounds(0,0,0,0);
		panel.add(x_solve_error);
			
		showing = new JButton("Now Showing");
		showing.setBounds(20,15,180,50);
		showing.setFont(f1);
		showing.setCursor(cursor);
		showing.setBackground(color1);
		showing.setForeground(Color.WHITE);
		showing.setBorder(BorderFactory.createEmptyBorder());
		showing.addActionListener(this);
		panel.add(showing);
		
		
		up_coming = new JButton("Up Coming");
		up_coming.setBounds(210,15,150,50);
		up_coming.setFont(f1);
		up_coming.setCursor(cursor);
		up_coming.setBackground(color1);
		up_coming.setForeground(Color.WHITE);
		up_coming.setBorder(BorderFactory.createEmptyBorder());
		up_coming.addActionListener(this);
		panel.add(up_coming);
		
		
		buy_ticket = new JButton("Buy Ticket");
		buy_ticket.setBounds(370,15,150,50);
		buy_ticket.setFont(f1);
		buy_ticket.setCursor(cursor);
		buy_ticket.setBackground(color1);
		buy_ticket.setForeground(Color.WHITE);
		buy_ticket.setBorder(BorderFactory.createEmptyBorder());
		buy_ticket.addActionListener(this);
		panel.add(buy_ticket);
		
		
		show_time = new JButton("Show Time");
		show_time.setBounds(530,15,150,50);
		show_time.setFont(f0);
		show_time.setCursor(cursor);
		show_time.setBackground(color1);
		show_time.setForeground(Color.WHITE);
		show_time.setBorder(BorderFactory.createEmptyBorder());
		show_time.addActionListener(this);
		panel.add(show_time);
		
		
		log_out = new JButton("Log Out");
		log_out.setBounds(1000,5,62,30);
		log_out.setFont(f2);
		log_out.setCursor(cursor);
		log_out.setBackground(color1);
		log_out.setForeground(Color.WHITE);
		log_out.setBorder(BorderFactory.createEmptyBorder());
		log_out.addActionListener(this);
		panel.add(log_out);
		
		
		help_support = new JButton("Help & Support");
		help_support.setBounds(950,40,120,30);
		help_support.setFont(f3);
		help_support.setCursor(cursor);
		help_support.setBackground(color1);
		help_support.setForeground(Color.WHITE);
		help_support.setBorder(BorderFactory.createEmptyBorder());
		help_support.addActionListener(this);
		panel.add(help_support);
		
		//
		name1 = new JLabel("Dune");
		name1.setBounds(105,100,60,30);
		name1.setFont(f4);
		name1.setForeground(color2);
		panel.add(name1);
		
		name2 = new JLabel("I want to your pancreas");
		name2.setBounds(290,100,250,30);
		name2.setFont(f4);;
		name2.setForeground(color2);
		panel.add(name2);
		
		
		name3 = new JLabel("Garden of Words");
		name3.setBounds(600,100,180,30);
		name3.setFont(f4);
		name3.setForeground(color2);
		panel.add(name3);
		
		name4 = new JLabel("Avatar");
		name4.setBounds(925,100,75,30);
		name4.setFont(f4);
		name4.setForeground(color2);
		panel.add(name4);
		
		//TIME 1
		t1 = new JLabel("11:10 AM");
		t1.setBounds(90,165,85,30);
		t1.setFont(f5);
		t1.setBackground(color3);
		t1.setOpaque(true);
		panel.add(t1);
		
		t2 = new JLabel("01:00 PM");
		t2.setBounds(30,220,85,30);
		t2.setFont(f5);
		t2.setBackground(color3);
		t2.setOpaque(true);
		panel.add(t2);
		
		t3 = new JLabel("03:15 PM");
		t3.setBounds(150,220,85,30);
		t3.setFont(f5);
		t3.setBackground(color3);
		t3.setOpaque(true);
		panel.add(t3);
		
		t4 = new JLabel("04:00 AM");
		t4.setBounds(90,275,85,30);
		t4.setFont(f5);
		t4.setBackground(color3);
		t4.setOpaque(true);
		panel.add(t4);
		
		t5 = new JLabel("04:20 PM");
		t5.setBounds(30,330,85,30);
		t5.setFont(f5);
		t5.setBackground(color3);
		t5.setOpaque(true);
		panel.add(t5);
		
		t6 = new JLabel("04:50 PM");
		t6.setBounds(150,330,85,30);
		t6.setFont(f5);
		t6.setBackground(color3);
		t6.setOpaque(true);
		panel.add(t6);
		
		t7 = new JLabel("05:00 AM");
		t7.setBounds(90,385,85,30);
		t7.setFont(f5);
		t7.setBackground(color3);
		t7.setOpaque(true);
		panel.add(t7);
		
		t8 = new JLabel("05:30 PM");
		t8.setBounds(30,440,85,30);
		t8.setFont(f5);
		t8.setBackground(color3);
		t8.setOpaque(true);
		panel.add(t8);
		
		t9 = new JLabel("06:20 PM");
		t9.setBounds(150,440,85,30);
		t9.setFont(f5);
		t9.setBackground(color3);
		t9.setOpaque(true);
		panel.add(t9);
		
		//time 2
		t10 = new JLabel("11:30 AM");
		t10 .setBounds(370,165,85,30);
		t10 .setFont(f5);
		t10 .setBackground(color3);
		t10 .setOpaque(true);
		panel.add(t10 );
		
		t11 = new JLabel("01:20 PM");
		t11.setBounds(310,220,85,30);
		t11.setFont(f5);
		t11.setBackground(color3);
		t11.setOpaque(true);
		panel.add(t11);
		
		t12 = new JLabel("03:30 PM");
		t12.setBounds(430,220,85,30);
		t12.setFont(f5);
		t12.setBackground(color3);
		t12.setOpaque(true);
		panel.add(t12);
		
		t13 = new JLabel("04:10 AM");
		t13.setBounds(370,275,85,30);
		t13.setFont(f5);
		t13.setBackground(color3);
		t13.setOpaque(true);
		panel.add(t13);
		
		t14 = new JLabel("04:40 PM");
		t14.setBounds(310,330,85,30);
		t14.setFont(f5);
		t14.setBackground(color3);
		t14.setOpaque(true);
		panel.add(t14);
		
		t15 = new JLabel("05:00 PM");
		t15.setBounds(430,330,85,30);
		t15.setFont(f5);
		t15.setBackground(color3);
		t15.setOpaque(true);
		panel.add(t15);
		
		t16 = new JLabel("05:20 AM");
		t16.setBounds(370,385,85,30);
		t16.setFont(f5);
		t16.setBackground(color3);
		t16.setOpaque(true);
		panel.add(t16);
		
		t17 = new JLabel("06:00 PM");
		t17.setBounds(310,440,85,30);
		t17.setFont(f5);
		t17.setBackground(color3);
		t17.setOpaque(true);
		panel.add(t17);
		
		t18 = new JLabel("06:20 PM");
		t18.setBounds(430,440,85,30);
		t18.setFont(f5);
		t18.setBackground(color3);
		t18.setOpaque(true);
		panel.add(t18);
		
		t19 = new JLabel("07:15 AM");
		t19.setBounds(370,495,85,30);
		t19.setFont(f5);
		t19.setBackground(color3);
		t19.setOpaque(true);
		panel.add(t19);
		
		t20 = new JLabel("08:00 PM");
		t20.setBounds(310,550,85,30);
		t20.setFont(f5);
		t20.setBackground(color3);
		t20.setOpaque(true);
		panel.add(t20);
		
		t21 = new JLabel("08:20 PM");
		t21.setBounds(430,550,85,30);
		t21.setFont(f5);
		t21.setBackground(color3);
		t21.setOpaque(true);
		panel.add(t21);
		
		//time3
		t22 = new JLabel("11:00 AM");
		t22 .setBounds(645,165,85,30);
		t22 .setFont(f5);
		t22 .setBackground(color3);
		t22 .setOpaque(true);
		panel.add(t22 );
		
		t23 = new JLabel("12:20 PM");
		t23.setBounds(585,220,85,30);
		t23.setFont(f5);
		t23.setBackground(color3);
		t23.setOpaque(true);
		panel.add(t23);
		
		t24 = new JLabel("02:30 PM");
		t24.setBounds(705,220,85,30);
		t24.setFont(f5);
		t24.setBackground(color3);
		t24.setOpaque(true);
		panel.add(t24);
		
		t25 = new JLabel("03:10 AM");
		t25.setBounds(645,275,85,30);
		t25.setFont(f5);
		t25.setBackground(color3);
		t25.setOpaque(true);
		panel.add(t25);
		
		t26 = new JLabel("03:50 PM");
		t26.setBounds(585,330,85,30);
		t26.setFont(f5);
		t26.setBackground(color3);
		t26.setOpaque(true);
		panel.add(t26);
		
		t27 = new JLabel("04:30 PM");
		t27.setBounds(705,330,85,30);
		t27.setFont(f5);
		t27.setBackground(color3);
		t27.setOpaque(true);
		panel.add(t27);
		
		t28 = new JLabel("05:20 AM");
		t28.setBounds(645,385,85,30);
		t28.setFont(f5);
		t28.setBackground(color3);
		t28.setOpaque(true);
		panel.add(t28);
		
		t29 = new JLabel("06:20 PM");
		t29.setBounds(585,440,85,30);
		t29.setFont(f5);
		t29.setBackground(color3);
		t29.setOpaque(true);
		panel.add(t29);
		
		t30 = new JLabel("07:00 PM");
		t30.setBounds(705,440,85,30);
		t30.setFont(f5);
		t30.setBackground(color3);
		t30.setOpaque(true);
		panel.add(t30);
		
		t31 = new JLabel("07:35 AM");
		t31.setBounds(645,495,85,30);
		t31.setFont(f5);
		t31.setBackground(color3);
		t31.setOpaque(true);
		panel.add(t31);
		
		//time 4
		t32 = new JLabel("11:00 AM");
		t32 .setBounds(915,165,85,30);
		t32 .setFont(f5);
		t32 .setBackground(color3);
		t32 .setOpaque(true);
		panel.add(t32 );
		
		t33 = new JLabel("12:20 PM");
		t33.setBounds(855,220,85,30);
		t33.setFont(f5);
		t33.setBackground(color3);
		t33.setOpaque(true);
		panel.add(t33);
		
		t34 = new JLabel("02:30 PM");
		t34.setBounds(975,220,85,30);
		t34.setFont(f5);
		t34.setBackground(color3);
		t34.setOpaque(true);
		panel.add(t34);
		
		t35 = new JLabel("03:10 AM");
		t35.setBounds(915,275,85,30);
		t35.setFont(f5);
		t35.setBackground(color3);
		t35.setOpaque(true);
		panel.add(t35);
		
		t36 = new JLabel("03:50 PM");
		t36.setBounds(855,330,85,30);
		t36.setFont(f5);
		t36.setBackground(color3);
		t36.setOpaque(true);
		panel.add(t36);
		
		t37 = new JLabel("04:30 PM");
		t37.setBounds(975,330,85,30);
		t37.setFont(f5);
		t37.setBackground(color3);
		t37.setOpaque(true);
		panel.add(t37);
		
		
		
	
		//images
		upperLine = new ImageIcon("Image/upperLine.jpg");
		upper_Line = new JLabel(upperLine);
		upper_Line.setBounds(0,00,1100,80);
		panel.add(upper_Line);
		
		background = new ImageIcon("Image/Background_Home.jpg");
		back_gro = new JLabel(background);
		back_gro.setBounds(0,80,1100,700);
		panel.add(back_gro);
		
		this.add(panel);
	}
	
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == showing){
			Now_showing obj2 = new Now_showing();
			obj2.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == up_coming){
			Up_coming obj1 = new Up_coming();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == buy_ticket){
			Buy_Ticket obj1 = new Buy_Ticket();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == show_time){
			Show_time obj1 = new Show_time();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == log_out){
			LogIn obj1 = new LogIn();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == help_support){
			help obj1 = new help();
			obj1.setVisible(true);
			//this.setVisible(false);
		}	
	}
}