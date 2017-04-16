package com.sd.address.v0;

import java.awt.event.*;
import javax.swing.*;

class AddressBookListener implements ActionListener {
 public void actionPerformed(ActionEvent e) {
  JButton b = (JButton) e.getSource();
  String cmd = e.getActionCommand();
  if (cmd.equals("저장")) {
   System.out.println("저장 완료");
   b.setText("저장 했습니다.");
  } else if (cmd.equals("삭제")) {
   System.out.println("삭제 완료");
   b.setText("삭제 했습니다");
  }
 }
}