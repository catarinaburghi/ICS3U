import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmSum2Num extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSum2Num frame = new FrmSum2Num();
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
	public FrmSum2Num() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setBounds(38, 28, 103, 17);
		contentPane.add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(38, 85, 103, 17);
		contentPane.add(lblSecondNumber);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(127, 175, 46, 14);
		contentPane.add(lblAnswer);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setBounds(180, 26, 86, 20);
		contentPane.add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setBounds(180, 83, 86, 20);
		contentPane.add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				int answer;
				
				num1=Integer.parseInt(txtFirstNumber.getText());
				num2=Integer.parseInt(txtSecondNumber.getText());
				
				answer=num1+num2;
				
				lblAnswer.setText(" "+ answer);
				
			}
		});
		btnAdd.setBounds(102, 141, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\Screenshot 2021-02-08 194130.png"));
		lblImage.setBounds(-85, 0, 519, 308);
		contentPane.add(lblImage);
	}
}
