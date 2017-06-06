package com.sd.address.v1;

import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.Iterator;

class AddressBookListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  JButton b = (JButton) e.getSource();
  PersonDAOImpl personDAOImpl = new PersonDAOImpl();
  PersonVO person = new PersonVO();
  AddressBookMain a = new AddressBookMain();
  String cmd = e.getActionCommand();
  
  if (cmd.equals("저장")) {
    person.setName(a.nameTf1.getText());
    person.setAddress(a.phoneTf1.getText());
    personDAOImpl.insert(person);
  } else if (cmd.equals("삭제")) {
    int x = Integer.parseInt(a.numberTf1.getText());
    personDAOImpl.delete(x);
  }
 }
}