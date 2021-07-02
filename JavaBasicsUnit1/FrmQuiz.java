package JavaBasicsUnit1;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmQuiz extends JFrame {
	Scanner sc = new Scanner(System.in);
	int AnswersC = 0;
	String Answer;
	

	private JPanel contentPane;
	private JTextField txtAnswer1;
	private JTextField txtAnswer2;
	private JTextField txtAnswer3;
	private JTextField txtAnswer4;
	private JTextField txtAnswer5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmQuiz frame = new FrmQuiz();
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
	public FrmQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeader = new JLabel("Multiple choice Quiz!");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHeader.setBounds(0, -5, 262, 35);
		contentPane.add(lblHeader);
		
		JLabel lblInstruction = new JLabel("This quiz is about Minecraft music discs,");
		lblInstruction.setBounds(0, 23, 225, 15);
		contentPane.add(lblInstruction);
		
		JLabel lblInstruction2 = new JLabel("Please look at the pictures carefully");
		lblInstruction2.setBounds(0, 41, 188, 14);
		contentPane.add(lblInstruction2);
		
		JLabel lblInstruction3 = new JLabel(" and guess which disc is displayed in the photo!");
		lblInstruction3.setBounds(0, 61, 238, 14);
		contentPane.add(lblInstruction3);
		
		JLabel lblQuestion1 = new JLabel("1- What disc is this?");
		lblQuestion1.setBounds(71, 86, 124, 14);
		contentPane.add(lblQuestion1);
		
		JLabel lblCatDisc = new JLabel("");
		lblCatDisc.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\cat.jfif"));
		lblCatDisc.setBounds(24, 86, 37, 24);
		contentPane.add(lblCatDisc);
		
		JLabel lblChoices1 = new JLabel("a)pigstep   b)wait   c)blocks   d)cat");
		lblChoices1.setBounds(81, 100, 228, 14);
		contentPane.add(lblChoices1);
		
		txtAnswer1 = new JTextField();
		txtAnswer1.setBounds(319, 83, 42, 20);
		contentPane.add(txtAnswer1);
		txtAnswer1.setColumns(10);
		
		JLabel lblStalDisc = new JLabel("");
		lblStalDisc.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\stal.jfif"));
		lblStalDisc.setBounds(24, 136, 37, 24);
		contentPane.add(lblStalDisc);
		
		JLabel lblQuestion2 = new JLabel("2- What disc is this?");
		lblQuestion2.setBounds(71, 136, 117, 14);
		contentPane.add(lblQuestion2);
		
		JLabel lblChoices2 = new JLabel("a)strad   b)stal   c)chirp   d)11");
		lblChoices2.setBounds(81, 150, 228, 14);
		contentPane.add(lblChoices2);
		
		txtAnswer2 = new JTextField();
		txtAnswer2.setBounds(319, 136, 42, 20);
		contentPane.add(txtAnswer2);
		txtAnswer2.setColumns(10);
		
		JLabel lblPigstepDisc = new JLabel("");
		lblPigstepDisc.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\pigstep.png"));
		lblPigstepDisc.setBounds(24, 179, 37, 28);
		contentPane.add(lblPigstepDisc);
		
		JLabel lblQuestion3 = new JLabel("3-What disc is this?");
		lblQuestion3.setBounds(71, 180, 117, 14);
		contentPane.add(lblQuestion3);
		
		JLabel lblChoices3 = new JLabel("a)far   b)13   c)mall   d)pigstep");
		lblChoices3.setBounds(81, 193, 228, 14);
		contentPane.add(lblChoices3);
		
		txtAnswer3 = new JTextField();
		txtAnswer3.setBounds(319, 179, 42, 20);
		contentPane.add(txtAnswer3);
		txtAnswer3.setColumns(10);
		
		JLabel lblMellohiDisc = new JLabel("");
		lblMellohiDisc.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\mellohi.png"));
		lblMellohiDisc.setBounds(24, 220, 37, 28);
		contentPane.add(lblMellohiDisc);
		
		JLabel lblQuestion4 = new JLabel("4-What disc is this?");
		lblQuestion4.setBounds(71, 218, 124, 14);
		contentPane.add(lblQuestion4);
		
		JLabel lblChoices4 = new JLabel("a)strad   b)mall   c)mellohi   d)ward");
		lblChoices4.setBounds(81, 231, 228, 14);
		contentPane.add(lblChoices4);
		
		txtAnswer4 = new JTextField();
		txtAnswer4.setBounds(319, 220, 42, 20);
		contentPane.add(txtAnswer4);
		txtAnswer4.setColumns(10);
		
		JLabel lblWardDisc = new JLabel("");
		lblWardDisc.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\ward.jfif"));
		lblWardDisc.setBounds(24, 259, 37, 26);
		contentPane.add(lblWardDisc);
		
		JLabel lblQuestion5 = new JLabel("5-What disc is this?");
		lblQuestion5.setBounds(71, 256, 154, 14);
		contentPane.add(lblQuestion5);
		
		JLabel lblChoices5 = new JLabel("a)ward   b)chirp   c)cat   d)wait");
		lblChoices5.setBounds(81, 271, 228, 14);
		contentPane.add(lblChoices5);
		
		txtAnswer5 = new JTextField();
		txtAnswer5.setBounds(319, 261, 42, 24);
		contentPane.add(txtAnswer5);
		txtAnswer5.setColumns(10);
		
		JLabel lblCounter = new JLabel("/5");
		lblCounter.setBounds(456, 9, 46, 14);
		contentPane.add(lblCounter);
		
		JLabel lblPercentCorrect1 = new JLabel("Percentage of correct answers:");
		lblPercentCorrect1.setBounds(24, 321, 214, 14);
		contentPane.add(lblPercentCorrect1);
		
		JLabel lblPercentCorrect2 = new JLabel("0");
		lblPercentCorrect2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPercentCorrect2.setBounds(268, 321, 46, 14);
		contentPane.add(lblPercentCorrect2);
		
		JLabel lblPercentIncorrect1 = new JLabel("Percentage of incorrect answers:");
		lblPercentIncorrect1.setBounds(24, 362, 201, 14);
		contentPane.add(lblPercentIncorrect1);
		
		JLabel lblPercentIncorrect2 = new JLabel("0");
		lblPercentIncorrect2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPercentIncorrect2.setBounds(268, 362, 46, 14);
		contentPane.add(lblPercentIncorrect2);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(324, 321, 178, 14);
		contentPane.add(lblMessage);
		
		JButton btnQuestion1 = new JButton("Submit");
		btnQuestion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer = txtAnswer1.getText().toLowerCase(); 

				if (Answer=="d") {
					lblCounter.setText(++AnswersC + "/5");
					lblMessage.setText("Correct!");
				} else {
					lblMessage.setText("Incorrect");
				}

				
			}
		});
		btnQuestion1.setBounds(398, 82, 89, 23);
		contentPane.add(btnQuestion1);
		
		JButton btnQuestion2 = new JButton("Submit");
		btnQuestion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuestion2.setBounds(398, 132, 89, 23);
		contentPane.add(btnQuestion2);
		
		JButton btnQuestion3 = new JButton("Submit");
		btnQuestion3.setBounds(398, 179, 89, 23);
		contentPane.add(btnQuestion3);
		
		JButton btnQuestion4 = new JButton("Submit");
		btnQuestion4.setBounds(398, 220, 89, 23);
		contentPane.add(btnQuestion4);
		
		JButton btnQuestion5 = new JButton("Submit");
		btnQuestion5.setBounds(398, 259, 89, 23);
		contentPane.add(btnQuestion5);
	}
}
