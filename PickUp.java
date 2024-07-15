//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//import net.proteanit.sql.*;
//
//public class PickUp extends JFrame implements ActionListener {
//    JTable table;
//    JButton back,submit;
//    Choice typeofCars;
//    JCheckBox available;
//     PickUp(){
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//       JLabel text = new JLabel("PickUp Services");
//       text.setFont(new Font("Tahoma", Font.PLAIN, 20));
//       text.setBounds(400,30,200,30);
//       add(text);
//       
//       JLabel lblbed = new JLabel("Type Of Cars");
//       lblbed.setBounds(50,100,100,20);
//       add(lblbed);
//       
//       typeofCars = new  Choice();
//       typeofCars.setBounds(150,100,200,25);
//       add(typeofCars);
//       
//       try{
//           Conn c = new Conn();
//           ResultSet rs = c.s.executeQuery("select * from driver");
//           while(rs.next()){
//               typeofCars.add(rs.getString("brand"));
//           }
//       }
//       catch(Exception e){
//           e.printStackTrace();
//       }
//       
//       
//        
//        JLabel l1 = new JLabel("Name");
//        l1.setBounds(30,160,100,20);
//        add(l1);
//        
//        JLabel l2 = new JLabel("Age");
//        l2.setBounds(200,160,100,20);
//        add(l2);
//        
//        JLabel l3 = new JLabel("Gender");
//        l3.setBounds(330,160,100,20);
//        add(l3);
//        
//        JLabel l4 = new JLabel("Company");
//        l4.setBounds(460,160,100,20);
//        add(l4);
//        
//        JLabel l5 = new JLabel("Brand");
//        l5.setBounds(630,160,100,20);
//        add(l5);
//        
//        JLabel l6 = new JLabel("Availability");
//        l6.setBounds(740,160,100,20);
//        add(l6);
//        
//        JLabel l7 = new JLabel("Loaction");
//        l7.setBounds(890,160,100,20);
//        add(l7);
//        
//        table = new JTable();
//        table.setBounds(0,200,1000,300);
//        add(table);
//        
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from driver");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        submit = new JButton("Submit");
//        submit.setBackground(Color.BLACK);
//        submit.setForeground(Color.WHITE);
//        submit.addActionListener(this);
//        submit.setBounds(300,520,120,30);
//        add(submit);
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        back.setBounds(500,520,120,30);
//        add(back);
//        
//        
//        
//        setBounds(300,200,1050,600);
//        setVisible(true);
//        
//        
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getSource() == submit){
//            try{
//                String query = "select * from driver where brand = '"+typeofCars.getSelectedItem()+"'";
//                
//                
//                Conn conn = new Conn();
//                ResultSet rs;
//                rs = conn.s.executeQuery(query);
//                table.setModel(DbUtils.resultSetToTableModel(rs));
//                }
//              catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//            else{
//            setVisible(false);
//            new Reception();  
//                    
//        }
//        
//    }
//    public static void main(String[] args){
//        new  PickUp();
//    }
//}
//
//


package hotel.management.system;



import java.awt.BorderLayout;
import java.awt.*;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PickUp extends JFrame {
	Connection Conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private JPanel contentPane;
	private JTable table;
        Choice c1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PickUp frame = new PickUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.dispose();
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public PickUp() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPickUpService = new JLabel("Pick Up Service");
		lblPickUpService.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPickUpService.setBounds(90, 11, 158, 25);
		contentPane.add(lblPickUpService);
		
		JLabel lblTypeOfCar = new JLabel("Type of Car");
		lblTypeOfCar.setBounds(32, 97, 89, 14);
		contentPane.add(lblTypeOfCar);

		
                c1 = new Choice();
                try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from driver");
                    while(rs.next()){
                        c1.add(rs.getString("brand"));    
                    }
                }catch(Exception e){ }
                c1.setBounds(123, 94, 150, 25);
		contentPane.add(c1);

                
		
		JLabel lblInfo = new JLabel("Name");
		lblInfo.setBounds(24, 208, 46, 14);
		contentPane.add(lblInfo);
		
		JButton btnRegister = new JButton("Display");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String SQL = "select * from driver where brand = '"+c1.getSelectedItem()+"'";
				try{
				
					Conn c = new Conn();
					rs = c.s.executeQuery(SQL);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					
				}catch (SQLException ss)
				{
					ss.printStackTrace();
				}
				
				
			}
		});
		btnRegister.setBounds(200, 500, 120, 30);
                btnRegister.setBackground(Color.BLACK);
                btnRegister.setForeground(Color.WHITE);
		contentPane.add(btnRegister);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(420, 500, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		table = new JTable();
		table.setBounds(0, 233, 800, 250);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setBounds(165, 208, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(264, 208, 46, 14);
		contentPane.add(lblGender);
		
		JLabel lblTypeOfDriver = new JLabel("Company");
		lblTypeOfDriver.setBounds(366, 208, 80, 14);
		contentPane.add(lblTypeOfDriver);
		
		JLabel lblDateOfThe = new JLabel("Brand");
		lblDateOfThe.setBounds(486, 208, 105, 14);
		contentPane.add(lblDateOfThe);
	
		JLabel lblAirport = new JLabel("Available");
		lblAirport.setBounds(600, 208, 86, 14);
		contentPane.add(lblAirport);
		
		JLabel lblAvailable = new JLabel("Location");
		lblAvailable.setBounds(700, 208, 73, 14);
		contentPane.add(lblAvailable);
                
                
                
                getContentPane().setBackground(Color.WHITE);
	}
}