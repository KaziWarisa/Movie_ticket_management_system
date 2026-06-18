package Payment;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Payment.*;
import Home.*;

public class SuccesfulPayement extends JFrame implements ActionListener{

    JPanel panel;
    JLabel name1 , name2, name3, name4;
    Font f1 , f2 , f3 ;
    ImageIcon img1;
    JButton bt0, bt1;
	JTextField paymentSlipField;


    public SuccesfulPayement(){
      super("Star Cineplex");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
      
      panel = new JPanel();
      panel.setLayout(null);

      img1 = new ImageIcon("Image/icons8-success-94.png");
      name1 = new JLabel(img1);
      name1.setBounds(250,40,94,94);
      panel.add(name1);

      name2 = new JLabel();
      name2 = new JLabel("Payment Sucessfull !");
      name2.setBounds(150,110,1000,94);
      f1 = new Font("Cambria", Font.BOLD, 30);
      name2.setFont(f1);
      panel.add(name2);

      name3 = new JLabel("We have recived your payment.");
      name3.setBounds(160,160,300,94);
      panel.add(name3);
      f2 = new Font("Cambria", Font.PLAIN, 20);
      name3.setFont(f2);


      name4 = new JLabel("Thank You! ");
      name4.setBounds(230,200,250,94);
      panel.add(name4);
      f2 = new Font("Cambria", Font.PLAIN, 20);
      name4.setFont(f2);
      
	  paymentSlipField = new JTextField(paymentSlip);
      paymentSlipField.setBounds(150, 280, 300, 30);
      f3 = new Font("Aharoni", Font.PLAIN, 18);
      paymentSlipField.setFont(f3);
      paymentSlipField.setEditable(false);
      panel.add(paymentSlipField);
	  
      bt1 = new JButton("OK");
      bt1.setBounds(250,280,75,50);
      f3 = new Font("Aharoni", Font.PLAIN, 22);
      bt1.setFont(f3);
	  bt1.addActionListener(this);
      panel.add(bt1);


      bt0 = new JButton();
      bt0.setBounds(0,0,0,0);
      panel.add(bt0);

      this.add(panel);

    }
		//actionlistenewr
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == bt1){
			Now_showing obj1 = new Now_showing();
			obj1.setVisible(true);
			this.setVisible(false);
		}
			else{}
	}


}
