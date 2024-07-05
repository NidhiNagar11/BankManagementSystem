package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
    String formno;
    JComboBox combo1,combo2,combo3,combo4,combo5,combo6,combo7,combo8,combo9,combo10;
    JTextField textfield1,textfield2;
    JRadioButton button1,button2,button3,button4;
    ButtonGroup buttonGroup1,buttonGroup2;
    JButton next;
    signup2(String formno){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,5,100,100);
        add(image);

        this.formno = formno;


        label1 = new JLabel("Page 2:");
        label1.setBounds(300,2,100,100);
        label1.setFont(new Font("Ralway",Font.BOLD,25));
        add(label1);

        label2 = new JLabel("ADDITIONAL DATA");
        label2.setBounds(300,40,800,100);
        label2.setFont(new Font("Ralway",Font.BOLD,30));
        add(label2);

        label3 = new JLabel("Religion :");
        label3.setBounds(80,140,800,100);
        label3.setFont(new Font("Ralway:",Font.BOLD,20));
        label3.setForeground(Color.BLACK);
        add(label3);

        String religion[] ={"Hindu" ,"Muslim" ,"Christian","Sikh","Other"};
        combo1 = new JComboBox<>(religion);
        combo1.setBounds(260,180,400,25);
        combo1.setFont(new Font("Ralway",Font.BOLD,20));
        add(combo1);


        label4 = new JLabel("Category :");
        label4.setBounds(80,190 ,800,100);
        label4.setFont(new Font("Ralway",Font.BOLD,20));
        label4.setForeground(Color.BLACK);
        add(label4);

        String catagory[] = {"General","OBC","SC","ST","Other"};
        combo2 = new JComboBox(catagory);
        combo2.setBounds(260,230,400,25);
        combo2.setFont(new Font("Ralway",Font.BOLD,20));
        add(combo2);


        label5 = new JLabel("Income :");
        label5.setBounds(80,240 ,800,100);
        label5.setFont(new Font("Ralway",Font.BOLD,20));
        label5.setForeground(Color.BLACK);
        add(label5);

        String income [] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        combo3 = new JComboBox(income);
        combo3.setBounds(260,277,400,25);
        combo3.setFont(new Font("Ralway",Font.BOLD,20));
        add(combo3);





        label6 = new JLabel("Educational");
        label6.setBounds(80,290 ,800,100);
        label6.setFont(new Font("Ralway",Font.BOLD,20));
        label6.setForeground(Color.BLACK);
        add(label6);
        label7 = new JLabel("Qualification :");
        label7.setBounds(80,320 ,800,100);
        label7.setFont(new Font("Ralway",Font.BOLD,20));
        label7.setForeground(Color.BLACK);
        add(label7);

        String education [] ={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        combo4 = new JComboBox(education);
        combo4.setBounds(260,340,400,25);
        combo4.setFont(new Font("Ralway",Font.BOLD,20));
        add(combo4);

        label8 = new JLabel("Occupation :");
        label8.setBounds(80,370 ,800,100);
        label8.setFont(new Font("Ralway",Font.BOLD,20));
        label8.setForeground(Color.BLACK);
        add(label8);

        String occupation []={"Salaried","Self-Employment","Business","Student","Retired","Other"};
        combo5 = new JComboBox<>(occupation);
        combo5.setBounds(260,410,400,25);
        combo5.setFont(new Font("Ralway",Font.BOLD,20));
        add(combo5);



        label9 = new JLabel("PAN Number :");
        label9.setBounds(80,420 ,800,100);
        label9.setFont(new Font("Ralway",Font.BOLD,20));
        label9.setForeground(Color.BLACK);
        add(label9);

        textfield1 = new JTextField();
        textfield1.setBounds(260,460,400,25);
        textfield1.setFont(new Font("Ralway",Font.BOLD,20));
        add(textfield1);



        label10 = new JLabel("Aadhar Number:");
        label10.setBounds(80,470 ,800,100);
        label10.setFont(new Font("Ralway",Font.BOLD,20));
        label10.setForeground(Color.BLACK);
        add(label10);

        textfield2 = new JTextField();
        textfield2.setBounds(260,510,400,25);
        textfield2.setFont(new Font("Ralway",Font.BOLD,20));
        add(textfield2);

        label11 = new JLabel("Senior Citizen :");
        label11.setBounds(80,520 ,800,100);
        label11.setFont(new Font("Ralway",Font.BOLD,20));
        label11.setForeground(Color.BLACK);
        add(label11);

        button1 = new JRadioButton("Yes");
        button1.setBounds(300,560 ,100,25);
        button1.setFont(new Font("Ralway",Font.BOLD,20));
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(198, 198, 128));
        add(button1);

        button2 = new JRadioButton("No");
        button2.setBounds(450,560 ,400,25);
        button2.setFont(new Font("Ralway",Font.BOLD,20));
        button2.setForeground(Color.BLACK);
        button2.setBackground(new Color(198, 198, 128));
        add(button2);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(button1);
        buttonGroup1.add(button2);



        label12 = new JLabel("Existing Number:");
        label12.setBounds(80,570 ,800,100);
        label12.setFont(new Font("Ralway",Font.BOLD,20));
        label12.setForeground(Color.BLACK);
        add(label12);


        button3 = new JRadioButton("Yes");
        button3.setBounds(300,610 ,100,25);
        button3.setFont(new Font("Ralway",Font.BOLD,20));
        button3.setForeground(Color.BLACK);
        button3.setBackground(new Color(198, 198, 128));
        add(button3);

        button4 = new JRadioButton("No");
        button4.setBounds(450,610 ,100,25);
        button4.setFont(new Font("Ralway",Font.BOLD,20));
        button4.setForeground(Color.BLACK);
        button4.setBackground(new Color(198, 198, 128));
        add(button4);

        buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(button3);
        buttonGroup2.add(button4);


        JLabel label13 = new JLabel("Form No:");
        label13.setBounds(610,0 ,800,100);
        label13.setFont(new Font("Ralway",Font.BOLD,15));
        label13.setForeground(Color.BLACK);
        add(label13);

        JLabel label14 = new JLabel(formno);
        label14.setBounds(680,0 ,800,100);
        label14.setFont(new Font("Ralway",Font.BOLD,15));
        label14.setForeground(Color.BLACK);
        add(label14);

        next = new JButton("Next");
        next.setBounds(550,650 , 100, 19);
        next.setFont(new Font("Raleway",Font.PLAIN,15));
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(750,80);
        setBounds(300,15,800,800);
        getContentPane().setBackground(	new Color(198, 198, 128));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String religion = (String) combo1.getSelectedItem();
     String category = (String) combo2.getSelectedItem();
     String income = (String) combo3.getSelectedItem();

     String education = (String) combo4.getSelectedItem();
     String occupation = (String) combo5.getSelectedItem();

     String PAN_no = textfield1.getText();
     String Aadhar_no = textfield2.getText();
     String seniorcitizen =null;
     if(button1.isSelected()){
         seniorcitizen = "Yes";
     }
     else if(button2.isSelected()){
         seniorcitizen = "No";
     }
     String existingno = null;
     if(button3.isSelected()){
         existingno = "Yes";
     }
     else if(button4.isSelected()){
         existingno = "No";
     }

     try{
         if(textfield1.getText().equals("")|| textfield2.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Fill the required field");}
         else
         {
             con con2 = new con();
             String q = "insert into signup2 values ( '"+formno+"', '"+religion+"' ,'"+category+"','"+income+"','"+education+"','"+occupation+"','"+PAN_no+"','"+Aadhar_no+"','"+seniorcitizen+"','"+existingno+"')";
             con2.statement.executeUpdate(q);
             new Signup3(formno);
             setVisible(false);
         }
     }
     catch (Exception E){
         E.printStackTrace();
     }







    }

    public static void main(String[] args) {
     new signup2("");
    }
}
