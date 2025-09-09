package Calculator;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;

public class Calculator implements ActionListener{

	
	public JFrame window;
	JPanel panel;
	JButton but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,add,sub,mul,div,empty,clear,fun,delete,enter,dec;
	Font font;
	JTextField textf;
	int count=0;
	int endcount=0;
	double num1=0.0;
	double num2=0.0;
	double result=0.0;
	String operation = "";
	boolean funbut;
	
	
	public Calculator() {
		
		window = new JFrame("Calculator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(650, 100, 420,550);
		
		window.setResizable(false);
		window.setLayout(null);
		window.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 100,405,415);
		panel.setLayout(new GridLayout(5,4));
		panel.setBackground(Color.BLACK);
		
	
		 but0 =new JButton("0");
		 but1 =new JButton("1");
		 but2 =new JButton("2");
		 but3 =new JButton("3");
		 but4 =new JButton("4");
		 but5 =new JButton("5");
		 but6 =new JButton("6");
		 but7 =new JButton("7");
		 but8 =new JButton("8");
		 but9 =new JButton("9");
		
		 add = new JButton("+");
		 sub = new JButton("-");
		
		 div = new JButton("/");
		 mul = new JButton("*");
		
		 dec = new JButton(".");
		
		 enter = new JButton("Enter");
		 clear = new JButton("Clear");
		
		 empty = new JButton("");
		 fun = new JButton("FUN");
		 delete = new JButton("Delete");
		
		 
		 
		 but0.addActionListener(this);
		 but1.addActionListener(this);
		 but2.addActionListener(this);
		 but3.addActionListener(this);
		 but4.addActionListener(this);
		 but5.addActionListener(this);
		 but6.addActionListener(this);
		 but7.addActionListener(this);
		 but8.addActionListener(this);
		 but9.addActionListener(this);
		 add.addActionListener(this);
		 sub.addActionListener(this);
		 mul.addActionListener(this);
		 div.addActionListener(this);
		 dec.addActionListener(this);
		 enter.addActionListener(this);
		 clear.addActionListener(this);
		 delete.addActionListener(this);
		 fun.addActionListener(this);
		 empty.addActionListener(this);
		 
		
		panel.add(clear);
		panel.add(delete);
		panel.add(fun);
		panel.add(div);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(mul);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(sub);
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(add);
		panel.add(empty);
		panel.add(but0);
		panel.add(dec);
		panel.add(enter);
		
		textf = new JTextField();
		textf.setBounds(10,10,380,80);
		textf.setEditable(false);
		font = new Font("Arial",Font.BOLD,30);
		textf.setFont(font);
		
		
		
		
		
		
		
		
		
		
		
		window.add(textf);
		window.add(panel);
		window.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!textf.getText().equals("Infinity")) {
		if(e.getSource()==but0) {
			
			textf.setText(textf.getText()+"0");
			count+=1;
			
		}
		if(e.getSource()==but1) {
			
			textf.setText(textf.getText()+"1");
			count+=1;
			
		}
		if(e.getSource()==but2) {
			
			textf.setText(textf.getText()+"2");
			count+=1;
			
		}
		if(e.getSource()==but3) {
			
			textf.setText(textf.getText()+"3");
			count+=1;
			
		}
		if(e.getSource()==but4) {
			
			textf.setText(textf.getText()+"4");
			count+=1;
			
		}
		if(e.getSource()==but5) {
			
			textf.setText(textf.getText()+"5");
			count+=1;
			
		}
		if(e.getSource()==but6) {
			
			textf.setText(textf.getText()+"6");
			count+=1;
			
		}
		if(e.getSource()==but7) {
			
			textf.setText(textf.getText()+"7");
			count+=1;
			
		}
		if(e.getSource()==but8) {
		
			textf.setText(textf.getText()+"8");
			count+=1;
			
		}
		if(e.getSource()==but9) {
			
		
			textf.setText(textf.getText()+"9");
			count+=1;
			
		}
		if(e.getSource()==add) {
			if (count==0 || textf.getText().substring(0).equals(".")||textf.getText().substring(0).equals("-") ) {
			}
			else {
				 if(textf.getText().contains("/") || textf.getText().contains("*") || textf.getText().contains("+")) {	
				}
				 else if(textf.getText().contains("-")) {
				if (textf.getText().substring(0,1).equals("-")) {
					num1=Double.parseDouble(textf.getText());
					operation+="+";
					count+=1;
					endcount=count;
					textf.setText(textf.getText()+"+");
				}
			}
				
			
			else {
				num1=Double.parseDouble(textf.getText());
				operation+="+";
				count+=1;
				endcount=count;
				textf.setText(textf.getText()+"+");
			}
			
		}
		}
		if(e.getSource()==sub) {
			if(count==0) {
				textf.setText("-");
				count+=1;
			}
			else {
			if (textf.getText().substring(0).equals(".")||textf.getText().substring(0).equals("-")) {
			}
			else {
			if(textf.getText().contains("+") || textf.getText().contains("/") || textf.getText().contains("*")) {
			}
			else if(textf.getText().contains("-")) {
				if (textf.getText().substring(0,1).equals("-") && !(textf.getText().substring(1).contains("-"))) {
					num1=Double.parseDouble(textf.getText());
					operation+="-";
					count+=1;
					endcount=count;
					textf.setText(textf.getText()+"-");
				}
				else {
					
				}
			}
			else {
				num1=Double.parseDouble(textf.getText());
				operation ="-";
				count+=1;
				endcount=count;
				textf.setText(textf.getText()+"-");
			}
		}
			}
		}
		if(e.getSource()==mul) {
			if (count==0 || textf.getText().substring(0).equals(".")||textf.getText().substring(0).equals("-")) {
			}
			else {
			if(textf.getText().contains("/") || textf.getText().contains("*") || textf.getText().contains("+")) {
			}
			else if(textf.getText().contains("-")) {
				if (textf.getText().substring(0,1).equals("-")) {
					num1=Double.parseDouble(textf.getText());
					operation+="/";
					count+=1;
					endcount=count;
					textf.setText(textf.getText()+"/");	
					
			}
				else {
					
				}
			}
			else {
				num1=Double.parseDouble(textf.getText());
				operation ="*";
				count+=1;
				endcount=count;
				textf.setText(textf.getText()+"*");
			}
		}
		}
		if(e.getSource()==div) {
			if (count==0 || textf.getText().substring(0).equals(".")||textf.getText().substring(0).equals("-")) {
			}
			else {
			if(textf.getText().contains("+") || textf.getText().contains("/") || textf.getText().contains("*")) {
			}
			else if(textf.getText().contains("-")) {
				if (textf.getText().substring(0,1).equals("-")) {
					num1=Double.parseDouble(textf.getText());
					operation+="/";
					count+=1;
					endcount=count;
					textf.setText(textf.getText()+"/");	
					
			}
				else {
					
				}
			}
			else {
				num1=Double.parseDouble(textf.getText());
				operation ="/";
				count+=1;
				endcount=count;
				textf.setText(textf.getText()+"/");
			}
		}
		}
		if(e.getSource()==dec) {
			
			
			if(textf.getText().contains(".")) {
				if(operation=="" || (textf.getText().substring(endcount)).contains(".")) {
					
				}
				else {
					textf.setText(textf.getText()+".");
					count+=1;
				}
			}
			else{
				textf.setText(textf.getText()+".");
				count+=1;
			}
			
		}
		if(e.getSource()==delete) {
			if (count==0) {
			}
			else{
			textf.setText(textf.getText().substring(0,count-1));
			count-=1;
			}
			
		}
	
			
		
		if(e.getSource()==enter) {
			if(count==endcount || textf.getText().substring(count).equals("/") || textf.getText().substring(count).equals("+") 
					|| textf.getText().substring(count).equals("-") || textf.getText().substring(count).equals("*") || textf.getText().substring(count-1).equals(".")) {
				
			}
			else {
			if(operation.contains("+")) {
				num2=Double.parseDouble(textf.getText().substring(endcount));
					result = num1+num2;
					
					textf.setText(Double.toString(result));
					if(textf.getText().substring(textf.getText().length()-2).equals(".0")) {
						textf.setText(textf.getText().substring(0,textf.getText().length()-2));
					}
					count=0;
					endcount=0;
					num2=0.0;
					result=0.0;
					operation = "";
					for (int i=0;i<textf.getText().length();i++) {
						count+=1;
					}
					num1=Double.parseDouble(textf.getText());
			}
			else if(operation.contains("-")) {
					num2=Double.parseDouble(textf.getText().substring(endcount));
					result = num1-num2;
					textf.setText(Double.toString(result));
					if(textf.getText().substring(textf.getText().length()-2).equals(".0")) {
						textf.setText(textf.getText().substring(0,textf.getText().length()-2));
					}
					count=0;
					endcount=0;
					num1=Double.parseDouble(textf.getText());;
					num2=0.0;
					result=0.0;
					operation = "";
					for (int i=0;i<textf.getText().length();i++) {
						count+=1;
					}
			}
			else if(operation.contains("*")) {
				num2=Double.parseDouble(textf.getText().substring(endcount));
				result = num1*num2;
				textf.setText(Double.toString(result));
				if(textf.getText().substring(textf.getText().length()-2).equals(".0")) {
					textf.setText(textf.getText().substring(0,textf.getText().length()-2));
				}
				count=0;
				endcount=0;
				num1=Double.parseDouble(textf.getText());;
				num2=0.0;
				result=0.0;
				operation = "";
				for (int i=0;i<textf.getText().length();i++) {
					count+=1;
				}
			}
			else if(operation.contains("/")) {
				num2=Double.parseDouble(textf.getText().substring(endcount));
				result = num1/num2;
				textf.setText(Double.toString(result));
				if(textf.getText().substring(textf.getText().length()-2).equals(".0")) {
					textf.setText(textf.getText().substring(0,textf.getText().length()-2));
				}
				count=0;
				endcount=0;
				num1=Double.parseDouble(textf.getText());;
				num2=0.0;
				result=0.0;
				operation = "";
				for (int i=0;i<textf.getText().length();i++) {
					count+=1;
				}
			}
			}
		}
			
			
			
		
		if(e.getSource()==fun) {
		
				if(funbut=false) {
				funbut=true;}
				else {
					funbut=true;
				}
				
				if(funbut==true) {
					window.dispose();
					new fun();
				}
				
				
			}
			
			
		if(e.getSource()==empty) {
			textf.setText(textf.getText());
		}
			if(e.getSource()==clear) {
				textf.setText("");
				count=0;
				endcount=0;
				num1=0.0;
				num2=0.0;
				result=0.0;
				operation = "";
		}
	}
		else {
		if(e.getSource()==clear) {
			textf.setText("");
			count=0;
			endcount=0;
			num1=0.0;
			num2=0.0;
			result=0.0;
			operation = "";
		}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
