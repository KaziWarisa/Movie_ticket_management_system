package Starting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Signin.*;

class B extends JPanel{
	private Image bgImage,logo;
	public B(String imagePath)
	{
		this.bgImage = new ImageIcon(imagePath).getImage();
		this.logo = new ImageIcon(imagePath).getImage();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(bgImage !=null || logo !=null)
	{
		g.drawImage(bgImage,0,0,getWidth(),getHeight(),this);
		g.drawImage(logo,0,0,getWidth(),getHeight(),this);
	}


	}


}
public class help extends JFrame implements ActionListener{
	JLabel l;
	JPanel panel;
	Font font,f,f1,f2;
	JButton b,b1;
	Cursor cursor;
	JTextArea text;
	
	public help()
	{
		
		setSize(1100,700);
		setTitle("Star Cineplex");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		ImageIcon appIcon = new ImageIcon("");
		///ekahne logo er address hobe
        setIconImage(appIcon.getImage());
		B bgImage = new B("Image/help.png");
		B logo = new B("Image/logo.png");
		bgImage.setLayout(null);
		logo.setBounds(70,80,120,80);
		bgImage.add(logo);
		font = new Font("Britannic Bold",Font.BOLD+Font.ITALIC,30);
		f = new Font("Serif",Font.BOLD+Font.ITALIC,20);
		f1= new Font("Arial",Font.BOLD,15);
		f2= new Font("Serif",Font.BOLD,14);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
	    l = new JLabel("Help & Support");
		l.setBounds(100,190,300,50);
		l.setFont(font);
		l.setForeground(Color.MAGENTA);
		 bgImage.add(l);

		 panel = new JPanel(null);
		 panel.setBounds(80,270,300,100);
	     
		 String aboutText = "Welcome to Star Cineplex! Dear Sir/Mam, If you are facing any trouble and issues please submit below.";
		 JLabel aboutTextLabel = new JLabel("<html><div style='text-align: center;'>" + aboutText + "</div></html>");
		 aboutTextLabel.setBounds(0, 0,300, 100);
		 aboutTextLabel.setFont(f2);
		 aboutTextLabel.setForeground(Color.BLACK);
		 panel.add(aboutTextLabel);
		 panel.setBackground(Color.magenta);
		 bgImage.add(panel);

		 text = new JTextArea();
		 text.setBounds(80,400,300,100);
		 text.setBackground(Color.LIGHT_GRAY);
		 text.setFont(f2);
		 text.setLineWrap(true);
         text.setWrapStyleWord(false);    
		 bgImage.add(text);
        

		
		
		
		b = new JButton("Submit");
		b.setBounds(120,540,90,20);
		b.setBackground(Color.GREEN);
		b.setForeground(Color.BLACK);
		b.setFont(f1);
		b.setCursor(cursor);
		 bgImage.add(b);
		

		b1 = new JButton("Reset");
		b1.setBounds(250,540,90,20);
		b1.setBackground(Color.RED);
		b.setForeground(Color.BLACK);
		b1.setFont(f1);
		b1.setCursor(cursor);
		bgImage.add(b1);
		
       


	    
		add(bgImage);
		b.addActionListener(this);
		b1.addActionListener(this);

		
	
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()== b){
			
		JOptionPane.showMessageDialog(null,"Thanks for your feedback!","Submit",JOptionPane.INFORMATION_MESSAGE);
		dispose();
		}

		else if(e.getSource()==b1)
		{
         text.setText("");
		}
		
	}
	public static void main(String [] args)
	{
		new help();
	}
	
}