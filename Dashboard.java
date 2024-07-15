//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Dashboard extends JFrame implements ActionListener{
//    Dashboard(){
//        setBounds(0,0,1550,1000);
//        
//        setLayout(null);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
//        Image i2 =  il.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0,0,1550,1000);
//        add(image);
//        
//        JLabel text = new JLabel("THE HOTEL RADISON PLACE");
//        text.setBounds(400,80,1000,50);
//        text.setFont(new Font("Tahuma", Font.PLAIN, 46));
//        text.setForeground(Color.WHITE);
//        image.add(text);
//        
//        JMenuBar mb = new JMenuBar();
//        mb.setBounds(0,0,1550,30);
//        image.add(mb);
//        
//        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
//        hotel.setForeground(Color.RED);
//        mb.add(hotel);
//        
//        JMenuItem reception = new JMenuItem("RECEPTION");
//        reception.addActionListener(this);
//        hotel.add(reception);
//        
//        JMenu admin = new JMenu("ADMIN");
//        admin.setForeground(Color.BLUE);
//        mb.add(admin);
//        
//        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
//        addemployee.addActionListener(this);
//        admin.add(addemployee);
//        
//        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
//        addrooms.addActionListener(this);
//        admin.add(addrooms);
//        
//        
//        
//        
//        
//        JMenuItem adddrivers = new JMenuItem("ADD DRIVERS");
//        adddrivers.addActionListener(this);
//        admin.add(adddrivers);
//        
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        if(ae.getActionCommand().equals("ADD EMPLOYEE")){
//            new AddEmployee();
//        }
//        else if(ae.getActionCommand().equals("ADD ROOMS")){
//            new AddRooms();
//        }
//        else if(ae.getActionCommand().equals("ADD DRIVERS")){
//            new AddDriver();
//        }
//        else if(ae.getActionCommand().equals("RECEPTION")){
//            new Reception();
//        }
//    }
//    public static void main(String[] args){
//        new Dashboard();
//    }
//}


package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel AirlineManagementSystem = new JLabel("THE RADISON PLACE WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	AirlineManagementSystem.setBounds(600, 60, 1000, 85);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	AirlineSystem.add(FlightDetails);
		
	JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
	menuBar.add(AirlineSystemHello);
        
        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	AirlineSystemHello.add(FlightDetailshello1);
        
        FlightDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
	AirlineSystemHello.add(FlightDetailshello2);
        
        FlightDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRooms().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	AirlineSystemHello.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}