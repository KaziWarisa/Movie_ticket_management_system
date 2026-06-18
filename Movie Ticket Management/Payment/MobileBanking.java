package Payment;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Payment.*;

public class MobileBanking extends JFrame implements ActionListener{
    
    JPanel panel;
    JLabel bgLabel, name1 , name2 , name3 ;
    JTextField text1;
    JPasswordField pf1;
    ImageIcon bgimage, image1;
    JButton bt0, bt1;
    Font f1;

    public MobileBanking(){
        super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
         
        panel = new JPanel();
        panel.setLayout(null);
        
		image1 = new ImageIcon("Image/bkash_payment_logo-removebg.png");
		name1 = new JLabel(image1);
		name1.setBounds(300,70,500,117);
		panel.add(name1);
      
        name2 = new JLabel("Your Bkash Number");
        name2.setBounds(300,250,300,30);
        f1 = new Font("Cambria", Font.BOLD,25);
        name2.setFont(f1);
        panel.add(name2);

        text1 = new JTextField();
        text1.setBounds(550,250,200,30);
        text1.setFont(f1);
        panel.add(text1);


        name3 = new JLabel("Bkash PIN ");
        name3.setBounds(410,300,300,30);
        name3.setFont(f1);
        panel.add(name3);

        pf1 = new JPasswordField();
        pf1.setBounds(550,300,200,30);
        pf1.setFont(f1);
        panel.add(pf1);

        bt0 = new JButton();
        bt0.setBounds(0,0,0,0);
        panel.add(bt0);

        bt1 = new JButton("Confirm ");
        bt1.setBounds(480,350,140,40);
        bt1.setFont(f1);
		bt1.addActionListener(this);
        panel.add(bt1);

        bgimage = new ImageIcon("Image/Background_Payment.jpg");
        bgLabel = new JLabel(bgimage);
        bgLabel.setBounds(0,0,1100,700);
        panel.add(bgLabel);

        this.add(panel);
    }
	
	
	//actionlistenewr
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == bt1){
			String s1 = text1.getText(); 	int x=s1.length();
			if(x!=0){
				SuccesfulPayement obj1 = new SuccesfulPayement();
				obj1.setVisible(true);
				this.setVisible(false);
			}
			else{
				FailedPayment obj1 = new FailedPayment();
				obj1.setVisible(true);
				//this.setVisible(false);
			}
		} 
	}
}
