package Home;


import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;
import Starting.*;
import Payment.*;
	
public class Buy_Ticket extends JFrame implements ActionListener, MouseListener{
	
	JPanel panel;
	JLabel back_gro, upper_Line, a1, a2, a3, x1, x2, m_1, m_2, m_3, m_4;
	ImageIcon background, upperLine, m1, m2, m3, m4;
	JButton showing, up_coming, buy_ticket, show_time ,log_out ,help_support ,x_solve_error, ticket_pay;
	JRadioButton rd1, rd2, aa, bb, cc, dd;
	ButtonGroup bt1, zz;
	JComboBox movie_time, ticket_no;
	Color color1;
	Font f0, f1, f2, f3, f4, f5;
	Cursor cursor;
	
	int x=0;
	

	public Buy_Ticket(){
		
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
		f4 = new Font("Times New Roman", Font.BOLD, 22);
		f5 = new Font("Times New Roman", Font.BOLD, 18);
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
		up_coming.setFont(f1);
		up_coming.setCursor(cursor);
		up_coming.setBackground(color1);
		up_coming.setForeground(Color.WHITE);
		up_coming.setBorder(BorderFactory.createEmptyBorder());
		up_coming.addActionListener(this);
		panel.add(up_coming);
		
		
		buy_ticket = new JButton("Buy Ticket");
		buy_ticket.setBounds(370,15,150,50);
		buy_ticket.setFont(f0);
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
		
		
		
		a1 = new JLabel("Select Movie");
		a1.setBounds(20,90,120,25);
		a1.setFont(f4);
		//a1.setBackground(null);
		a1.setForeground(Color.WHITE);
		//a1.setOpaque(true);
		panel.add(a1);
		

		
		
		//movie
		m1 = new ImageIcon("Image/1111.jpg");
		m_1 = new JLabel(m1);
		m_1.setBounds(30,120,72,120);
		m_1.setOpaque(true);
		//m_1.addActionListener(this);
		//m_1.setContentAreaFilled(false);
		panel.add(m_1);
		
		
		m2 = new ImageIcon("Image/2222.jpg");
		m_2 = new JLabel(m2);
		m_2.setBounds(130,120,72,120);
		m_2.setOpaque(true);
		//m_2.addActionListener(this);
		panel.add(m_2);
		
		m3 = new ImageIcon("Image/3333.jpg");
		m_3 = new JLabel(m3);
		m_3.setBounds(230,120,72,120);
		m_3.setOpaque(true);
		//m_3.addActionListener(this);
		panel.add(m_3);
		
		m4 = new ImageIcon("Image/4444.jpg");
		m_4 = new JLabel(m4);
		m_4.setBounds(330,120,72,120);
		m_4.setOpaque(true);
		//m_4.addActionListener(this);
		panel.add(m_4);
		
		//movie button
		aa = new JRadioButton("1");
		aa.setBounds(30,200,72,120);
		aa.setCursor(cursor);
		aa.setContentAreaFilled(false);
		aa.setForeground(Color.WHITE);
		panel.add(aa);
	
		
		bb = new JRadioButton("2");
		bb.setBounds(130,200,72,120);
		bb.setCursor(cursor);
		bb.setContentAreaFilled(false);
		bb.setForeground(Color.WHITE);
		panel.add(bb);
		
		cc = new JRadioButton("3");
		cc.setBounds(230,200,72,120);
		cc.setCursor(cursor);
		cc.setContentAreaFilled(false);
		cc.setForeground(Color.WHITE);
		panel.add(cc);
		
		dd = new JRadioButton("4");
		dd.setBounds(330,200,72,120);
		dd.setCursor(cursor);
		dd.setContentAreaFilled(false);
		dd.setForeground(Color.WHITE);
		panel.add(dd);
		
		zz = new ButtonGroup();
		zz.add(aa);
		zz.add(bb);
		zz.add(cc);
		zz.add(dd);
		
		
	
		x1 = new JLabel("(Regular TK. 350  /");
		x1.setBounds(330,320,300,25);
		x1.setFont(f5);
		x1.setForeground(Color.WHITE);
		panel.add(x1);
		
		x2 = new JLabel("Premium TK. 400)");
		x2.setBounds(490,320,300,25);
		x2.setFont(f5);
		x2.setForeground(Color.WHITE);
		panel.add(x2);
	
	
		rd1 = new JRadioButton("Regular");
		rd1.setBounds(30,320,100,25);
		rd1.setFont(f4);
		rd1.setCursor(cursor);
		rd1.setContentAreaFilled(false);
		rd1.setForeground(Color.WHITE);
		panel.add(rd1);
		
		rd2 = new JRadioButton("Premium");
		rd2.setBounds(140,320,115,25);
		rd2.setFont(f4);
		rd2.setCursor(cursor);
		rd2.setContentAreaFilled(false);
		rd2.setBorderPainted(false);
		rd2.setForeground(Color.WHITE);
		panel.add(rd2);
		
		bt1 = new ButtonGroup();
		bt1.add(rd1);
		bt1.add(rd2);
		
		a2 = new JLabel("Select Time");
		a2.setBounds(30,400,120,25);
		a2.setFont(f4);
		a2.setForeground(Color.WHITE);
		panel.add(a2);
		
		String items[] = new String[]
		{" ","11:00 AM","01:00 PM","03:15 PM","04:00 PM","04:20 PM","04:45 PM","05:00 PM","05:30 PM","06:00 PM","07:15 PM","08:00 PM","08:10 PM"};
		movie_time = new JComboBox(items);
		movie_time.setBounds(30,440,170,30);
		movie_time.setFont(f5);
		panel.add(movie_time);
		
		a3 = new JLabel("Number of Tickets");
		a3.setBounds(30,510,180,25);
		a3.setFont(f4);
		a3.setForeground(Color.WHITE);
		panel.add(a3);
		


		String tic[] = new String[]
		{" ","1","2","3","4","5","6"};
		ticket_no = new JComboBox(tic);
		ticket_no.setBounds(30,550,170,30);
		ticket_no.setFont(f4);
		panel.add(ticket_no);
		
		ticket_pay = new JButton("Proceed to Payment");
		ticket_pay.setBounds(330,500,200,40);
		ticket_pay.setFont(f5);
		ticket_pay.addActionListener(this);
		panel.add(ticket_pay);
		

		
		
		//background
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

	public void mouseClicked(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me) {}
	
	
	
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
		else if (ae.getSource() == ticket_pay){
			int i=0,ans=0;	boolean x=true,y=true; 	String s,s1;
			if(aa.isSelected() || bb.isSelected() || cc.isSelected() || dd.isSelected()){
				x=true;
			}
			if(rd1.isSelected()){i=350;}
			else if(rd2.isSelected()){i=400;}
			s=movie_time.getSelectedItem().toString();
			if(s.length()==8){y=true;}
			s1=ticket_no.getSelectedItem().toString();
			if(x==true && y==true && (i==350 || i==400)){
				int k=0;
				if(s1.equals("1")){k=1;}
				else if(s1.equals("2")){k=2;}
				else if(s1.equals("3")){k=3;}
				else if(s1.equals("4")){k=4;}
				else if(s1.equals("5")){k=5;}
				else if(s1.equals("6")){k=6;}
				ans=i*k;
			}
			if(ans!=0){
				JOptionPane.showMessageDialog(null,"Total ticket price is "+ans+" Tk","Pay",JOptionPane.INFORMATION_MESSAGE);
				dispose();
				PaymentMethods obj1 = new PaymentMethods();
				obj1.setVisible(true);
				this.setVisible(false);
			}
			else{
				JOptionPane.showMessageDialog(null,"Please Select all boxes","!!!!!!",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
}