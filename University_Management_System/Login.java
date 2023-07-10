import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JTextField tfusername, tfpassword;
    JButton login, cancel;
    Login() {

        // setting the colour and layout as null so that whatever we want on it has to be added explicitly 
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        // adding "username" label explicitly
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        // adding input box
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        // adding "password" label explicitly
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);

        // adding input box
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);
        
        // adding buttons
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(login);

        // adding buttons
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(cancel);

        // adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("media\\icons\\second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //You can't pass image class objects in Jlabel
        image.setBounds(350, 0, 200, 200); 
        add(image);

        // setting up for the frame
        setSize(600, 300);
        setLocation(550, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();

            String query = "select * from login where username = ? and password = ?";

            try{
                Conn c = new Conn();
                PreparedStatement pstmt = c.c.prepareStatement(query);
                pstmt.setString(1, username);
                pstmt.setString(2,password);
                ResultSet rs= pstmt.executeQuery();

                if(rs.next()) {
                    EventQueue.invokeLater(()-> {
                        setVisible(false);

                        new Project();
                    });
                    
                } else {
                    EventQueue.invokeLater(()-> {
                        JOptionPane.showMessageDialog(this,"Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
                    });
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
