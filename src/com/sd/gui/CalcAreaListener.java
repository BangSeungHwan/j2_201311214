package com.sd.gui;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CalcAreaListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
    CalcAreaGUIMain c = new CalcAreaGUIMain();
    if (cmd.equals("���")) {
            b.setText("����߽��ϴ�");
            Double r = Double.parseDouble(c.radiusTf1.getText());
            c.areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
        } else if (cmd.equals("���")) {
            b.setText("����߽��ϴ�");
            c.radiusTf1.setText("0");
            c.areaTf2.setText("0");
        }
    }
}
