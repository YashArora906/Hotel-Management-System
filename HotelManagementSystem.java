//
//package hotel.management.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//
//
//public class HotelManagementSystem extends JFrame implements ActionListener {
//    HotelManagementSystem(){
////        setSize(1366, 565);
////        setLocation(100, 100);
//        setBounds(100,100,1366,565);
////        setLayout(null);
//        setVisible(true);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
//        JLabel image = new JLabel(il);
//        image.setBounds(0,0,1366,565);
//        add(image);
//        
//        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
//        text.setBounds(120,430,1000,90);
//        text.setForeground(Color.WHITE);
//       
//        text.setFont(new Font("serif", Font.PLAIN, 50));
//        image.add(text);
//        
//        JButton next = new JButton("Next");
//        next.setBounds(1150,450,150,50);
//        next.setBackground(Color.WHITE);
//        next.addActionListener(this);
//        image.add(next);
//        
//        setVisible(true);
//        
//        while(true){
//            text.setVisible(false);
//            try{
//                Thread.sleep(500);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//            text.setVisible(true);
//            try{
//                Thread.sleep(500);
//            }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        setVisible(false);
//        new Login();
//    }
//
//    
//    public static void main(String[] args) {
//       new HotelManagementSystem();
//    }
//    
//}
//
//


package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize(1366,430);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,70));
                lid.setForeground(Color.red);
                l1.add(lid);
                
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}