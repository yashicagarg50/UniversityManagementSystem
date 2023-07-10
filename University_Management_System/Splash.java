import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame implements Runnable{

    Thread t;
    Splash() { //constructor


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("media\\icons\\first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1560, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //You can't pass image class objects in Jlabel 
        add(image);

        t = new Thread(this);
        t.start();
        setVisible(true); // This sets the visibility of the frame which was hidden earlier
        int x = 1; 
        for(int i=1; i<=600; i+=4, x+=1) {
            setLocation(1050-(i+x/2), 400-(i/2));
            setSize(i+x,i+x/2);

            try{
                Thread.sleep(3);

            } catch (Exception e) {}
        }
        
       
    }

    public void run() {
        try{
            // closing the frame after 7 seconds
            Thread.sleep(7000);
            setVisible(false);

            // next Frame
            new Login(); // made an object for Login class coz it will call the constructor and then the coding from login class will work

        } catch (Exception e) {

        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}