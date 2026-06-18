package Payment;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Payment.*;

public class FailedPayment extends JFrame implements ActionListener{
     
    JPanel panel;
    JLabel name1 , name2 , name3, name4, name5 ;
    ImageIcon img1 , img2;
    JButton bt1 , bt2 , bt0;
    Font f1, f2 , f3;

    public FailedPayment(){
	  super("Star Cineplex");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
      

      panel = new JPanel();
      panel.setLayout(null);

      bt0 = new JButton();
      bt0.setBounds(0,0,0,0);
      panel.add(bt0);

      img1 = new ImageIcon("Image/icons8-cancel-94.png");
      name1 = new JLabel(img1);
      name1.setBounds(230,40,94,94);
      panel.add(name1);

      name2 = new JLabel();
      name2 = new JLabel("Payment Failed !");
      name2.setBounds(170,110,1000,94);
      f1 = new Font("Cambria", Font.BOLD, 30);
      name2.setFont(f1);
      panel.add(name2);

      name3 = new JLabel("An error occured. Please Try again");
      name3.setBounds(150,150,300,94);
      panel.add(name3);
      f2 = new Font("Cambria", Font.PLAIN, 20);
      name3.setFont(f2); 

      bt1 = new JButton("Try Again");
      bt1.setBounds(210,240,140,45);  
      f3 = new Font("Cambria", Font.PLAIN,25);
	  bt1.addActionListener(this);
      bt1.setFont(f3);
      panel.add(bt1);

	  
      this.add(panel);

    }
	
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == bt1){
			this.setVisible(false);
		}
			else{}
	}

}