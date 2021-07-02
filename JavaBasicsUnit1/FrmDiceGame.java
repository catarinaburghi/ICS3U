/*Catarina Burghi
 * Date: March 17th 2021
 * This program is the program for a guessing game.
 * The user plugs in the a number between 1 and 6,
 * the program then "rolls" the dice and the program outputs,
 * the number that the dice output, the total number of guesses,
 * the total number of correct guesses, the total number of incorrect guesses
 * and the percentage of the correct guesses.
 */
package JavaBasicsUnit1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDiceGame extends JFrame {
	// declaring my variables that will be used before the button is pressed.
	int totalrolls = 0;
	int totalcorrect = 0;
	int totalincorrect = 0;
	int userguess = 0;
	int diceroll = 0;
	double percCorrect = 0;

	private JPanel contentPane;
	private JTextField txtUserGuess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDiceGame frame = new FrmDiceGame();
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
	public FrmDiceGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("Super Dice Guessing Game!");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHeader.setBounds(71, 11, 289, 25);
		contentPane.add(lblHeader);
		
		JLabel lblInst1 = new JLabel("Enter a number, from 1 to 6,");
		lblInst1.setBounds(136, 35, 173, 14);
		contentPane.add(lblInst1);
		
		JLabel lblInst2 = new JLabel("And click roll the dice!");
		lblInst2.setBounds(157, 47, 152, 14);
		contentPane.add(lblInst2);
		
		JLabel lblUserGuess = new JLabel("Your guess:");
		lblUserGuess.setBounds(42, 75, 83, 14);
		contentPane.add(lblUserGuess);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setBounds(52, 91, 44, 20);
		contentPane.add(txtUserGuess);
		txtUserGuess.setColumns(10);
		
		JLabel lblDiceRoll = new JLabel("Dice roll:");
		lblDiceRoll.setBounds(338, 75, 74, 14);
		contentPane.add(lblDiceRoll);
		
		JLabel lblRollValue = new JLabel("0");
		lblRollValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRollValue.setBounds(354, 94, 36, 14);
		contentPane.add(lblRollValue);
		
		JLabel lblRolls = new JLabel("Number of rolls:");
		lblRolls.setBounds(128, 140, 98, 14);
		contentPane.add(lblRolls);
		
		JLabel lblRollsValue = new JLabel("0");
		lblRollsValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRollsValue.setBounds(253, 140, 56, 14);
		contentPane.add(lblRollsValue);
		
		JLabel lblCorrect = new JLabel("Number of correct guesses:");
		lblCorrect.setBounds(61, 165, 165, 14);
		contentPane.add(lblCorrect);
		
		JLabel lblCorrectValue = new JLabel("0");
		lblCorrectValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorrectValue.setBounds(253, 165, 46, 14);
		contentPane.add(lblCorrectValue);
		
		JLabel lblIncorrect = new JLabel("Number of incorrect guesses:");
		lblIncorrect.setBounds(52, 190, 174, 14);
		contentPane.add(lblIncorrect);
		
		JLabel lblIncorrectValue = new JLabel("0");
		lblIncorrectValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIncorrectValue.setBounds(253, 190, 46, 14);
		contentPane.add(lblIncorrectValue);
		
		JLabel lblPercent = new JLabel("Percentage of correct guesses:");
		lblPercent.setBounds(42, 215, 184, 14);
		contentPane.add(lblPercent);
		
		JLabel lblPercentValue = new JLabel("0");
		lblPercentValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPercentValue.setBounds(253, 215, 74, 14);
		contentPane.add(lblPercentValue);
		
		JButton btnRollDice = new JButton("Roll Dice");
		btnRollDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// declaring the random value of the dice
				diceroll = (int)Math.round(Math.random()*5+1);
				lblRollValue.setText(String.valueOf(diceroll));
				
				userguess = Integer.parseInt(txtUserGuess.getText());
				
				totalrolls = totalrolls+1;
				//if and else statements
				if (diceroll == userguess) {
					
					totalcorrect = totalcorrect +1;
					
				}else {
					
					totalincorrect = totalincorrect +1;
				}
				
				percCorrect = ((double)totalcorrect/(double)totalrolls)*100;
				//rounding the percentage
				percCorrect = percCorrect*100;
				percCorrect = Math.round(percCorrect);
				percCorrect = percCorrect/100;
				//labeling
				lblRollsValue.setText(String.valueOf(totalrolls));
				lblCorrectValue.setText(String.valueOf(totalcorrect));
				lblIncorrectValue.setText(String.valueOf(totalincorrect));
				lblPercentValue.setText(String.valueOf(percCorrect));
			}
		});
		btnRollDice.setBounds(170, 90, 89, 23);
		contentPane.add(btnRollDice);
	}
}
