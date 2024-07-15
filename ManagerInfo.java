//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//import net.proteanit.sql.*;
//
//public class ManagerInfo extends JFrame implements ActionListener {
//    JTable table;
//    JButton back;
//    ManagerInfo(){
//        
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//       
//        
//        JLabel l1 = new JLabel("Name");
//        l1.setBounds(40,10,100,20);
//        add(l1);
//        
//        JLabel l2 = new JLabel("Age");
//        l2.setBounds(170,10,100,20);
//        add(l2);
//        
//        JLabel l3 = new JLabel("Gender");
//        l3.setBounds(290,10,100,20);
//        add(l3);
//        
//        JLabel l4 = new JLabel("Job");
//        l4.setBounds(400,10,100,20);
//        add(l4);
//        
//        JLabel l5 = new JLabel("Salary");
//        l5.setBounds(540,10,100,20);
//        add(l5);
//        
//        JLabel l6 = new JLabel("Phone");
//        l6.setBounds(670,10,100,20);
//        add(l6);
//        
//        JLabel l7 = new JLabel("Email");
//        l7.setBounds(790,10,100,20);
//        add(l7);
//        
//        JLabel l8 = new JLabel("Aadhar");
//        l8.setBounds(910,10,100,20);
//        add(l8);
//        
//        table = new JTable();
//        table.setBounds(0,40,1000,400);
//        add(table);
//        
//        try{
//            Conn c = new Conn();
//            ResultSet rs = c.s.executeQuery("select * from employee where job = 'Manager'");
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
//        new ManagerInfo();
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

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ManagerInfo extends JFrame {
	Connection Conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblJob;
	private JLabel lblName;
	private JLabel lblDepartment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerInfo frame = new ManagerInfo();
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
	public ManagerInfo() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 34, 1000, 450);
		contentPane.add(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                                    Conn c = new Conn();
				String displayCustomersql = "select * from Employee where job = 'Manager'";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
			
		});
		btnLoadData.setBounds(350, 500, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(510, 500, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(41, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblJob = new JLabel("Age");
		lblJob.setBounds(159, 11, 46, 14);
		contentPane.add(lblJob);
		
		lblName = new JLabel("Gender");
		lblName.setBounds(273, 11, 46, 14);
		contentPane.add(lblName);
		
		lblDepartment = new JLabel("Job");
		lblDepartment.setBounds(416, 11, 86, 14);
		contentPane.add(lblDepartment);
                
                JLabel l1 = new JLabel("Salary");
		l1.setBounds(536, 11, 86, 14);
		contentPane.add(l1);
                
                JLabel l2 = new JLabel("Phone");
		l2.setBounds(656, 11, 86, 14);
		contentPane.add(l2);
                
                JLabel l3 = new JLabel("Aadhar");
		l3.setBounds(786, 11, 86, 14);
		contentPane.add(l3);
                
                JLabel l4 = new JLabel("Gmail");
		l4.setBounds(896, 11, 86, 14);
		contentPane.add(l4);
                
                getContentPane().setBackground(Color.WHITE);
	}
}