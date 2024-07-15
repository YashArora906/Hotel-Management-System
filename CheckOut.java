//
//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.*;
//import java.util.Date;
//import java.awt.event.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
//public class CheckOut extends JFrame implements ActionListener{
//    
//    Choice ccustomer;
//    JLabel lblroomnumber, lblcheckintime, lblcheckouttime;
//    JButton checkout, back;
//    
//    CheckOut(){
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel text = new JLabel("Checkout");
//        text.setBounds(100,20,100,30);
//        text.setForeground(Color.WHITE);
//        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        add(text);
//        
//        JLabel lblid = new JLabel("Customer Id");
//        lblid.setBounds(30,80,100,30);
//        add(lblid);
//        
//        ccustomer = new Choice();
//        ccustomer.setBounds(150,80,150,25);
//        add(ccustomer);
//      
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
//        Image i2 = il.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel tick = new JLabel(i3);
//        tick.setBounds(310,80,20,20);
//        add(tick);
//        
//        JLabel lblroom = new JLabel("Room Number");
//        lblroom.setBounds(30,130,100,30);
//        add(lblroom);
//        
//        lblroomnumber = new JLabel();
//        lblroomnumber.setBounds(150,130,100,30);
//        add(lblroomnumber);
//        
//        JLabel lblcheckin = new JLabel("Checkin TIme");
//        lblcheckin.setBounds(30,180,100,30);
//        add(lblcheckin);
//        
//        lblcheckintime = new JLabel();
//        lblcheckintime.setBounds(150,180,100,30);
//        add(lblcheckintime);
//        
//        JLabel lblcheckout = new JLabel("Checkout TIme");
//        lblcheckout.setBounds(30,230,100,30);
//        add(lblcheckout);
//        
//        Date date = new Date();
//        
//        lblcheckouttime = new JLabel("" + date);
//        lblcheckouttime.setBounds(150,230,150,30);
//        add(lblcheckouttime);
//        
//        checkout = new JButton("Checkout");
//        checkout.setBackground(Color.BLACK);
//        checkout.setForeground(Color.WHITE);
//        checkout.setBounds(30,280,120,30);
//        checkout.addActionListener(this);
//        add(checkout);
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.setBounds(170,280,120,30);
//        back.addActionListener(this);
//        add(back);
//        
//          
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from customer");
//            while(rs.next()){
//                ccustomer.add(rs.getString("number"));
//                lblroomnumber.setText(rs.getString("room"));
//                lblcheckintime.setText(rs.getString("checkintime"));
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        
//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
//        Image i5 = i4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel image = new JLabel(i6);
//        image.setBounds(350,50,400,250);
//        add(image);
//        
//        setBounds(300,200,800,400);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource() == checkout){
//            String query1 = "delete from customer where number = '"+ccustomer.getSelectedItem()+"'";
//            String query2 = "update room set availability = 'Available' where roomnumber = '"+lblroomnumber.getText()+"'";
//            
//            try{
//                Conn c = new Conn();
//                c.s.executeUpdate(query1);
//                c.s.executeUpdate(query2);
//                
//                JOptionPane.showMessageDialog(null, "Checkouut done");
//                
//                setVisible(false);
//                new Reception();
//                
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        else{
//            setVisible(false);
//            new Reception();
//        }
//    }
//    
//    public static void main(String[] args){
//        new CheckOut();
//    }
//    
//}


package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;


import java.sql.*;	
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class CheckOut extends JFrame{
	Connection Conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField t1;
        Choice c1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut frame = new CheckOut();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close(){
		this.dispose();
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public CheckOut() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 800, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/sixth.jpg"));
                Image i3 = i1.getImage().getScaledInstance(400, 225,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(300,0,500,225);
                add(l1);
		
		JLabel lblCheckOut = new JLabel("Check Out ");
		lblCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckOut.setBounds(70, 11, 140, 35);
		contentPane.add(lblCheckOut);
		
		JLabel lblName = new JLabel("Number :");
		lblName.setBounds(20, 85, 80, 14);
		contentPane.add(lblName);
                
                c1 = new Choice();
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer");
                    while(rs.next()){
                        c1.add(rs.getString("number"));    
                    }
                }catch(Exception e){ }
                c1.setBounds(130, 82, 150, 20);
		contentPane.add(c1);
                
                ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tick.png"));
                Image i5 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JButton l2 = new JButton(i6);
                l2.setBounds(290,82,20,20);
                add(l2);
                
                l2.addActionListener(new ActionListener(){
                    
                    public void actionPerformed(ActionEvent ae){
                        System.out.println("Hi");
                        try{
                            
                            Conn c = new Conn();
                            String number = c1.getSelectedItem();
                            ResultSet rs = c.s.executeQuery("select * from customer where number = "+number);
                            
                            if(rs.next()){
                                System.out.println("clicked");
                                t1.setText(rs.getString("room_number"));    
                            }
                        }catch(Exception e){ }
                    }
                });

		
		JLabel lblRoomNumber = new JLabel("Room Number:");
		lblRoomNumber.setBounds(20, 132, 86, 20);
		contentPane.add(lblRoomNumber);
		
		t1 = new JTextField();
                t1.setBounds(130, 132, 150, 20);
		contentPane.add(t1);
                
                
                
                
                
		
                
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                String id = c1.getSelectedItem();
                                String s1 = t1.getText();
				String deleteSQL = "Delete from customer where number = "+id;
                                String q2 = "update room set availability = 'Available' where room_number = "+s1;
                                
                                
				Conn c = new Conn();

	    		try{
	    			
	    			
	    			c.s.executeUpdate(deleteSQL);
	    			c.s.executeUpdate(q2);
	    			JOptionPane.showMessageDialog(null, "Check Out Successful");
	    			new Reception().setVisible(true);
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
			}
		});
		btnCheckOut.setBounds(50, 200, 100, 25);
                btnCheckOut.setBackground(Color.BLACK);
                btnCheckOut.setForeground(Color.WHITE);
		contentPane.add(btnCheckOut);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(160, 200, 100, 25);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                
                getContentPane().setBackground(Color.WHITE);
	}

}