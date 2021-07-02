/*Catarina F. Burghi
 *April 1st 2021
 *This program creates a form that asks the user to input words.
 *each question performs a different task by using string Methods*/

package JavaBasicsUnit1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmStringMethods extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstInput;
	private JTextField txtSecondInput;
	private JTextField txtThirdInput;
	private JTextField txtForthInput1;
	private JTextField txtForthInput2;
	private JTextField txtFifthInput1;
	private JTextField txtFifthInput2;
	private JTextField txtSixthInput;
	private JTextField txtSeventhInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStringMethods frame = new FrmStringMethods();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmStringMethods() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Super String Software");
		lblTitle.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 30));
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setBounds(10, 11, 564, 34);
		contentPane.add(lblTitle);
		
		JLabel lblFirst = new JLabel("Enter a String. The program will outputs the number of characters in the String");
		lblFirst.setBounds(20, 56, 554, 14);
		contentPane.add(lblFirst);
		
		txtFirstInput = new JTextField();
		txtFirstInput.setBounds(30, 78, 175, 20);
		contentPane.add(txtFirstInput);
		txtFirstInput.setColumns(10);
		
		JLabel lblFirstAnswer = new JLabel("--");
		lblFirstAnswer.setBounds(435, 81, 101, 14);
		contentPane.add(lblFirstAnswer);
		
		JLabel lblSecond = new JLabel("Enter a String using lowercase letters. The program will output the String in all capital letters");
		lblSecond.setBounds(20, 109, 554, 14);
		contentPane.add(lblSecond);
		
		txtSecondInput = new JTextField();
		txtSecondInput.setBounds(30, 134, 175, 20);
		contentPane.add(txtSecondInput);
		txtSecondInput.setColumns(10);
		
		JLabel lblSecondAnswer = new JLabel("--");
		lblSecondAnswer.setBounds(435, 134, 101, 14);
		contentPane.add(lblSecondAnswer);
		
		JLabel lblThird = new JLabel("Enter a String. The program will output the character at the 4th spot");
		lblThird.setBounds(20, 165, 554, 14);
		contentPane.add(lblThird);
		
		txtThirdInput = new JTextField();
		txtThirdInput.setBounds(30, 190, 175, 20);
		contentPane.add(txtThirdInput);
		txtThirdInput.setColumns(10);
		
		JLabel lblThirdAnswer = new JLabel("--");
		lblThirdAnswer.setBounds(435, 193, 101, 14);
		contentPane.add(lblThirdAnswer);
		
		JLabel lblForth = new JLabel("Enter two Strings. The program will output wether or not they are identical");
		lblForth.setBounds(20, 221, 554, 14);
		contentPane.add(lblForth);
		
		txtForthInput1 = new JTextField();
		txtForthInput1.setBounds(30, 246, 86, 20);
		contentPane.add(txtForthInput1);
		txtForthInput1.setColumns(10);
		
		txtForthInput2 = new JTextField();
		txtForthInput2.setBounds(139, 246, 86, 20);
		contentPane.add(txtForthInput2);
		txtForthInput2.setColumns(10);
		
		JLabel lblForthAnswer = new JLabel("--");
		lblForthAnswer.setBounds(435, 249, 101, 14);
		contentPane.add(lblForthAnswer);
		
		JLabel lblFifth = new JLabel("Enter a String and a letter. The program will output whether or not the letter is found in the String");
		lblFifth.setBounds(20, 277, 554, 14);
		contentPane.add(lblFifth);
		
		txtFifthInput1 = new JTextField();
		txtFifthInput1.setBounds(30, 302, 86, 20);
		contentPane.add(txtFifthInput1);
		txtFifthInput1.setColumns(10);
		
		txtFifthInput2 = new JTextField();
		txtFifthInput2.setBounds(139, 302, 25, 20);
		contentPane.add(txtFifthInput2);
		txtFifthInput2.setColumns(10);
		
		JLabel lblFifthAnswer = new JLabel("--");
		lblFifthAnswer.setBounds(435, 302, 139, 14);
		contentPane.add(lblFifthAnswer);
		
		JLabel lblSixth = new JLabel("Enter a String that is at least 8 characters long. The program will output characters 4 to 6");
		lblSixth.setBounds(20, 333, 516, 14);
		contentPane.add(lblSixth);
		
		txtSixthInput = new JTextField();
		txtSixthInput.setBounds(30, 358, 175, 20);
		contentPane.add(txtSixthInput);
		txtSixthInput.setColumns(10);
		
		JLabel lblSixthAnswer1 = new JLabel("--");
		lblSixthAnswer1.setBounds(435, 358, 25, 14);
		contentPane.add(lblSixthAnswer1);
		
		JLabel lblSixthAnswer2 = new JLabel("");
		lblSixthAnswer2.setBounds(470, 358, 46, 14);
		contentPane.add(lblSixthAnswer2);
		
		JLabel lblSeventh1 = new JLabel("Enter a String that contains at least one \"a\".");
		lblSeventh1.setBounds(20, 389, 554, 14);
		contentPane.add(lblSeventh1);
		
		JLabel lblSeventh2 = new JLabel("The program will then replace all accurences of the letter \"a\" with \"x\"");
		lblSeventh2.setBounds(20, 403, 554, 14);
		contentPane.add(lblSeventh2);
		
		txtSeventhInput = new JTextField();
		txtSeventhInput.setBounds(30, 428, 175, 20);
		contentPane.add(txtSeventhInput);
		txtSeventhInput.setColumns(10);
		
		JLabel lblSeventhAnswer = new JLabel("--");
		lblSeventhAnswer.setBounds(435, 428, 139, 14);
		contentPane.add(lblSeventhAnswer);
		
		JButton btnFirstButton = new JButton("Length");
		btnFirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//getting the inputed text and declaring it a string
				 String word1 = txtFirstInput.getText();
				 
				//Printing the length of the string using .length
				lblFirstAnswer.setText(String.valueOf(word1.length()));
		
			}
		});
		btnFirstButton.setBounds(263, 77, 89, 23);
		contentPane.add(btnFirstButton);
		
		JButton btnSecondButton = new JButton("All Caps");
		btnSecondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word1 = txtSecondInput.getText();
				
				//Prints the same word but in all upper case using .toUpperCase
				lblSecondAnswer.setText(String.valueOf(word1.toUpperCase()));
			}
		});
		btnSecondButton.setBounds(263, 134, 89, 23);
		contentPane.add(btnSecondButton);
		
		JButton btnThirdButton = new JButton("4th Spot");
		btnThirdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word1 = txtThirdInput.getText();
				
				//Prints only the letter in the 4th spot using .charAt
				lblThirdAnswer.setText(String.valueOf(word1.charAt(4)));
				
			}
		});
		btnThirdButton.setBounds(263, 189, 89, 23);
		contentPane.add(btnThirdButton);
		
		JButton btnForthButton = new JButton("Identical?");
		btnForthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word1 = txtForthInput1.getText();
				String word2 = txtForthInput2.getText();
				
				//Prints true or false depending if both strings are the same using .contentEquals
				lblForthAnswer.setText(String.valueOf(word1.contentEquals(word2)));
				
			}
		});
		btnForthButton.setBounds(263, 246, 89, 23);
		contentPane.add(btnForthButton);
		
		JButton btnFifthButton = new JButton("Letter Found?");
		btnFifthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word1 = txtFifthInput1.getText();
				String letter = txtFifthInput2.getText();
				
				//Prints true or false depending if the letter inputed by the user is in the first string inputed by the user
				//using if and else statements and .indexOf
				 if(word1.indexOf(letter) != -1)
			        {
			            lblFifthAnswer.setText("True");      
			        }
			        else
			        {
			            lblFifthAnswer.setText("False");
			        } 
			}

		});
		btnFifthButton.setBounds(237, 301, 144, 23);
		contentPane.add(btnFifthButton);
		
		JButton btnSixthButton = new JButton("Characters 4 and 6");
		btnSixthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word = txtSixthInput.getText();
				
				//Printing the letters in the 4th spot and the 6th spot using .charAt
				lblSixthAnswer1.setText(String.valueOf(word.charAt(4)));
				lblSixthAnswer2.setText(String.valueOf(word.charAt(6)));
				
			}
		});
		btnSixthButton.setBounds(237, 358, 144, 23);
		contentPane.add(btnSixthButton);
		
		JButton btnSeventhButton = new JButton("Replaces \"a\"");
		btnSeventhButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting the inputed text and declaring it a string
				String word = txtSeventhInput.getText();
				
				//Prints string but if there is a letter "a" in the string it replaces it with "x"
				lblSeventhAnswer.setText(String.valueOf(word.replace("a", "x")));
				
			}
		});
		btnSeventhButton.setBounds(237, 427, 144, 23);
		contentPane.add(btnSeventhButton);
		
		
	}
}
