package Payment;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

import Payment.*;


public class CardPayment extends JFrame implements ActionListener{
	
	private File file;
	private FileWriter fwriter;
    
    JLabel  name1 , name2 , name3 , name4 , name5 , name6 , backgroundLabel;
    TextField text1, text2 , text3 ;
    JPasswordField password1;
    Font f1, f2;
    JButton bt0 , bt1;
    JPanel panel;
    ImageIcon  image1 , background;
   

    public CardPayment(){
		super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		
        
        panel = new JPanel();
        panel.setLayout(null);
        

        name1 = new JLabel("Credit / Debit Card Payment");
        name1.setBounds(300,30,850,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);
      
       image1 = new ImageIcon("Image/StarCineplexLogo.png");
       name2 = new JLabel(image1);
       name2.setBounds(120,200,416,203);
       panel.add(name2);
       
		
       name3 = new JLabel("Card Holder name ");
       f2 = new Font("Cambria", Font.BOLD, 25);
       name3.setBounds(600,180,220,30);
       name3.setFont(f2);
       panel.add(name3);

       text1 = new TextField();
       text1.setBounds(820,180,230,35);
       text1.setFont(f2);
       panel.add(text1);

       name4 = new JLabel("Card Number ");
       name4.setBounds(650,240,160,30);
       name4.setFont(f2);
       panel.add(name4);

       text2 = new TextField();
       text2.setBounds(820,240,230,35);
       text2.setFont(f2);
       panel.add(text2);
       
       name5 = new JLabel("Expairy Date ");
       name5.setBounds(660,300,160,30);
       name5.setFont(f2);
       panel.add(name5);

       text3 = new TextField();
       text3.setBounds(820,300,230,35);
       text3.setFont(f2);
       panel.add(text3);

       name6 = new JLabel("CVC ");
       name6.setBounds(760,360,100,35);
       name6.setFont(f2);
       panel.add(name6);

       password1 = new JPasswordField();
       password1.setBounds(820,360,230,35);
       password1.setFont(f2);
       panel.add(password1);

       bt0 = new JButton();
       bt0.setBounds(0,0,0,0);
       panel.add(bt0);

       bt1 = new JButton("Pay Now ");
       bt1.setBounds(750,430,180,40);
       bt1.setFont(f2);
	   bt1.addActionListener(this);
       panel.add(bt1);

       background = new ImageIcon("Image/Background_Payment.jpg");
       backgroundLabel = new JLabel(background);
       backgroundLabel.setBounds(0,0,1100,700);
       panel.add(backgroundLabel);

       
        this.add(panel);

    }
	public void actionPerformed(ActionEvent ae)
	/*{
		if (ae.getSource() == bt1){
			String s1 = text1.getText(); 	int x=s1.length();
			String s2 = text2.getText();	int y=s2.length();
			String s3 = text3.getText();	int z=s3.length();
			if(x!=0 && y!=0 && z!=0){
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
	}*/
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt1) {
            String s1 = text1.getText();
            String s2 = text2.getText();
            String s3 = text3.getText();
            String cvc = new String(password1.getPassword());

            if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !cvc.isEmpty()) {
                String paymentInfo = String.format(
                        "Card Holder: %s\nCard Number: %s\nExpiry Date: %s\nCVC: %s",
                        s1, s2, s3, cvc);

                // Save payment information to file
                savePaymentToFile(paymentInfo);

                // Show successful payment screen
                SuccesfulPayement obj1 = new SuccesfulPayement(paymentInfo);
                obj1.setVisible(true);
                this.setVisible(false);
            } else {
                FailedPayment obj1 = new FailedPayment();
                obj1.setVisible(true);
            }
        }
    }

    private void savePaymentToFile(String paymentInfo) {
        try {
            file = new File("Data/payment_slip.txt");
            fileWriter = new FileWriter(file, true); // Append mode
            fileWriter.write(paymentInfo + "\n");
        } catch (IOException e) {
            e.printStackTrace(); // Handle file writing errors
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close(); // Close the FileWriter
                }
            } catch (IOException e) {
                e.printStackTrace(); // Handle closing errors
            }
        }
    }
}
