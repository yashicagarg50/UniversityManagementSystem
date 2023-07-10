import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{

    Project() {

        // adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("media\\icons\\third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //You can't pass image class objects in Jlabel
        add(image);


        // adding menu bar
        JMenuBar mb = new JMenuBar();
        
        // adding new information
        JMenu newinfo = new JMenu("New Information");
        newinfo.setForeground(Color.blue);

        mb.add(newinfo); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem facultyinfo = new JMenuItem("New Faculty Information");
        facultyinfo.setBackground(Color.white);
        facultyinfo.addActionListener(this);
        newinfo.add(facultyinfo);

        // adding second item to the new information
        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.setBackground(Color.white);
        studentinfo.addActionListener(this);
        newinfo.add(studentinfo);


        // adding view details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.red);

        mb.add(details); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        // adding second item to the new information
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);


        // adding Leave
        JMenu leave = new JMenu("Apply for Leave");
        leave.setForeground(Color.blue);

        mb.add(leave); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);

        leave.add(facultyleave);

        // adding second item to the new information
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        studentleave.addActionListener(this);

        leave.add(studentleave);


        // adding Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.red);

        mb.add(leaveDetails); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.white);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        // adding second item to the new information
        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.white);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);
        

        // adding Exams
        JMenu Exams = new JMenu("Examination");
        Exams.setForeground(Color.blue);

        mb.add(Exams); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.white);
        examinationdetails.addActionListener(this);
        Exams.add(examinationdetails);

        // adding second item to the new information
        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.addActionListener(this);
        Exams.add(EnterMarks);

        
        // adding Update
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.red);

        mb.add(updateInfo); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.setBackground(Color.white);
        updateFacultyInfo.addActionListener(this);
        updateInfo.add(updateFacultyInfo);

        // adding second item to the new information
        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.white);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);



        // adding Fees
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.blue);

        mb.add(fee); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        // adding menu items to the new information 

        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.white);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);

        // adding second item to the new information
        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.white);
        feeForm.addActionListener(this);
        fee.add(feeForm);
        

        // adding utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.red);

        mb.add(utility); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        
        // adding menu items to the new information 
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        // adding second item to the new information
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);

         // adding about
        JMenu about = new JMenu("About");
        about.setForeground(Color.blue);

        mb.add(about); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar

         // adding menu items to the about 
        JMenuItem ab= new JMenuItem("About");
        ab.setBackground(Color.white);
        ab.addActionListener(this);
        about.add(ab);
        
         // adding exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.red);

        mb.add(exit); // we have to add it on menu bar thus mb.add()
        setJMenuBar(mb); // we don't have add for menu bar but set menu bar
        
        // adding menu items to the new information 
        JMenuItem ex= new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);

        
        // setting the layout
        setSize(1540, 850);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if(msg.equals("Exit")) {
            setVisible(false);
        }

        else if(msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e) {

            }
        }

        else if(msg.equals("Notepad")){
            try {
                Runtime.getRuntime().exec("Notepad.exe");
            } catch(Exception e) {

            }
        } else if(msg.equals("New Faculty Information") ) {
            new AddTeacher();
        } else if(msg.equals("New Student Information")) {
            new AddStudent();
        } else if(msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if(msg.equals("View Student Details")) {
            new StudentDetails();
        } else if(msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if(msg.equals("Student Leave")) {
            new StudentLeave();
        } else if(msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if(msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if(msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if(msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if(msg.equals("Enter Marks")) {
            new EnterMarks();    
        } else if(msg.equals("Examination Results")) {
            new ExaminationDetails();   
        } else if(msg.equals("Fee Structure")) {
            new FeeStructure(); 
        } else if(msg.equals("About")) {
            new About(); 
        } else if(msg.equals("Student Fee Form")) {
            new StudentFeeForm(); 
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
