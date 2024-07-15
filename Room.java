//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//import net.proteanit.sql.*;
//
//public class Room extends JFrame implements ActionListener {
//    JTable table;
//    JButton back;
//    Room(){
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
//        Image i2 = il.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(500,0,600,600);
//        add(image);
//        
//        JLabel l1 = new JLabel("Room Number");
//        l1.setBounds(10,10,100,20);
//        add(l1);
//        
//        JLabel l2 = new JLabel("Availability");
//        l2.setBounds(120,10,100,20);
//        add(l2);
//        
//        JLabel l3 = new JLabel("Status");
//        l3.setBounds(230,10,100,20);
//        add(l3);
//        
//        JLabel l4 = new JLabel("Price");
//        l4.setBounds(330,10,100,20);
//        add(l4);
//        
//        JLabel l5 = new JLabel("Bed Type");
//        l5.setBounds(410,10,100,20);
//        add(l5);
//        
//        table = new JTable();
//        table.setBounds(0,40,500,400);
//        add(table);
//        
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from room");
//            table.setModel(DbUtils.resultSetToTableModel(rs));
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        back = new JButton("Back");
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        back.setBounds(200,500,120,30);
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
//        setVisible(false);
//        new Reception();
//    }
//    public static void main(String[] args){
//        new Room();
//    }
//}
//
//


package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Room extends JFrame {
	Connection Conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

        
	public Room() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
                Image i3 = i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,0,600,600);
                add(l1);
                
		
		table = new JTable();
		table.setBounds(0, 40, 500, 400);
		contentPane.add(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                                    Conn c = new Conn();
					String displayCustomersql = "select * from Room";
					//PreparedStatement pst = conn.prepareStatement(displayCustomersql);
					ResultSet rs = c.s.executeQuery(displayCustomersql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnLoadData.setBounds(100, 470, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnNewButton.setBounds(290, 470, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("Availability");
		lblAvailability.setBounds(119, 15, 69, 14);
		contentPane.add(lblAvailability);
		
		lblCleanStatus = new JLabel("Clean Status");
		lblCleanStatus.setBounds(216, 15, 76, 14);
		contentPane.add(lblCleanStatus);
		
		lblNewLabel = new JLabel("Price");
		lblNewLabel.setBounds(330, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Bed Type");
		lblNewLabel_1.setBounds(417, 15, 76, 14);
		contentPane.add(lblNewLabel_1);

		
		lblId = new JLabel("Room Number");
		lblId.setBounds(12, 15, 90, 14);
		contentPane.add(lblId);
                
                getContentPane().setBackground(Color.WHITE);
	}

}