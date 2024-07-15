//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class AddRooms extends JFrame implements ActionListener{
//    
//    JButton add, cancel;
//    JTextField tfroom, tfprice;
//    JComboBox typecombo, availablecombo, cleancombo;
//    
//    
//    AddRooms(){
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel heading = new JLabel("Add Rooms");
//        heading.setFont(new Font("Tahoma", Font.BOLD, 15));
//        heading.setBounds(150,20,200,20);
//        add(heading);
//        
//        JLabel lblroomno = new JLabel("Room Number");
//        lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        lblroomno.setBounds(60,80,120,30);
//        add(lblroomno);
//        
//        tfroom = new JTextField();
//        tfroom.setBounds(200,80,150,30);
//        add(tfroom);
//        
//        JLabel lblavailable = new JLabel("Available");
//        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        lblavailable.setBounds(60,130,120,30);
//        add(lblavailable);
//        
//        
//        String availableOptions[] = {"Available", "Occupied"};
//         availablecombo = new JComboBox(availableOptions);
//        availablecombo.setBounds(200,130,150,30);
//        availablecombo.setBackground(Color.WHITE);
//        add(availablecombo);
//        
//        JLabel lblclean = new JLabel("Cleaning Status");
//        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        lblclean.setBounds(60,180,120,30);
//        add(lblclean);
//        
//        String cleanOptions[] = {"Cleaned", "Dirty"};
//         cleancombo = new JComboBox(cleanOptions);
//        cleancombo .setBounds(200,180,150,30);
//        cleancombo .setBackground(Color.WHITE);
//        add(cleancombo);
//        
//        JLabel lblprice = new JLabel("Price");
//        lblprice .setFont(new Font("Tahoma", Font.PLAIN, 15));
//        lblprice .setBounds(60,230,120,30);
//        add(lblprice);
//        
//         tfprice = new JTextField();
//        tfprice.setBounds(200,230,150,30);
//        add(tfprice);
//        
//        JLabel lbltype = new JLabel("Bed Type");
//        lbltype .setFont(new Font("Tahoma", Font.PLAIN, 15));
//        lbltype .setBounds(60,280,120,30);
//        add(lbltype);
//        
//        String typeOptions[] = {"Single Bed", "Double Bed"};
//         typecombo = new JComboBox(typeOptions);
//        typecombo.setBounds(200,280,150,30);
//        typecombo.setBackground(Color.WHITE);
//        add(typecombo);
//        
//         add = new JButton("Add Room");
//        add.setForeground(Color.WHITE);
//        add.setBackground(Color.BLACK);
//        add.setBounds(60,350,130,30);
//        add.addActionListener(this);
//        add(add);
//        
//        cancel = new JButton("Cancel Room");
//        cancel.setForeground(Color.WHITE);
//        cancel.setBackground(Color.BLACK);
//        cancel.setBounds(60,350,130,30);
//        cancel.addActionListener(this);
//        add(cancel);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
//        JLabel image = new JLabel(il);
//        image.setBounds(400,30,500,300);
//        add(image);
//        
//        setBounds(330,200,940,470);
//        setVisible(true);
//       
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource() == add){
//            String roomnumber = tfroom.getText();
//            String availability = (String) availablecombo.getSelectedItem();
//            String status = (String) cleancombo.getSelectedItem();
//            String price = tfprice.getText();
//            String type = (String) typecombo.getSelectedItem();
//            
//            try{
//                Conn conn = new Conn();
//                String str = "INSERT INTO room values( '"+roomnumber+"', '"+availability+"', '"+status+"','"+price+"', '"+type+"')";
//                
//                conn.s.executeUpdate(str);
//                
//                JOptionPane.showMessageDialog(null, "New Rooms Addes Successfully");
//                
//                
//            }
//            catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//    public static void main(String[] args){
//        new AddRooms();
//    }
//}
//
//
//


package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddRooms extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;
    Choice c1;

    public static void main(String[] args) {
        new AddRooms().setVisible(true);
    }


    public AddRooms() {
        setBounds(450, 200, 1000, 450);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l15 = new JLabel(i2);
                l15.setBounds(400,30,500,370);
                add(l15);
        
        JLabel l10 = new JLabel("Add Rooms");
        l10.setFont(new Font("Tahoma", Font.BOLD, 18));
	l10.setBounds(194, 10, 120, 22);
	contentPane.add(l10);
        
	
        
	JLabel l1 = new JLabel("Room Number");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(64, 70, 102, 22);
	contentPane.add(l1);
        
        
        t4 = new JTextField();
	t4.setBounds(174, 70, 156, 20);
	contentPane.add(t4);
        

	JLabel l2 = new JLabel("Availability");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(64, 110, 102, 22);
	contentPane.add(l2);
        
        comboBox = new JComboBox(new String[] { "Available", "Occupied" });
	comboBox.setBounds(176, 110, 154, 20);
	contentPane.add(comboBox);


	JLabel l3 = new JLabel("Cleaning Status");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(64, 150, 102, 22);
	contentPane.add(l3);
        
        comboBox_2 = new JComboBox(new String[] { "Cleaned", "Dirty" });
	comboBox_2.setBounds(176, 150, 154, 20);
	contentPane.add(comboBox_2);

	JLabel l4 = new JLabel("Price");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(64, 190, 102, 22);
	contentPane.add(l4);
        
        t2 = new JTextField();
	t2.setBounds(174, 190, 156, 20);
	contentPane.add(t2);

        JLabel l5 = new JLabel("Bed Type");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(64, 230, 102, 22);
	contentPane.add(l5);


        comboBox_3 = new JComboBox(new String[] { "Single Bed", "Double Bed"});
	comboBox_3.setBounds(176, 230, 154, 20);
	contentPane.add(comboBox_3);

	

	

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	
        contentPane.setBackground(Color.WHITE);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{
                Conn c = new Conn();
                String room = t4.getText();
                String available = (String)comboBox.getSelectedItem();
                String status = (String)comboBox_2.getSelectedItem();
                String price  = t2.getText();
                String type = (String)comboBox_3.getSelectedItem();
                String str = "INSERT INTO room values( '"+room+"', '"+available+"', '"+status+"','"+price+"', '"+type+"')";
              
                
		c.s.executeUpdate(str);
		JOptionPane.showMessageDialog(null, "Room Successfully Added");
                this.setVisible(false);
               
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
            else if(ae.getSource() == b2){
                this.setVisible(false);
            }
        }catch(Exception eee){
            
        }
    }
}