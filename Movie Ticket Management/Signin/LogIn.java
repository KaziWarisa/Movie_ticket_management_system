package Signin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; //for file 
import java.util.Scanner;

import Home.*;

class Bg extends JPanel{
	
	private Image bgImage;
	public Bg(String imagePath)
	{
		this.bgImage = new ImageIcon(imagePath).getImage();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(bgImage !=null)
	{
		g.drawImage(bgImage,0,0,getWidth(),getHeight(),this);
	}


	}


}
public class LogIn extends JFrame implements ActionListener{
	private File file;
	private FileWriter fwriter;
	private Scanner sc;
	JLabel l,l1,l2,l3;
	JPanel panel;
	TextField t;
	JPasswordField pass;
	Font font,f,f1,f2;
	JButton b,b1;
	Cursor cursor;

	public LogIn()
	{

		setSize(1100,700);
		setTitle("Star Cineplex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		ImageIcon appIcon = new ImageIcon("Star Cineplex");
        setIconImage(appIcon.getImage());
		Bg bgImage = new Bg("Image/bg1.jpg");
		bgImage.setLayout(null);
		font = new Font("Britannic Bold",Font.BOLD+Font.ITALIC,30);
		f = new Font("Serif",Font.BOLD+Font.ITALIC,20);
		f1= new Font("Arial",Font.BOLD,15);
		f2= new Font("Serif",Font.BOLD,14);
		l = new JLabel("Sign In");
		cursor = new Cursor(Cursor.HAND_CURSOR);

		l.setBounds(720,200,200,50);
		l.setFont(font);
		l.setForeground(Color.MAGENTA);
		 bgImage.add(l);


		l1 = new JLabel("User Id");
		l1.setBounds(620,300,70,30);
		l1.setFont(f);
		l1.setForeground(Color.WHITE);
		 bgImage.add(l1);


		t= new TextField("");
		t.setBounds(770,300,150,20);
		t.setBackground(Color.LIGHT_GRAY);
		t.setFont(f1);
		 bgImage.add(t);


		l2 = new JLabel("Password");
		l2.setBounds(620,350,100,20);
		l2.setForeground(Color.WHITE);
		l2.setFont(f);
		 bgImage.add(l2);

        pass = new JPasswordField("");
		pass.setBounds(770,350,150,20);
		pass.setBackground(Color.LIGHT_GRAY);
		pass.setFont(f1);
		 bgImage.add(pass);

		l3 = new JLabel("Don't have an account? Sign Up");
		l3.setBounds(670,420,340,20);
		l3.setForeground(Color.RED);
		l3.setFont(f2);
		 bgImage.add(l3);


		b = new JButton("Log In");
		b.setBounds(650,480,90,20);
		b.setBackground(Color.CYAN);
		b.setForeground(Color.BLACK);
		b.setFont(f1);
		b.setCursor(cursor);
		 bgImage.add(b);


		b1 = new JButton("Sign Up");
		b1.setBounds(800,480,95,20);
		b1.setBackground(Color.ORANGE);
		b.setForeground(Color.BLACK);
		b1.setFont(f1);
		b1.setCursor(cursor);
		 bgImage.add(b1);





		add(bgImage);
		b.addActionListener(this);
		b1.addActionListener(this);



		setVisible(true);

	}
	public void actionPerformed(ActionEvent e){

		if(e.getSource()== b){
			String s1,s2;
			s1=t.getText();			//user id
			s2=pass.getText();		//pass
			if(s1.isEmpty()||s2.isEmpty()){
				JOptionPane.showMessageDialog(null,"Please enter your user id and password");
			}
			else{
				file= new File("Data/User_Info.txt");
				try{
					boolean flag=false;
					sc=new Scanner(file);
					while(sc.hasNextLine()){
						String line=sc.nextLine();
						String[] value=line.split("\t");
						if(value[0].equals(s1)&&value[1].equals(s2)){
							flag=true;
							JOptionPane.showMessageDialog(null,"Welcome! " +value[2]+" "+value[3]);
							dispose();
							Now_showing show = new Now_showing();
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

		else if(e.getSource()==b1){
			Sign_Up show = new Sign_Up();
			show.setVisible(true);
			this.setVisible(false);
		}
	}
	
}