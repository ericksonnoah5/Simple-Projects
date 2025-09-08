package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;



public class fun implements ActionListener{
	
	private JFrame frame;
	private Random rand = new Random();
	private int randomJoke;
	private Scanner scnr;
	private File file = new File("myTextFilex.txt");
	private String joke = "";
	private JTextField myjoketext;
	private JButton button;
	
	fun(){
		frame = new JFrame("Fun");
		frame.setLayout(null);
		frame.setBounds(650, 150, 600, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		try {
			scnr = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.print("Error");
			e.printStackTrace();
		}
		
		randomJoke = rand.nextInt(100)+1;
		
		while(true) {
			if(!scnr.hasNext()) {
				break;
			}
		if(Integer.toString(randomJoke).equals(scnr.next())) {
			while(true) {
				if(!scnr.hasNext()) {
					break;
				}
				joke+=scnr.next()+" ";
				if(joke.contains(".")) {
					break;
				}
			}
			
		}
		else if (scnr.hasNext()){
		}
		else {
			break;
		}
		}
		myjoketext = new JTextField();
		myjoketext.setEditable(false);
		myjoketext.setBounds(0, 0, 1000, 50);
		myjoketext.setLayout(null);
		myjoketext.setText(joke);
		
		
		
		button = new JButton("New Joke");
		button.setBounds(100, 100, 100, 50);
		button.setLayout(null);
		button.addActionListener(this);
		
		
		
		
		
		frame.add(button);
		frame.add(myjoketext);
		frame.setVisible(true);
		
		
		
	}	
	
	  @Override
	    public void actionPerformed(ActionEvent e) {
		  try {
				scnr = new Scanner(file);
			} catch (FileNotFoundException ee) {
				System.out.print("Error");
				ee.printStackTrace();
			}
		  randomJoke = rand.nextInt(100)+1;
		  file = new File("myTextFilex.txt");
		  joke = "";
		  while(true) {
			  if(!scnr.hasNext()) {
					break;
				}
				if(Integer.toString(randomJoke).equals(scnr.next())) {
					while(true) {
						if(!scnr.hasNext()) {
							break;
						}
						
						joke+=scnr.next()+" ";
						if(joke.contains(".")) {
							break;
						}
					}
					
				}
				else if (scnr.hasNext()){
				}
				else {
					break;
				}
				
				}
		  myjoketext.setText(joke);
	    }
	
	
	
}			
		
		
	

