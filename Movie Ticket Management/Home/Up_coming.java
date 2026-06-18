package Home;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;
import Starting.*;


public class Up_coming extends JFrame implements ActionListener{
	
	JPanel panel;
	JLabel back_gro, upper_Line, movie_1, movie_2, movie_3, movie_4, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12 ,a13, a14, a15;
	ImageIcon background, upperLine, movie1, movie2, movie3, movie4;
	JButton showing, up_coming, buy_ticket, show_time ,log_out ,help_support ,x_solve_error;
	Color color1;
	Font f0, f1, f2, f3, f4, f5;
	Cursor cursor;
	
	

	public Up_coming(){
		
		super("Star Cineplex");
		this.setSize(1100, 700);
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
		f5 = new Font("Times New Roman", Font.BOLD, 20);
		color1 = new Color(69,25,61);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
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
		up_coming.setFont(f0);
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
		show_time.setFont(f1);
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
		
		//movies
		movie1 = new ImageIcon("Image/Upcoming_1.jpg");
		movie_1 = new JLabel(movie1);
		movie_1.setBounds(60,120,180,300);
		panel.add(movie_1);
		
		movie2 = new ImageIcon("Image/Upcoming_2.jpg");
		movie_2 = new JLabel(movie2);
		movie_2.setBounds(323,280,180,300);
		panel.add(movie_2);
		
		movie3 = new ImageIcon("Image/Upcoming_3.jpg");
		movie_3 = new JLabel(movie3);
		movie_3.setBounds(588,120,180,300);
		panel.add(movie_3);
		
		movie4 = new ImageIcon("Image/Upcoming_4.jpg");
		movie_4 = new JLabel(movie4);
		movie_4.setBounds(860,280,180,300);
		panel.add(movie_4);
		
		//text
		a1 = new JLabel("Avengers Endgame");
		a1.setBounds(50,430,200,30);
		a1.setFont(f4);
		a1.setForeground(Color.WHITE);
		panel.add(a1);
		
		a2 = new JLabel("My Tomorrow");
		a2.setBounds(338,150,240,30);
		a2.setFont(f4);
		a2.setForeground(Color.WHITE);
		panel.add(a2);
		
		a3 = new JLabel("Your Yesterday");
		a3.setBounds(332,180,240,30);
		a3.setFont(f4);
		a3.setForeground(Color.WHITE);
		panel.add(a3);
		
		a4 = new JLabel("Animal");
		a4.setBounds(640,430,80,30);
		a4.setFont(f4);
		a4.setForeground(Color.WHITE);
		panel.add(a4);
		
		a5 = new JLabel("Top Gun Maverick");
		a5.setBounds(855,180,240,30);
		a5.setFont(f4);
		a5.setForeground(Color.WHITE);
		panel.add(a5);
		
		a6 = new JLabel("Action, Drama");
		a6.setBounds(84,475,180,30);
		a6.setFont(f5);
		a6.setForeground(Color.WHITE);
		panel.add(a6);
		
		a7 = new JLabel("Adventure");
		a7.setBounds(100,500,180,30);
		a7.setFont(f5);
		a7.setForeground(Color.WHITE);
		panel.add(a7);
		
		a8 = new JLabel("Crime, Drama");
		a8.setBounds(615,475,180,30);
		a8.setFont(f5);
		a8.setForeground(Color.WHITE);
		panel.add(a8);
		
		a9 = new JLabel("Action, Drama");
		a9.setBounds(350,225,240,30);
		a9.setFont(f5);
		a9.setForeground(Color.WHITE);
		panel.add(a9);
		
		a10 = new JLabel("Action, Drama");
		a10.setBounds(890,225,240,30);
		a10.setFont(f5);
		a10.setForeground(Color.WHITE);
		panel.add(a10);
		
 		
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
			Now_showing obj1 = new Now_showing();
			obj1.setVisible(true);
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