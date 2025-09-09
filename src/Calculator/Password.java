package Calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Password implements ActionListener{

	JFrame frame;
	JTextField uText, pText;
	JButton enterBut;
	JLabel header, errorMsg;
	Font font;
	
	Password() {
		frame = new JFrame("Password");
		pText = new JTextField();
		uText = new JTextField();
		enterBut = new JButton("Enter");
		header = new JLabel("Enter a Username and Password");
		errorMsg = new JLabel("Error Incorrect Username or Password");
		font = new Font("Serif", Font.BOLD, 18);
		
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setBounds(650, 150, 500, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pText.setBounds(75, 150, 300, 50);
		pText.setFont(font);
		uText.setFont(font);
		uText.setBounds(75, 250, 300, 50);
		
		enterBut.setFont(font);
		enterBut.setBounds(75,325,100,40);
		enterBut.addActionListener(this);
		
		header.setFont(font);
		header.setBounds(75,100,500,40);
		
		errorMsg.setFont(font);
		errorMsg.setBounds(75,2000,500,40);
		
		frame.add(errorMsg);
		frame.add(header);
		frame.add(enterBut);
		frame.add(pText);
		frame.add(uText);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(enterBut)) {
			if(pText.getText().equals("123") && (uText.getText().equals("123"))) {
				frame.dispose();
				new Calculator();
			}
			else {
				errorMsg.setBounds(75,375,500,40);
			}
		}
	}
}
