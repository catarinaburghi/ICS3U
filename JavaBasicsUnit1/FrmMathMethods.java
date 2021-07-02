/*Catarina F. Burghi
 *March 31st 2021
 *This program uses a bunch of math methods to solve what the user inputs
 *The user inputs numbers and according to which question they input the numbers in
 *the program outputs the correct answer*/

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

public class FrmMathMethods extends JFrame {
	// declaring variables
	double userinput1 = 0;
	double userinput2 = 0;
	int userinputs1 = 0;
	int userinputs2 = 0;

	private JPanel contentPane;
	private JTextField txtFirstNum1;
	private JTextField txtFirstNum2;
	private JTextField txtSecondNum1;
	private JTextField txtSecondNum2;
	private JTextField txtThirdNum1;
	private JTextField txtThirdNum2;
	private JTextField txtForthNum1;
	private JTextField txtForthNum2;
	private JTextField txtFifthNum;
	private JTextField txtSixthNum1;
	private JTextField txtSixthNum2;
	private JTextField txtSeventhNum;
	private JTextField txtEigthNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMathMethods frame = new FrmMathMethods();
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
	public FrmMathMethods() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Magical Math Methods");
		lblTitle.setFont(new Font("Sitka Heading", Font.ITALIC, 20));
		lblTitle.setForeground(Color.RED);
		lblTitle.setBounds(10, 11, 261, 28);
		contentPane.add(lblTitle);
		
		JLabel lblFirstMethod = new JLabel("Enter 2 numbers, then click the button. The program will display the smaller number");
		lblFirstMethod.setBounds(10, 50, 502, 14);
		contentPane.add(lblFirstMethod);
		
		txtFirstNum1 = new JTextField();
		txtFirstNum1.setBounds(34, 75, 25, 20);
		contentPane.add(txtFirstNum1);
		txtFirstNum1.setColumns(10);
		
		txtFirstNum2 = new JTextField();
		txtFirstNum2.setBounds(82, 75, 25, 20);
		contentPane.add(txtFirstNum2);
		txtFirstNum2.setColumns(10);
		
		JLabel lblFirstAnswer = new JLabel("--");
		lblFirstAnswer.setBounds(353, 78, 221, 14);
		contentPane.add(lblFirstAnswer);
		
		JLabel lblSecondMethod = new JLabel("Enter 2 numbers, then click the button. The program will display the largest of the 2 numbers");
		lblSecondMethod.setBounds(10, 107, 564, 14);
		contentPane.add(lblSecondMethod);
		
		txtSecondNum1 = new JTextField();
		txtSecondNum1.setBounds(34, 132, 25, 20);
		contentPane.add(txtSecondNum1);
		txtSecondNum1.setColumns(10);
		
		txtSecondNum2 = new JTextField();
		txtSecondNum2.setBounds(82, 132, 25, 20);
		contentPane.add(txtSecondNum2);
		txtSecondNum2.setColumns(10);
		
		JLabel lblSecondAnswer = new JLabel("--");
		lblSecondAnswer.setBounds(353, 135, 206, 14);
		contentPane.add(lblSecondAnswer);
		
		JLabel lblThirdMethod = new JLabel("Enter 2 numbers, then click the button. The program will display the exact product");
		lblThirdMethod.setBounds(10, 163, 492, 14);
		contentPane.add(lblThirdMethod);
		
		txtThirdNum1 = new JTextField();
		txtThirdNum1.setBounds(34, 188, 25, 20);
		contentPane.add(txtThirdNum1);
		txtThirdNum1.setColumns(10);
		
		txtThirdNum2 = new JTextField();
		txtThirdNum2.setBounds(82, 188, 25, 20);
		contentPane.add(txtThirdNum2);
		txtThirdNum2.setColumns(10);
		
		JLabel lblThirdAnswer = new JLabel("--");
		lblThirdAnswer.setBounds(353, 191, 221, 14);
		contentPane.add(lblThirdAnswer);
		
		JLabel lblForthMethod = new JLabel("Enter 1 number, on the second box enter a power. Then click the button.  ");
		lblForthMethod.setBounds(10, 225, 492, 14);
		contentPane.add(lblForthMethod);
		
		JLabel lblForthMethod1 = new JLabel("The program will display the number raised to the power of the second number");
		lblForthMethod1.setBounds(10, 239, 549, 14);
		contentPane.add(lblForthMethod1);
		
		txtForthNum1 = new JTextField();
		txtForthNum1.setBounds(34, 264, 25, 20);
		contentPane.add(txtForthNum1);
		txtForthNum1.setColumns(10);
		
		txtForthNum2 = new JTextField();
		txtForthNum2.setBounds(82, 264, 25, 20);
		contentPane.add(txtForthNum2);
		txtForthNum2.setColumns(10);
		
		JLabel lblForthAnswer = new JLabel("--");
		lblForthAnswer.setBounds(353, 267, 206, 14);
		contentPane.add(lblForthAnswer);
		
		JLabel lblFifthMethod = new JLabel("Enter a number, then click the button. The program will display the square root of the number");
		lblFifthMethod.setBounds(10, 295, 574, 14);
		contentPane.add(lblFifthMethod);
		
		txtFifthNum = new JTextField();
		txtFifthNum.setBounds(59, 320, 25, 20);
		contentPane.add(txtFifthNum);
		txtFifthNum.setColumns(10);
		
		JLabel lblFifthAnswer = new JLabel("--");
		lblFifthAnswer.setBounds(353, 323, 206, 14);
		contentPane.add(lblFifthAnswer);
		
		JLabel lblSixthMethod = new JLabel("Enter 2 numbers, then click the button. The program will display the difference between them");
		lblSixthMethod.setBounds(10, 351, 564, 14);
		contentPane.add(lblSixthMethod);
		
		txtSixthNum1 = new JTextField();
		txtSixthNum1.setBounds(34, 376, 25, 20);
		contentPane.add(txtSixthNum1);
		txtSixthNum1.setColumns(10);
		
		txtSixthNum2 = new JTextField();
		txtSixthNum2.setBounds(82, 376, 25, 20);
		contentPane.add(txtSixthNum2);
		txtSixthNum2.setColumns(10);
		
		JLabel lblSixthAnswer = new JLabel("--");
		lblSixthAnswer.setBounds(353, 379, 206, 14);
		contentPane.add(lblSixthAnswer);
		
		JLabel lblSeventhMethod = new JLabel("Enter 1 number, then click the button. The program will display the angle mesurred in degrees");
		lblSeventhMethod.setBounds(10, 407, 564, 14);
		contentPane.add(lblSeventhMethod);
		
		txtSeventhNum = new JTextField();
		txtSeventhNum.setBounds(59, 432, 25, 20);
		contentPane.add(txtSeventhNum);
		txtSeventhNum.setColumns(10);
		
		JLabel lblSeventhAnswer = new JLabel("--");
		lblSeventhAnswer.setBounds(353, 435, 190, 14);
		contentPane.add(lblSeventhAnswer);
		
		JLabel lblEigthMethod = new JLabel("Enter a number, then click the button. The program will display the angle messured in radians");
		lblEigthMethod.setBounds(10, 463, 564, 14);
		contentPane.add(lblEigthMethod);
		
		txtEigthNum = new JTextField();
		txtEigthNum.setBounds(59, 488, 25, 20);
		contentPane.add(txtEigthNum);
		txtEigthNum.setColumns(10);
		
		JLabel lblEigthAnswer = new JLabel("--");
		lblEigthAnswer.setBounds(353, 491, 190, 14);
		contentPane.add(lblEigthAnswer);
		
		JButton btnFirstButton = new JButton("Smaller");
		btnFirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtFirstNum1.getText());
				userinput2 = Double.parseDouble(txtFirstNum2.getText());
			
				// Math.min
				lblFirstAnswer.setText(String.valueOf(Math.min(userinput1, userinput2)));
			}

			
		});
		btnFirstButton.setBounds(186, 74, 89, 23);
		contentPane.add(btnFirstButton);
		
		JButton btnSecondButton = new JButton("Largest");
		btnSecondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtSecondNum1.getText());
				userinput2 = Double.parseDouble(txtSecondNum2.getText());
				//Math.max
				lblSecondAnswer.setText(String.valueOf(Math.max(userinput1, userinput2)));
			}
		});
		btnSecondButton.setBounds(186, 132, 89, 23);
		contentPane.add(btnSecondButton);
		
		JButton btnThirdButton = new JButton("Product");
		btnThirdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinputs1 = Integer.parseInt(txtThirdNum1.getText());
				userinputs2 = Integer.parseInt(txtThirdNum2.getText());
				//Math.multiplyFull
				lblThirdAnswer.setText(String.valueOf(Math.multiplyFull(userinputs1, userinputs2)));
				
				
			}
		});
		btnThirdButton.setBounds(186, 188, 89, 23);
		contentPane.add(btnThirdButton);
		
		JButton btnForthButton = new JButton("Calculate");
		btnForthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtForthNum1.getText());
				userinput2 = Double.parseDouble(txtForthNum2.getText());
				//Math.pow
				lblForthAnswer.setText(String.valueOf(Math.pow(userinput1, userinput2)));
				
			}
		});
		btnForthButton.setBounds(186, 263, 89, 23);
		contentPane.add(btnForthButton);
		
		JButton btnFifthButton = new JButton("Square");
		btnFifthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtFifthNum.getText());
				//Math.sqrt
				lblFifthAnswer.setText(String.valueOf(Math.sqrt(userinput1)));
				
			}
		});
		btnFifthButton.setBounds(186, 320, 89, 23);
		contentPane.add(btnFifthButton);
		
		JButton btnSixthButton = new JButton("Difference");
		btnSixthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinputs1 = Integer.parseInt(txtSixthNum1.getText());
				userinputs2 = Integer.parseInt(txtSixthNum2.getText());
				//Math.subtractExact
				lblSixthAnswer.setText(String.valueOf(Math.subtractExact(userinputs1, userinputs2)));
				
			}
		});
		btnSixthButton.setBounds(186, 376, 89, 23);
		contentPane.add(btnSixthButton);
		
		JButton btnSeventhButton = new JButton("Degrees");
		btnSeventhButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtSeventhNum.getText());
				//Math.toDegrees
				lblSeventhAnswer.setText(String.valueOf(Math.toDegrees(userinput1)));
			}
		});
		btnSeventhButton.setBounds(186, 432, 89, 23);
		contentPane.add(btnSeventhButton);
		
		JButton btnEigthButton = new JButton("Radians");
		btnEigthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				userinput1 = Double.parseDouble(txtEigthNum.getText());
				//Math.toRadians
				lblEigthAnswer.setText(String.valueOf(Math.toRadians(userinput1)));
			}
		});
		btnEigthButton.setBounds(186, 488, 89, 23);
		contentPane.add(btnEigthButton);
	}
}
