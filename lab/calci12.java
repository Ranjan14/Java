//Write a JAVA program to build a Simple Calculator in Swings

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

class SetCalculator extends JFrame implements ActionListener{
 JLabel label1, label2, label3;

 JButton btnPlus, btnMinus, btnMultiply, btnDivide,btnMod, btnClear;
 JTextField txtField1, txtField2, txtField3;
 
 public SetCalculator(){
  setLayout(new GridLayout(5,2));
  setTitle("Simple Calculator using Swing");
  //initializing label
  label1 = new JLabel("Number 1 :",JLabel.LEFT);
  label2 = new JLabel("Number 2 :",JLabel.LEFT);
  label3 = new JLabel("Result :",JLabel.LEFT);
  
  //initializing buttons;
  btnPlus = new JButton("Add");
  btnMinus = new JButton("Subtract");
  btnMultiply = new JButton("Multiply");
  btnDivide = new JButton("Divide");
  btnMod = new JButton("Mod");
  btnClear = new JButton("Clear");
  
  //adding eventlistener
  btnPlus.addActionListener(this);
  btnMinus.addActionListener(this);
  btnMultiply.addActionListener(this);
  btnDivide.addActionListener(this);
  btnMod.addActionListener(this);
  btnClear.addActionListener(this);
  //initializing textfield
  //for(int i = 0; i < 3; i++)
   txtField1 = new JTextField();
   txtField2 = new JTextField();
   txtField3 = new JTextField();
   
  //adding to the frame
  //add(label1,0);
  add(label1);
  //add(txtField1);
  add(label2);
 // add(txtField2);
  add(label3);
 // add(txtField3);
 add(txtField1);
 add(txtField2);
 add(txtField3);
  add(btnPlus);
  add(btnMinus);
  add(btnMultiply);
  add(btnDivide);
  add(btnMod);
  add(btnClear);
 }//end of constructor
 
 
 //action listener method
 public void actionPerformed(ActionEvent event){
  String opt = event.getActionCommand();
  int num1, num2, num = 0;
  num1 = Integer.parseInt(txtField1.getText());
  num2 = Integer.parseInt(txtField2.getText());
  
  
   if(opt.equals("Add"))
    num = num1 + num2;
   else if(opt.equals("Subtract"))
    num = num1 - num2;
   else if(opt.equals("Multiply"))
    num = num1 * num2;
   else if(opt.equals("Divide"))
    num = num1 / num2;
   else if(opt.equals("Mod"))
    num = num1 % num2;
   else if(opt.equals("Clear")){
    txtField1.setText("");
    txtField2.setText("");
    txtField3.setText("");
   }
   txtField3.setText(Integer.toString(num));
  
 }
}

public class calci12 {
 public static void main(String args[]){
  SetCalculator demo = new SetCalculator();
  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  demo.setVisible(true);
  demo.setSize(500,400);
 }
}