package Payment;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Payment.*;
import Home.*;
import Starting.*;

public class PaymentMethods extends JFrame implements ActionListener{
 
    JLabel  name1,name2, name3 , name4, name5, name6, backgroundLabel;
    Font f1, f2;
    JButton  bt0 ,bt1 , bt2 , bt3, bt4;
    JPanel panel;
    ImageIcon  bgImage , image1 ,image2 , image3, image4, image5;
    Color clr1;

    public PaymentMethods(){
         super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        name1 = new JLabel("Select a Payment Method ");
        name1.setBounds(290,30,850,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);

       image1 = new ImageIcon("Image/StarCineplexLogo.png");
       name2 = new JLabel(image1);
       name2.setBounds(120,200,416,203);
       panel.add(name2);


        bt0 = new JButton();
        bt0.setBounds(0,0,0,0);
        panel.add(bt0);
        
        bt1 = new JButton("Mobile Banking ");
        bt1.setBounds(690,170,300,50);
        f2 = new Font("Cambria", Font.BOLD, 30);  
        bt1.setFont(f2);
		bt1.addActionListener(this);
        panel.add(bt1);
        
        image2 = new ImageIcon("Image/icons8-mobile-bank-64.png");
        name3 = new JLabel(image2);
        name3.setBounds(620,160,64,64);
        panel.add(name3);

        bt2 = new JButton("Credit/debit Cards ");
        bt2.setBounds(690,270,300,50);
        bt2.setFont(f2);
		bt2.addActionListener(this);
        panel.add(bt2);
        
        image3 = new ImageIcon("Image/icons8-credit-card-50.png");
        name4 = new JLabel(image3);
        name4.setBounds(620,270,50,50);
        panel.add(name4);

      
        bt3 = new JButton("Redeem Gift Card ");
        bt3.setBounds(690,370,300,50); 
        bt3.setFont(f2);
		bt3.addActionListener(this);
        panel.add(bt3);

        image4 = new ImageIcon("Image/icons8-gift-card-50.png");
        name5 = new JLabel(image4);
        name5.setBounds(620,370,50,50);
        panel.add(name5);

 

        //image5 = new ImageIcon("Image/supportIcon.png");
        //name6 = new JLabel(image5);
        //name6.setBounds(620,460,64,64);
        //panel.add(name6);
      

        bgImage= new ImageIcon("Image/Background_Payment.jpg");
        backgroundLabel = new JLabel(bgImage);
        backgroundLabel.setBounds(0,0,1100,700);
        panel.add(backgroundLabel);
      
        this.add(panel);

    }
	
	//ActionListener
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == bt1){
			MobileBanking obj1 = new MobileBanking();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == bt2){
			CardPayment obj1 = new CardPayment();
			obj1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == bt3){
			RedeemGiftCard obj1 = new RedeemGiftCard();
			obj1.setVisible(true);
			this.setVisible(false);
		}

		
	}
    
}
