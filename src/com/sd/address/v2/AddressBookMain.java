package com.sd.address.v2;

import java.awt.*;
import javax.swing.*;

public class AddressBookMain {
  static JTextField numberTf1=new JTextField(20);
  static JTextField nameTf1=new JTextField(20);
  static JTextField phoneTf1=new JTextField(20);
    public static void main(String[] args) {
        JFrame f=new JFrame("201311214 Address Book");
        JPanel panel=new JPanel(new GridLayout(5,2));
        f.getContentPane().add(panel);
        f.setSize(200, 400);
        JLabel number=new JLabel("번호");
        JLabel name=new JLabel("이름");
        JLabel phone=new JLabel("연락처");
        
        JButton b1=new JButton("저장");
        JButton b2=new JButton("삭제");
        JButton b3 = new JButton("번호로 검색");
        JButton b4 = new JButton("모두검색");
        
        b1.addActionListener(new AddressBookListener());
        b2.addActionListener(new AddressBookListener());
        b3.addActionListener(new AddressBookListener());
        b4.addActionListener(new AddressBookListener());
        
        panel.add(number);
        panel.add(numberTf1);
        
        panel.add(name);
        panel.add(nameTf1);
        
        panel.add(phone);
        panel.add(phoneTf1);
        
        panel.add(b1);
        panel.add(b2); 
        panel.add(b3);
        panel.add(b4);
        
        f.pack();
        f.setVisible(true);
    }   
}