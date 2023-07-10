import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class TeacherLeave extends JFrame implements ActionListener{
    
    Choice ctime, cEmpId;
    JDateChooser dcdate;
    JButton submit, cancel;


    TeacherLeave() {
        setSize(500, 550);
        setLayout(null);
        setLocation(520, 100);
        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(40, 50, 300,30);
        heading.setFont(new Font("Tohama", Font.BOLD, 20));
        add(heading);

        JLabel lblrollno = new JLabel("Search by Employee Id");
        lblrollno.setBounds(60, 100, 200,20);
        lblrollno.setFont(new Font("Tohama", Font.PLAIN, 18));
        add(lblrollno);

        cEmpId = new Choice();
        cEmpId.setBounds(60, 130, 200, 20);
        add(cEmpId);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from teacher");
            while(rs.next()) {
               cEmpId.add(rs.getString("empId")); 
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200,20);
        lbldate.setFont(new Font("Tohama", Font.PLAIN, 18));
        add(lbldate);

        dcdate = new JDateChooser();
        dcdate.setBounds(60, 210, 200, 25);
        add(dcdate);

        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200,20);
        lbltime.setFont(new Font("Tohama", Font.PLAIN, 18));
        add(lbltime);

        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);


        submit = new JButton("Submit");
        submit.setBounds( 60, 350, 100, 25);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(200, 350, 100, 25);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
        add(cancel);



        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == submit) {
            String empId = cEmpId.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration = ctime.getSelectedItem();

            String query = "insert into teacherleave values('"+empId+"', '"+date+"', '"+duration+"')";

            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Confirmed");
            } catch(Exception e) {
                e.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new TeacherLeave();

    }
}
