package Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Password implements ActionListener{

	JTextField uText;
	JTextField pText;
	public JFrame frame;
	Font font;
	JButton eBut;
	JLabel head, eMsg;
	JFrame newframe;
	public boolean access;
	
	public Password() {
		pText = new JTextField();
		uText = new JTextField();
		font = new Font("Serif", Font.BOLD, 18);
		frame = new JFrame("Password");
		eBut = new JButton("Enter");
		head = new JLabel("Enter a Username and Password");
		eMsg = new JLabel("Error Incorrect Username or Password");
		
		
		
		frame.setLayout(null);
		frame.setBounds(650, 150, 500, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pText.setBounds(75, 200, 300, 50);
		uText.setBounds(75, 300, 300, 50);
		pText.setFont(font);
		uText.setFont(font);
		
		eBut.setFont(font);
		eBut.setBounds(75,375,100,40);
		eBut.addActionListener(this);
		
		head.setFont(font);
		head.setBounds(75,150,500,40);
		
		eMsg.setFont(font);
		eMsg.setBounds(75,2000,500,40);
		
		
		frame.add(eMsg);
		frame.add(head);
		frame.add(eBut);
		frame.add(pText);
		frame.add(uText);
		frame.setVisible(true);
		
		
	}
	public boolean getAccess() {
		return access;
	}
	
	public void setAccess(boolean bool) {
		
		access=bool;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(eBut)) {
			
			if(pText.getText().equals("123")&&(uText.getText().equals("123"))) {
				eMsg.setBounds(75,2000,500,40);
				access=true;
				frame.dispose();
				new Calculator();
				
			}
			else {
				eMsg.setBounds(75,425,500,40);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
