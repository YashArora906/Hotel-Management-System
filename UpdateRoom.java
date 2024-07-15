//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.*;
//import java.sql.*;
//
//
//public class UpdateRoom extends JFrame implements ActionListener{
//    
//    Choice ccustomer;
//    JTextField tfroom, tfavailable, tfstatus,tfpending,tfpaid;
//    JButton check, update, back;
//    UpdateRoom(){
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        JLabel text = new JLabel("Update Room Status");
//        text.setFont(new Font("Tahoma", Font.PLAIN,20));
//        text.setBounds(30,20,250,30);
//        text.setForeground(Color.BLUE);
//        add(text);
//        
//        JLabel lblid = new JLabel("Customer Id");
//        text.setFont(new Font("Tahoma", Font.PLAIN,20));
//        text.setBounds(30,80,100,20);
//        add(lblid);
//        
//        JLabel lblroom  = new JLabel("Room Number");
//        lblroom.setBounds(30,130,100,20);
//        add(lblroom);
//        
//        tfroom = new JTextField();
//        tfroom.setBounds(200,130,150,25);
//        add(tfroom);
//        
//        JLabel lblname = new JLabel("Availability");
//        lblname.setBounds(30,180,100,20);
//        add(lblname);
//        
//        tfavailable = new JTextField();
//        tfavailable.setBounds(200,180,150,25);
//        add(tfavailable);
//        
//        JLabel lblcheckin  = new JLabel("Cleaning Status");
//        lblcheckin.setBounds(30,230,100,20);
//        add(lblcheckin);
//        
//        tfstatus = new JTextField();
//        tfstatus.setBounds(200,230,150,25);
//        add( tfstatus);
//        
//
//        
//        check = new JButton("Check");
//        check.setBackground(Color.BLACK);
//        check.setForeground(Color.WHITE);
//        check.setBounds(30,340,100,30);
//        check.addActionListener(this);
//        add(check);
//        
//        update = new JButton("Update");
//        update.setBackground(Color.BLACK);
//        update.setForeground(Color.WHITE);
//        update.setBounds(150,340,100,30);
//        update.addActionListener(this);
//        add(update);
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.setBounds(270,340,100,30);
//        back.addActionListener(this);
//        add(back);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.jpg"));
//        Image i2 = il.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(400,50,500,300);
//        add(image);
//        
//        
//        ccustomer = new Choice();
//        ccustomer.setBounds(200,80,150,25);
//        add(ccustomer);
//        
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from customer");
//            while(rs.next()){
//                ccustomer.add(rs.getString("number"));
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        setBounds(300,200,980,450);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource() == check){
//            String id = ccustomer.getSelectedItem();
//            String query = "select * from customer where number = '"+id+"'";
//            try{
//               Conn c = new Conn();
//               ResultSet rs = c.s.executeQuery(query);
//               while(rs.next()){
//                   tfroom.setText(rs.getString("room"));
//                   
//               }
//               ResultSet rs2 = c.s.executeQuery("select * from room where roomnumber = '"+tfroom.getText()+"'");
//               while(rs2.next()){
//                  tfavailable.setText(rs2.getString("availability"));
//                  tfstatus.setText(rs2.getString("cleaning_status"));
//               }
//            }
//               catch(Exception e){
//                       e.printStackTrace();
//                       }
//            }
//            else if(ae.getSource() == update){
//                    String number = ccustomer.getSelectedItem();
//                    String room = tfroom.getText();
//                    String available =  tfavailable.getText();
//                    String status = tfstatus.getText();
//                   
//                    
//                    try{
//                Conn c = new Conn();
//                c.s.execute("update room set room = '"+available+"', cleaning_status = '"+status+"' where roomnumber = '"+room+"'");
//                
//                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
//                setVisible(false);
//                new Reception();
//            }
//              catch(Exception e){
//                  e.printStackTrace();
//              }      
//                    
//        }
//            else{
//                
//            }
//    }
//    public static void main(String[] args){
//        new UpdateRoom();
//    }
//}

package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateRoom extends JFrame {
Connection Conn = null;
PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField txt_ID;
	private JTextField txt_Ava;
	private JTextField txt_Status;
	private JTextField txt_Room;
        
        Choice c1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateRoom frame = new UpdateRoom();
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
	public UpdateRoom() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 1000, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.jpg"));
                Image i3 = i1.getImage().getScaledInstance(550, 250,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(400,80,600,250);
                add(l1);
		
		JLabel lblUpdateRoomStatus = new JLabel("Update Room Status");
		lblUpdateRoomStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUpdateRoomStatus.setBounds(85, 11, 206, 34);
		contentPane.add(lblUpdateRoomStatus);
		
		JLabel lblNewLabel = new JLabel("Guest ID:");
		lblNewLabel.setBounds(27, 87, 90, 14);
		contentPane.add(lblNewLabel);
                
                c1 = new Choice();
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer");
                    while(rs.next()){
                        c1.add(rs.getString("number"));    
                    }
                }catch(Exception e){ }
                c1.setBounds(160, 84, 140, 20);
		contentPane.add(c1);
		
		JLabel lblAvailability = new JLabel("Availability:");
		lblAvailability.setBounds(27, 187, 90, 14);
		contentPane.add(lblAvailability);
		
		JLabel lblCleanStatus = new JLabel("Clean Status:");
		lblCleanStatus.setBounds(27, 240, 90, 14);
		contentPane.add(lblCleanStatus);
		
		
		txt_Ava = new JTextField();
		txt_Ava.setBounds(160, 184, 140, 20);
		contentPane.add(txt_Ava);
		txt_Ava.setColumns(10);
		
		txt_Status = new JTextField();
		txt_Status.setBounds(160, 237, 140, 20);
		contentPane.add(txt_Status);
		txt_Status.setColumns(10);
                
                txt_Room = new JTextField();
		txt_Room.setBounds(160, 130, 140, 20);
		contentPane.add(txt_Room);
		txt_Room.setColumns(10);
                
                JButton b1 = new JButton("Check");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try{
                                String s1 = c1.getSelectedItem();
				Conn c = new Conn();
                                ResultSet rs1 = c.s.executeQuery("select * from customer where number = "+s1);
                                
                                while(rs1.next()){
                                    txt_Room.setText(rs1.getString("room_number"));    
                                }
                            }catch(Exception ee){}
                            try{
                                Conn c  = new Conn();
                                ResultSet rs2 = c.s.executeQuery("select * from room where room_number = "+txt_Room.getText());
                                while(rs2.next()){
                                    txt_Ava.setText(rs2.getString("availability")); 
                                    txt_Status.setText(rs2.getString("clean_status"));
                                }
                            }catch(Exception ee){}
                        }
		});
		b1.setBounds(120, 315, 89, 23);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) throws NumberFormatException {
				
				try{
                                    Conn c = new Conn();
                                    String str = "update room set clean_status = '"+txt_Status.getText()+"' where room_number = "+txt_Room.getText();
                                    c.s.executeUpdate(str);
                                    JOptionPane.showMessageDialog(null, "Update Sucessful");
                                    
                                    new Reception().setVisible(true);
                                    setVisible(false);
				}catch (Exception ee){
					ee.printStackTrace();
				}
				
			
			}
		});
		btnUpdate.setBounds(60, 355, 89, 23);
                btnUpdate.setBackground(Color.BLACK);
                btnUpdate.setForeground(Color.WHITE);
		contentPane.add(btnUpdate);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(180, 355, 89, 23);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		JLabel lblRoomId = new JLabel("Room Number:");
		lblRoomId.setBounds(27, 133, 100, 14);
		contentPane.add(lblRoomId);
		
		getContentPane().setBackground(Color.WHITE);
	}

}