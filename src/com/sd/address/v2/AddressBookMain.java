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
        JLabel number=new JLabel("��ȣ");
        JLabel name=new JLabel("�̸�");
        JLabel phone=new JLabel("����ó");
        
        JButton b1=new JButton("����");
        JButton b2=new JButton("����");
        JButton b3 = new JButton("��ȣ�� �˻�");
        JButton b4 = new JButton("��ΰ˻�");
        
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