package com.sd.address.v0;

import java.awt.event.*;
import javax.swing.*;

class AddressBookListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  JButton b = (JButton) e.getSource();
  String cmd = e.getActionCommand();
  if (cmd.equals("����")) {
   System.out.println("���� �Ϸ�");
   b.setText("���� �߽��ϴ�.");
  } else if (cmd.equals("����")) {
   System.out.println("���� �Ϸ�");
   b.setText("���� �߽��ϴ�");
  }
 }
}