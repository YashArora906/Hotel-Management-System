//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//import net.proteanit.sql.*;
//
//public class CustomerInfo extends JFrame implements ActionListener {
//    JTable table;
//    JButton back;
//    CustomerInfo(){
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//       
//        
//        JLabel l1 = new JLabel("Document type");
//        l1.setBounds(10,10,100,20);
//        add(l1);
//        
//        JLabel l2 = new JLabel("Number");
//        l2.setBounds(160,10,100,20);
//        add(l2);
//        
//        JLabel l3 = new JLabel("Name");
//        l3.setBounds(290,10,100,20);
//        add(l3);
//        
//        JLabel l4 = new JLabel("Gender");
//        l4.setBounds(410,10,100,20);
//        add(l4);
//        
//        JLabel l5 = new JLabel("Country");
//        l5.setBounds(540,10,100,20);
//        add(l5);
//        
//        JLabel l6 = new JLabel("Room No");
//        l6.setBounds(640,10,100,20);
//        add(l6);
//        
//        JLabel l7 = new JLabel("Checkin time");
//        l7.setBounds(760,10,100,20);
//        add(l7);
//        
//        JLabel l8 = new JLabel("Deposit");
//        l8.setBounds(900,10,100,20);
//        add(l8);
//        
//        table = new JTable();
//        table.setBounds(0,40,1000,400);
//        add(table);
//        
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from customer");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        back.setBounds(420,500,120,30);
//        add(back);
//        
//        
//        
//        setBounds(300,200,1000,600);
//        setVisible(true);
//        
//        
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        setVisible(false);
//        new Reception();
//    }
//    public static void main(String[] args){
//        new CustomerInfo();
//    }
//}
//
//
//


package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import java.sql.*;	
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerInfo extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JLabel lblId;
	private JLabel lblNewLabel;
	private JLabel lblGender;
	private JTable table;
	private JLabel lblCountry;
	private JLabel lblRoom;
	private JLabel lblStatus;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfo frame = new CustomerInfo();
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
	public CustomerInfo() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 200, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(450, 510, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
                                    Conn c  = new Conn();
                                    
				String displayCustomersql = "select * from Customer";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
			
		});
		btnLoadData.setBounds(300, 510, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		lblId = new JLabel("ID");
		lblId.setBounds(31, 11, 46, 14);
		contentPane.add(lblId);
                
                JLabel l1 = new JLabel("Number");
		l1.setBounds(150, 11, 46, 14);
		contentPane.add(l1);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(270, 11, 65, 14);
		contentPane.add(lblNewLabel);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(360, 11, 46, 14);
		contentPane.add(lblGender);
		
		table = new JTable();
		table.setBounds(0, 40, 900, 450);
		contentPane.add(table);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(480, 11, 46, 14);
		contentPane.add(lblCountry);
		
		lblRoom = new JLabel("Room");
		lblRoom.setBounds(600, 11, 46, 14);
		contentPane.add(lblRoom);
		
		lblStatus = new JLabel("Check-in Status");
		lblStatus.setBounds(680, 11, 100, 14);
		contentPane.add(lblStatus);
		
		lblNewLabel_1 = new JLabel("Deposit");
		lblNewLabel_1.setBounds(800, 11, 100, 14);
		contentPane.add(lblNewLabel_1);
                
                getContentPane().setBackground(Color.WHITE);
	}
}