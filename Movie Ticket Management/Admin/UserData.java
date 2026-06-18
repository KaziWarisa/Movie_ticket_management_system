package Admin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane; // Added import
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserData extends JFrame implements ActionListener {
    JLabel name1, name2, name3, name4, name5, name6, updateLabel,deleteLable;
    Font f1, f2,f3;
    JTextField txt1, txt2, txt4, txt5, txt6, txtUpdate,txtDelete;
    JPasswordField pf1;
    JButton addButton, updateButton, deleteButton, backButton, updateDataButton,clearButton;
    JPanel panel;
    JTextArea textArea;
    File file; // Added declaration
    FileWriter fwriter;

    public UserData() {
        super("Star Cineplex");
        this.setSize(930, 850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        panel = new JPanel();
        panel.setLayout(null);

        f1 = new Font("Times New Roman", Font.BOLD, 30);
        f2 = new Font("Times New Roman", Font.BOLD, 20);
        f3 = new Font("Times New Roman", Font.BOLD, 12);
		
        name1 = new JLabel("First Name:");
        name1.setBounds(10, 10, 150, 30);
        name1.setFont(f2);
        panel.add(name1);

        txt1 = new JTextField();
        txt1.setBounds(10, 50, 150, 30);
        txt1.setFont(f2);
        panel.add(txt1);

        name2 = new JLabel("Last Name:");
        name2.setBounds(10, 90, 150, 30);
        name2.setFont(f2);
        panel.add(name2);

        txt2 = new JTextField();
        txt2.setBounds(10, 130, 150, 30);
        txt2.setFont(f2);
        panel.add(txt2);

        name3 = new JLabel("Password:");
        name3.setBounds(10, 170, 150, 30);
        name3.setFont(f2);
        panel.add(name3);

        pf1 = new JPasswordField();
        pf1.setBounds(10, 210, 150, 30);
        pf1.setFont(f2);
        panel.add(pf1);

        name4 = new JLabel("Phone Number:");
        name4.setBounds(750, 10, 150, 30);
        name4.setFont(f2);
        panel.add(name4);

        txt4 = new JTextField();
        txt4.setBounds(750, 50, 150, 30);
        txt4.setFont(f2);
        panel.add(txt4);

        name5 = new JLabel("User Name:");
        name5.setBounds(750, 100, 150, 30);
        name5.setFont(f2);
        panel.add(name5);

        txt5 = new JTextField();
        txt5.setBounds(750, 150, 150, 30);
        txt5.setFont(f2);
        panel.add(txt5);

        name6 = new JLabel("Email:");
        name6.setBounds(10, 250, 150, 30);
        name6.setFont(f2);
        panel.add(name6);

        txt6 = new JTextField();
        txt6.setBounds(10, 290, 150, 30);
        txt6.setFont(f2);
        panel.add(txt6);
		
		//_____________update____________
		
        updateLabel = new JLabel("Update by Username:");
        updateLabel.setBounds(750, 190, 150, 30);
        updateLabel.setFont(f2);
        panel.add(updateLabel);

        txtUpdate = new JTextField();
        txtUpdate.setBounds(750, 240, 150, 30);
        txtUpdate.setFont(f2);
        panel.add(txtUpdate);

        updateDataButton = new JButton("UPDATE");
        updateDataButton.setBounds(750, 280, 150, 30);
        updateDataButton.setFont(f2);
        updateDataButton.addActionListener(this);
        panel.add(updateDataButton);




//_________________Delete_________________

        deleteLable = new JLabel("Delete by Username:");
        deleteLable.setBounds(400, 10, 150, 30);
        deleteLable.setFont(f2);
        panel.add(deleteLable);

        txtDelete = new JTextField();
        txtDelete.setBounds(400, 60, 150, 30);
        txtDelete.setFont(f2);
        panel.add(txtDelete);


        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(400, 110, 120, 30);
        deleteButton.setFont(f2);
        deleteButton.addActionListener(this);
        panel.add(deleteButton);



//______________Clear_________________
		
		clearButton = new JButton("CLEAR");
        clearButton.setBounds(0, 750, 120, 30);
        clearButton.setFont(f2);
        clearButton.addActionListener(this);
        panel.add(clearButton);





        addButton = new JButton("ADD");
        addButton.setBounds(400, 210, 120, 30);
        addButton.setFont(f2);
        addButton.addActionListener(this);
        panel.add(addButton);

        

        

        backButton = new JButton("BACK");
        backButton.setBounds(810, 730, 120, 30);
        backButton.setFont(f2);
        backButton.addActionListener(this);
        panel.add(backButton);


//__________textArea___________
        textArea = new JTextArea();
        textArea.setFont(f2);
        textArea.setBackground(Color.WHITE);
        textArea.setForeground(Color.BLACK);
        textArea.setEditable(false);
        reloadAllUserData();
        JScrollPane jsp = new JScrollPane(textArea);
        jsp.setBounds(30, 370, 860, 330);
        panel.add(jsp);

        super.setVisible(true);
        this.add(panel);
    }

   public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
        addUser();
        reloadAllUserData(); // Reload data after adding
    } else if (e.getSource() == deleteButton) {
        deleteUser();
        reloadAllUserData(); // Reload data after deleting
    } else if (e.getSource() == backButton) {
        this.setVisible(false);
        Admin admin = new Admin();
        admin.setVisible(true);
    } else if (e.getSource() == updateDataButton) {
        updateUserData();
        reloadAllUserData(); // Reload data after updating
    } else if (e.getSource() == clearButton) {
        clearFields();
    }
}


    private void addUser() {
        String s1, s2, s3, s4, s5, s6;
        s1 = txt1.getText(); // First name
        s2 = txt2.getText(); // Last name
        s3 = pf1.getText(); // pass
        s4 = txt4.getText(); // phone
        s5 = txt5.getText(); // user
        s6 = txt6.getText(); // email

        if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill All");
        } else {
            try {
                file = new File("Data/User_Info.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                fwriter = new FileWriter(file, true);
                fwriter.write(s5 + "\t"); // username
                fwriter.write(s3 + "\t"); // pass
                fwriter.write(s1 + "\t"); // first name
                fwriter.write(s2 + "\t"); // last name
                fwriter.write(s4 + "\t"); // phone
                fwriter.write(s6 + "\n"); // email
                fwriter.flush();
                fwriter.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

private void updateUserData() {
    String usernameToUpdate = txtUpdate.getText();
    if (usernameToUpdate.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Username to Update");
        return;
    }

    // Initialize variables for new data
    String updatedData = txt1.getText() + "\t" +
            txt2.getText() + "\t" +
            pf1.getText() + "\t" +
            txt4.getText() + "\t" +
            txt6.getText();

    try {
        File inputFile = new File("Data/User_Info.txt");
        File tempFile = new File("Data/User_Info_temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] userData = currentLine.split("\t");
            if (userData.length >= 6 && userData[0].equals(usernameToUpdate)) {
                // Update only the fields that have been modified
                StringBuilder updatedLine = new StringBuilder();
                for (int i = 0; i < userData.length; i++) {
                    if (i == 0) {
                        updatedLine.append(userData[i]); // Username remains unchanged
                    } else {
                        // Check if the field has been modified
                        String newData = i == 1 ? txt1.getText() :
                                i == 2 ? txt2.getText() :
                                        i == 3 ? pf1.getText() :
                                                i == 4 ? txt4.getText() :
                                                        i == 5 ? txt6.getText() :
                                                                ""; // Default to empty string if index out of bounds

                        updatedLine.append(newData);
                    }
                    // Add tab delimiter between fields
                    updatedLine.append("\t");
                }
                // Write the updated line to the file
                writer.write(updatedLine.toString());
            } else {
                // Write the existing line as it is
                writer.write(currentLine);
            }
            writer.write("\n"); // Add newline character
        }
        writer.close();
        reader.close();

        // Delete the original file
        if (!inputFile.delete()) {
            throw new IOException("Failed to delete the original file");
        }

        // Rename temp file to original file
        if (!tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to rename the temporary file");
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating user data: " + e.getMessage());
        return; // Return without reloading data if an error occurs
    }

    // Reload data to textarea
    reloadAllUserData();

    // Remove components after updating
    panel.remove(txtUpdate);
    panel.remove(updateDataButton);
    panel.revalidate();
    panel.repaint();
}


    public void reloadAllUserData() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("./Data/User_Info.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        textArea.setText(content.toString());
    }
	private void deleteUser() {
    String usernameToDelete = txtDelete.getText();
    if (usernameToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Username to Delete");
        return;
    }

    try {
        File inputFile = new File("Data/User_Info.txt");
        File tempFile = new File("Data/User_Info_temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] userData = currentLine.split("\t");
            if (userData.length >= 6 && userData[0].equals(usernameToDelete)) {
                continue; // Skip writing this line if it matches the username to delete
            }
            writer.write(currentLine + "\n"); // Write the line to temp file
        }
        writer.close();
        reader.close();

        // Delete the original file
        if (!inputFile.delete()) {
            throw new IOException("Failed to delete the original file");
        }

        // Rename temp file to original file
        if (!tempFile.renameTo(inputFile)) {
            throw new IOException("Failed to rename the temporary file");
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting user: " + e.getMessage());
    }
}

private void clearFields() {
    txt1.setText("");
    txt2.setText("");
    pf1.setText("");
    txt4.setText("");
    txt5.setText("");
    txt6.setText("");
    txtUpdate.setText("");
    txtDelete.setText("");
}

    public static void main(String[] args) {
        new UserData();
    }
}
