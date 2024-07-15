//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.*;
//
//public class Login extends JFrame implements ActionListener {
//    JTextField username;
//    JPasswordField password;
//    JButton login, cancel;
//    Login(){
//        
//        getContentPane().setBackground(Color.WHITE);
//        
//        setLayout(null);
//        
//        JLabel user = new JLabel("Username");
//        user.setBounds(40,20,100,30);
//        add(user);
//         username = new JTextField();
//        username.setBounds(150,20,150,30);
//        add(username);
//        
//        JLabel pass = new JLabel("Password");
//        pass.setBounds(40,70,100,30);
//        add(pass);
//        password = new JPasswordField();
//        password.setBounds(150,70,150,30);
//        add(password);
//        
//         login = new JButton("Login");
//        login.setBounds(40,150,120,30);
//        login.setBackground(Color.BLACK);
//        login.setForeground(Color.WHITE);
//        login.addActionListener(this);
//        add(login);
//        
//        cancel = new JButton("Cancel");
//        cancel.setBounds(180,150,120,30);
//        cancel.setBackground(Color.BLACK);
//        cancel.setForeground(Color.WHITE);
//        cancel.addActionListener(this);
//        add(cancel);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
//        Image i2 = il.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350,10,200,200);
//        add(image);
//        
//        setBounds(500,200,600,300);
//        setVisible(true);
//    }
//        
//        public void actionPerformed(ActionEvent ae){
//             if(ae.getSource() == login){
//                String user =  username.getText();
//                String pass = password.getText();
//                
//                try{
//                    Conn c = new Conn();
//                    
//                    String query = "select * from login where username = '" + user + "' and password = '" + pass + "'";
//                    
//                     ResultSet rs = c.s.executeQuery(query);
//                     
//                     if(rs.next()){
//                         setVisible(false);
//                         new Dashboard();
//                     }
//                     else{
//                         JOptionPane.showMessageDialog(null, "Invalid username or password");
//                         setVisible(false);
//                     }
//                }
//                catch(Exception e){
//                    e.printStackTrace();
//                }
//             }
//             else if(ae.getSource() == cancel){
//                 setVisible(false);
//             }
//            }
//    
//    public static void main(String[] args){
//        new Login();
//    }
//}
//
//


package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){

        super("Login");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(600,350);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
        try{
            Conn c1 = new Conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){ 
                new Dashboard().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
    }
    public static void main(String[] arg){
        new Login();
    }
}
//
//import java.awt.EventQueue;
//import java.sql.*;	
//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Image;
//
//public class Login {
//Connection conn = null;
//ResultSet rs = null;
//PreparedStatement pst = null;
//
//	private JFrame frame;
//	private JTextField txt_username;
//	private JPasswordField txt_password;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login window = new Login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
//	/**
//	 * Create the application.
//	 * @throws SQLException 
//	 */
//	public Login() throws SQLException {
//		initialize();
//		//conn = Javaconnect.getDBConnection();
//	}
//	public void close(){
//		this.frame.dispose();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 683, 445);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblUsername = new JLabel("Username:");
//		lblUsername.setBounds(357, 114, 67, 27);
//		frame.getContentPane().add(lblUsername);
//		
//		JLabel lblPassword = new JLabel("Password:");
//		lblPassword.setBounds(357, 187, 67, 27);
//		frame.getContentPane().add(lblPassword);
//		
//		txt_username = new JTextField();
//		txt_username.setBounds(419, 117, 86, 20);
//		frame.getContentPane().add(txt_username);
//		txt_username.setColumns(10);
//		
//		JButton btnLogin = new JButton("Login");
//		btnLogin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				String loginsql = "select * from Manager where m_name=? and password=?";
////				try{
////					pst = conn.prepareStatement(loginsql);
////					pst.setString(1, txt_username.getText());
////					pst.setString(2, txt_password.getText());
////					
////					rs = pst.executeQuery();
////					if(rs.next()){
////						JOptionPane.showMessageDialog(null, "Login Successful");
////						Manager manager = new Manager();
////						manager.setVisible(true);
////						close();
////					}
////					else
////					{
////						JOptionPane.showMessageDialog(null, "Username and Password is incorrect");
////					}
////				}
////				catch(Exception e){
////					JOptionPane.showMessageDialog(null, "Username and Password is incorrect");
////				}
//			}
//		});
//		btnLogin.setBounds(400, 275, 89, 23);
//		frame.getContentPane().add(btnLogin);
//		
//		txt_password = new JPasswordField();
//		txt_password.setBounds(418, 190, 87, 20);
//		frame.getContentPane().add(txt_password);
//	}
//}