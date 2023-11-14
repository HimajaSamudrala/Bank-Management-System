package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField panTextField,aadharTextField;
    JRadioButton sYes, sNo, eYes, eNo;
    JButton next;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("Application Form Page 2");
        
        JLabel additionalDetails = new JLabel("PAGE 2 : ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religionname = new JLabel("Religion: ");
        religionname.setFont(new Font("Raleway", Font.BOLD, 20));
        religionname.setBounds(100, 140, 100, 30);
        add(religionname);
        
        String valReligion[] = {"--SELECT--", "HINDU","MUSLIM","CHRISTIAN","SIKH","OTHER"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion); 
        
        JLabel categoryname = new JLabel("Category: ");
        categoryname.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryname.setBounds(100, 190, 200, 30);
        add(categoryname);
        
        String valCategory[] = {"--SELECT--", "GENERAL","OBC","SC","ST","OTHER"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel incomename = new JLabel("Income: ");
        incomename.setFont(new Font("Raleway", Font.BOLD, 20));
        incomename.setBounds(100, 240, 200, 30);
        add(incomename);
        
        String valIncome[] = {"--SELECT--", "NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000 "};
        income = new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel eduname = new JLabel("Educational ");
        eduname.setFont(new Font("Raleway", Font.BOLD, 20));
        eduname.setBounds(100, 290, 200, 30);
        add(eduname);
        
        JLabel qualname = new JLabel("Qualification: ");
        qualname.setFont(new Font("Raleway", Font.BOLD, 20));
        qualname.setBounds(100, 315, 200, 30);
        add(qualname);
        
        String valEducational[] = {"--SELECT--", "Non-Graduation","Graduate","Post-Graduate","Doctorate","Other"};
        education = new JComboBox(valEducational);
        education.setBounds(300, 312, 400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel occupationname = new JLabel("Occupation: ");
        occupationname.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationname.setBounds(100, 390, 200, 30);
        add(occupationname);
        
        String valOccupation[] = {"--SELECT--", "Salried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel seniorc = new JLabel("Senior Citizen: ");
        seniorc.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorc.setBounds(100, 540, 200, 30);
        add(seniorc);
        
        sYes = new JRadioButton("Yes");
        sYes.setFont(new Font("Raleway", Font.BOLD, 15));
        sYes.setBounds(300, 540, 120,30);
        sYes.setBackground(Color.WHITE);
        add(sYes);
        
        sNo = new JRadioButton("No");
        sNo.setFont(new Font("Raleway", Font.BOLD, 15));
        sNo.setBounds(450, 540, 140,30);
        sNo.setBackground(Color.WHITE);
        add(sNo);
        
        ButtonGroup seniorcgroup = new ButtonGroup();
        seniorcgroup.add(sYes);
        seniorcgroup.add(sNo);
        
        JLabel existing = new JLabel("Existing Account: ");
        existing.setFont(new Font("Raleway", Font.BOLD, 20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);
        
        eYes = new JRadioButton("Yes");
        eYes.setFont(new Font("Raleway", Font.BOLD, 15));
        eYes.setBounds(300, 590, 120,30);
        eYes.setBackground(Color.WHITE);
        add(eYes);
        
        eNo = new JRadioButton("No");
        eNo.setFont(new Font("Raleway", Font.BOLD, 15));
        eNo.setBounds(450, 590, 140,30);
        eNo.setBackground(Color.WHITE);
        add(eNo);
        
        ButtonGroup existingcgroup = new ButtonGroup();
        existingcgroup.add(eYes);
        existingcgroup.add(eNo);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(sYes.isSelected())
        {
            seniorcitizen = "Yes";
        }
        else
        {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(eYes.isSelected())
        {
            existingaccount = "Yes";
        }
        else
        {
            existingaccount = "No";
        }
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
 
        try
        {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+existingaccount+"','"+pan+"','"+aadhar+"')";
            c.s.executeUpdate(query);
            
            //signupthree object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    { 
        new SignupTwo("");
    }
    
}