//
//package hotel.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class AddEmployee extends JFrame implements ActionListener {
//    
//    JTextField tfname, tfemail, tfphone, tfage, tfsalary, tfaadhar;
//    JRadioButton rbmale, rbfemale;
//    JButton submit;
//    JComboBox cbjob;
//    AddEmployee(){
//        setLayout(null);
//        
//        JLabel lblname = new JLabel("NAME");
//        lblname.setBounds(60,30,120,30);
//        lblname.setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblname);
//        
//        tfname = new JTextField();
//        tfname.setBounds(200,30,150,30);
//        add(tfname);
//        
//        JLabel lblage = new JLabel("AGE");
//        lblage.setBounds(60,80,120,30);
//        lblage.setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblage);
//        
//        tfage = new JTextField();
//        tfage.setBounds(200,80,150,30);
//        add(tfage);
//        
//        JLabel lblgender = new JLabel("GENDER");
//        lblgender .setBounds(60,130,120,30);
//        lblgender .setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblgender );
//        
//        rbmale = new JRadioButton("Male");
//        rbmale.setBounds(200,130,70,30);
//        rbmale.setFont(new Font("Tahoma", Font.PLAIN,14));
//        rbmale.setBackground(Color.WHITE);
//        add(rbmale);
//        
//        rbfemale = new JRadioButton("Female");
//        rbfemale.setBounds(280,130,70,30);
//        rbfemale.setFont(new Font("Tahoma", Font.PLAIN,14));
//        rbfemale.setBackground(Color.WHITE);
//        add(rbfemale);
//        
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(rbmale);
//        bg.add(rbfemale);
//        
//        JLabel lbljob = new JLabel("JOB");
//        lbljob.setBounds(60,180,120,30);
//        lbljob.setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lbljob);
//        
//        String str[] = {"Front Desk Clerk", "Porters", "HouseKeeping", "Kitchen Staff", "Room Service", "Chefs", "Waiter/Waitress", "Manager", "Accountate"};
//        cbjob = new JComboBox(str);
//        cbjob.setBounds(200,180,150,30);
//        cbjob.setBackground(Color.WHITE);
//        add(cbjob);
//        
//        JLabel lblsalary = new JLabel("SALARY");
//        lblsalary .setBounds(60,230,120,30);
//        lblsalary .setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblsalary );
//        
//        tfsalary = new JTextField();
//        tfsalary.setBounds(200,230,150,30);
//        add(tfsalary);
//        
//        JLabel lblphone = new JLabel("PHONE");
//        lblphone.setBounds(60,280,120,30);
//        lblphone.setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblphone);
//        
//        tfphone = new JTextField();
//        tfphone.setBounds(200,280,150,30);
//        add(tfphone);
//        
//        JLabel lblemail = new JLabel("EMAIL");
//        lblemail .setBounds(60,330,120,30);
//        lblemail .setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblemail );
//        
//        tfemail = new JTextField();
//        tfemail .setBounds(200,330,150,30);
//        add(tfemail );
//        
//        JLabel lblaadhar = new JLabel("AADHAR");
//        lblaadhar .setBounds(60,380,120,30);
//        lblaadhar .setFont(new Font("Tahoma", Font.PLAIN,17));
//        add(lblaadhar);
//        
//        tfaadhar = new JTextField();
//        tfaadhar .setBounds(200,380,150,30);
//        add(tfaadhar );
//        
//        submit = new JButton("SUBMIT");
//        submit.setBackground(Color.BLACK);
//        submit.setForeground(Color.WHITE);
//        submit.setBounds(200,430,150,30);
//        submit.addActionListener(this);
//        add(submit);
//        
//        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
//        Image i2 = il.getImage().getScaledInstance(450,450, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(380,60,450,370);
//        add(image);
//        
//        
//        
//        
//        
//        getContentPane().setBackground(Color.WHITE);
//        setBounds(350,200,850,540);
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae){
//        String name = tfname.getName();
//        String age = tfage.getText();
//        String salary = tfsalary.getText();
//        String phone = tfphone.getText();
//        String email = tfemail.getText();
//        String aadhar = tfaadhar.getText();
//        
//        String gender = null;
//        
////        if(name.equals("")){
////            JOptionPane.showMessageDialog(null, "Name should not be empty");
////            return;
////        }
//        
//        if(rbmale.isSelected()){
//            gender = "Male";
//        }
//        else if(rbfemale.isSelected()){
//            gender = "Female";
//        }
//        
//        String job = (String)cbjob.getSelectedItem();
//        
//        try{
//            Conn conn = new Conn();
//            
//     String query = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+job+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
//            
//            conn.s.executeUpdate(query);
//            
//            JOptionPane.showMessageDialog(null, "Employee added successfully");
//            
//            setVisible(false);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
//    public static void main(String[] args){
//        new AddEmployee();
//}
//}
//
//
//
//


package hotel.management.system;


import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame{ //Third Frame

    
	JTextField textField,textField_1, textField_2, textField_3,textField_4,textField_5,textField_6;
        JComboBox c1;

        public AddEmployee(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD EMPLOYEE DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel Passportno = new JLabel("NAME");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(60, 30, 150, 27);
            add(Passportno);
            
            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel Pnrno = new JLabel("AGE");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Pnrno.setBounds(60, 80, 150, 27);
            add(Pnrno);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 120, 150, 27);
            add(Gender);
		
            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(200, 120, 70, 27);
            add(NewRadioButton);
	
            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 120, 70, 27);
            add(Female);
            
            
            JLabel Address = new JLabel("JOB");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 170, 150, 27);
            add(Address);
			
            String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,170,150,30);
            add(c1);
            		
            JLabel Nationality = new JLabel("SALARY");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(60, 220, 150, 27);
            add(Nationality);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);
	
            JLabel Name = new JLabel("PHONE");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(60, 270, 150, 27);
            add(Name);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);
	
            JLabel Phno = new JLabel("AADHAR");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 320, 150, 27);
            add(Phno);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);
	
            
            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(60, 370, 150, 27);
            add(email);
			
            textField_6 = new JTextField();
            textField_6.setBounds(200, 370, 150, 27);
            add(textField_6);
	
            setVisible(true);
	
            JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
            AddPassengers.setForeground(Color.BLUE);
            AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
            AddPassengers.setBounds(450, 24, 442, 35);
            add(AddPassengers);
			
     
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String age = textField_1.getText();
                    String salary = textField_3.getText();
                    String phone = textField_4.getText();
                    String aadhar = textField_5.getText();
                    String email = textField_6.getText();
                   
                    String gender = null;
                    
                    if(NewRadioButton.isSelected()){
                        gender = "male";
                    
                    }else if(Female.isSelected()){
                        gender = "female";
                    }

                            
                    String s6 = (String)c1.getSelectedItem();
                    
                    try {
                        Conn c = new Conn();
                        String str = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(900,600);
            setVisible(true);
            setLocation(530,200);
			
	}
        
    public static void main(String[] args){
        new AddEmployee();
    }   
}