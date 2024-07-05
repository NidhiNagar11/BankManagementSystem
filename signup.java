package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12, label13,label14,label15,label16;
    JTextField textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10;
    JRadioButton checkBox1,checkBox2,checkBox3,checkBox4 ,checkbox5;
    JDateChooser dateChooser;
    JButton next;
    Random  r = new Random();
    Long first4 = r.nextLong() %9000L +1000L;
    String first = " " + Math.abs(first4);

    signup(){
        Random  r = new Random();
        Long first4 = r.nextLong() %9000L +1000L;
        String first = " " + Math.abs(first4);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5,5,100,100);
        add(image);

        label1 = new JLabel("Application Form No :" + first);
        label1.setFont(new Font("Raleway" , Font.BOLD,28));
        label1.setBounds(160,20,700,40);
        label1.setForeground(Color.BLACK);
        add(label1);

        label2  = new JLabel("Page 1");
        label2.setBounds(300,60,400,30);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setForeground(Color.BLACK);
        add(label2);

        label3 = new JLabel("Personal Deltail");
        label3.setBounds(265,90,400,30);
        label3.setForeground(Color.BLACK);
        label3.setFont( new Font("Ralway",Font.BOLD,20));
        add(label3);

        label4 = new JLabel("Name:");
        label4.setBounds(60,170,300,30);
        label4.setFont(new Font("RALEWAY ",Font.PLAIN,20));
        label4.setForeground(Color.BLACK);
        add(label4);

        textField1 = new JTextField(15);
        textField1.setBounds(250 , 170 , 250, 25);
        textField1.setFont(new Font("Raleway",Font.PLAIN,20));
        textField1.setForeground(Color.BLACK);
        textField1.setBackground(Color.white);
        add(textField1);

        label5 = new JLabel("Father's Name:");
        label5.setBounds(60,210,300,30);
        label5.setFont(new Font("RALWAY", Font.PLAIN,20));
        label5.setForeground(Color.BLACK);
        add(label5);

        textField2 = new JTextField(15);
        textField2.setBounds(250 , 210 , 250, 25);
        textField2.setFont(new Font("Raleway",Font.PLAIN,20));
        textField2.setForeground(Color.BLACK);
        textField2.setBackground(Color.white);
        add(textField2);

        label6 = new JLabel("Gender :");
        label6.setBounds(60,250,300,30);
        label6.setFont(new Font("RALWAY", Font.PLAIN,20));
        label6.setForeground(Color.BLACK);
        add(label6);

        checkBox1= new JRadioButton("Male");
        checkBox1.setBounds(250,250 , 60, 20);
        checkBox1.setFont(new Font("Raleway",Font.PLAIN,15));
        checkBox1.setBackground(new Color(167, 201, 157));
        add(checkBox1);

        checkBox2= new JRadioButton("Female");
        checkBox2.setBounds(370,250 , 90, 20);
        checkBox2.setFont(new Font("Raleway",Font.PLAIN,15));
        checkBox2.setBackground(new Color(167, 201, 157));
        add(checkBox2);

        ButtonGroup buttongrp = new ButtonGroup();
        buttongrp.add(checkBox1);
        buttongrp.add(checkBox2);



        label7 = new JLabel("Date of Birth:");
        label7.setBounds(60,290,300,30);
        label7.setFont(new Font("RALWAY", Font.PLAIN,20));
        label7.setForeground(Color.BLACK);
        add(label7);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(250 , 290 , 250, 25);
        dateChooser.setFont(new Font("Raleway",Font.PLAIN,20));
        dateChooser.setBackground(Color.white);
        add(dateChooser);

        label8 = new JLabel("Email:");
        label8.setBounds(60,330,300,30);
        label8.setFont(new Font("RALWAY", Font.PLAIN,20));
        label8.setForeground(Color.BLACK);
        add(label8);

        textField3 = new JTextField(15);
        textField3.setBounds(250 , 330, 250, 25);
        textField3.setFont(new Font("Raleway",Font.PLAIN,20));
        textField3.setForeground(Color.BLACK);
        textField3.setBackground(Color.white);
        add(textField3);

        label9 = new JLabel("Marital Status:");
        label9.setBounds(60,370,300,30);
        label9.setFont(new Font("RALWAY", Font.PLAIN,20));
        label9.setForeground(Color.BLACK);
        add(label9);

        checkBox3 = new JRadioButton("Married");
        checkBox3.setBounds(250,370 , 80, 20);
        checkBox3.setFont(new Font("Raleway",Font.BOLD,10));
        checkBox3.setBackground(new Color(167, 201, 157));
        add(checkBox3);

        checkBox4 = new JRadioButton("Unmarried");
        checkBox4.setBounds(330,370 , 80, 20);
        checkBox4.setFont(new Font("Raleway",Font.BOLD,10));
        checkBox4.setBackground(new Color(167, 201, 157));
        add(checkBox4);


        checkbox5 = new JRadioButton("Other");
        checkbox5.setBounds(420,370 , 80, 20);
        checkbox5.setFont(new Font("Raleway",Font.BOLD,10));
        checkbox5.setBackground(new Color(167, 201, 157));
        add(checkbox5);

        buttongrp = new ButtonGroup();
        buttongrp.add(checkBox3);
        buttongrp.add(checkBox4);
        buttongrp.add(checkbox5);

        label10 = new JLabel("Address :");
        label10.setBounds(60,410,300,30);
        label10.setFont(new Font("RALWAY", Font.PLAIN,20));
        label10.setForeground(Color.BLACK);
        add(label10);

        textField4= new JTextField(15);
        textField4.setBounds(250 , 410 , 250, 25);
        textField4.setFont(new Font("Raleway",Font.PLAIN,20));
        textField4.setForeground(Color.BLACK);
        textField4.setBackground(Color.white);
        add(textField4);

        label11 = new JLabel("State:");
        label11.setBounds(60,450,300,30);
        label11.setFont(new Font("RALWAY", Font.PLAIN,20));
        label11.setForeground(Color.BLACK);
        add(label11);

        textField5 = new JTextField(15);
        textField5.setBounds(250 , 450 , 250, 25);
        textField5.setFont(new Font("Raleway",Font.PLAIN,20));
        textField5.setForeground(Color.BLACK);
        textField5.setBackground(Color.white);
        add(textField5);

        label12 = new JLabel("City:");
        label12.setBounds(60,490,300,30);
        label12.setFont(new Font("RALWAY", Font.PLAIN,20));
        label12.setForeground(Color.BLACK);
        add(label12);

        textField6= new JTextField(15);
        textField6.setBounds(250 , 490 , 250, 25);
        textField6.setFont(new Font("Raleway",Font.PLAIN,20));
        textField6.setForeground(Color.BLACK);
        textField6.setBackground(Color.white);
        add(textField6);

        label13 = new JLabel("PIN Code :");
        label13.setBounds(60,530,300,30);
        label13.setFont( new Font("Ralway",Font.PLAIN,20));
        label13.setForeground(Color.BLACK);
        add(label13);

        textField7 = new JTextField(15);
        textField7.setBounds(250 , 530 , 250, 25);
        textField7.setFont(new Font("Raleway",Font.PLAIN,20));
        textField7.setForeground(Color.BLACK);
        textField7.setBackground(Color.white);
        add(textField7);

        next = new JButton("Next");
        next.setBounds(395,560 , 100, 19);
        next.setFont(new Font("Raleway",Font.PLAIN,15));
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(167, 201, 157) );
        setLayout(null);
        setSize(850,750);
        setLocation(750,80);
        setBounds(300,15,700,700);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first ;
        String name = textField1.getText();
        String fname = textField2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(checkBox1.isSelected()){
            gender = "Male";
        }
        else if(checkBox2.isSelected()){
            gender ="Female";
        }

        String  email = textField3.getText();
        String maritalstatus  =null;
        if(checkBox3.isSelected()){
            maritalstatus = "Married";
        }
        else if (checkBox4.isSelected()){
            maritalstatus = "Unmarried";
        }
        else if(checkbox5.isSelected()){
            maritalstatus = "Other";
        }
       String address = textField4.getText();
        String state = textField5.getText();
        String city = textField6.getText();
        String pincode = textField7.getText();
        try{
         if(textField2.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please required field");

         }
         else {
             con con1 = new con();
             String q = "insert into signup values ( '"+formno+"', '"+name+"' ,'"+fname+"','"+gender+"','"+dob+"','"+email+"','"+maritalstatus+"','"+address+"','"+state+"','"+city+"','"+pincode+"')";
             con1.statement.executeUpdate(q);
             new signup2(first);
             setVisible(false);
         }
        }
        catch (Exception E){
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new signup();
    }
}
