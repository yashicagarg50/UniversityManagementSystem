// connection with mysql has foll steps
// 1)Register the driver class
// 2) creating connection String
// 3) creating statement
// 4) executing mysql queries
// 5) closing the connection

import java.sql.*;
public class Conn {
    Statement s;
    Connection c;

    Conn() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root", "yashica061202");

            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace(); // to print exceptions
        }

    }

}
