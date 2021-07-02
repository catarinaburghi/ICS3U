import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*Catarina Burghi
 * Date: March 1st 2021
 * This program is supposed to calculate
 * the average of 4 given marks.
 */
public class FrmAverageCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtCourseMark1;
	private JTextField txtCourseMark2;
	private JTextField txtCourseMark3;
	private JTextField txtCourseMark4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAverageCalculator frame = new FrmAverageCalculator();
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
	public FrmAverageCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Course Average Calculator");
		lblTitle.setForeground(Color.RED);
		lblTitle.setBounds(145, 0, 157, 25);
		contentPane.add(lblTitle);
		
		JLabel lblEnter = new JLabel("Enter your marks and click ");
		lblEnter.setBounds(94, 21, 157, 14);
		contentPane.add(lblEnter);
		
		JLabel lblCourseMark1 = new JLabel("Course Mark 1");
		lblCourseMark1.setBounds(94, 68, 100, 14);
		contentPane.add(lblCourseMark1);
		
		JLabel lblCourseMark2 = new JLabel("Course Mark 2");
		lblCourseMark2.setBounds(94, 93, 100, 14);
		contentPane.add(lblCourseMark2);
		
		JLabel lblCourseMark4 = new JLabel("Course Mark 4");
		lblCourseMark4.setBounds(94, 143, 100, 14);
		contentPane.add(lblCourseMark4);
		
		JLabel lblCourseMark3 = new JLabel("Course Mark 3");
		lblCourseMark3.setBounds(94, 118, 100, 14);
		contentPane.add(lblCourseMark3);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(199, 229, 62, 14);
		contentPane.add(lblAverage);
		
		txtCourseMark1 = new JTextField();
		txtCourseMark1.setBounds(269, 65, 86, 20);
		contentPane.add(txtCourseMark1);
		txtCourseMark1.setColumns(10);
		
		txtCourseMark2 = new JTextField();
		txtCourseMark2.setBounds(269, 90, 86, 20);
		contentPane.add(txtCourseMark2);
		txtCourseMark2.setColumns(10);
		
		txtCourseMark3 = new JTextField();
		txtCourseMark3.setBounds(269, 115, 86, 20);
		contentPane.add(txtCourseMark3);
		txtCourseMark3.setColumns(10);
		
		txtCourseMark4 = new JTextField();
		txtCourseMark4.setBounds(269, 140, 86, 20);
		contentPane.add(txtCourseMark4);
		txtCourseMark4.setColumns(10);
		
		JButton btnCalculateAverage = new JButton("Calculate Average");
		btnCalculateAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double mark1;
				double mark2;
				double mark3;
				double mark4;
				double average;
				double average1;
				
				mark1=Double.parseDouble(txtCourseMark1.getText());
				mark2=Double.parseDouble(txtCourseMark2.getText());
				mark3=Double.parseDouble(txtCourseMark3.getText());
				mark4=Double.parseDouble(txtCourseMark4.getText());
				
				average=mark1+mark2+mark3+mark4;
				average1=average/4;
				
				average1=average1*100;
				average1=Math.round(average1);
				average1=average1/100;
				
				lblAverage.setText(" "+average1);
			}
		});
		btnCalculateAverage.setBounds(145, 195, 157, 23);
		contentPane.add(btnCalculateAverage);
		
		JLabel lblCalculate = new JLabel("\"Calculate Average\"");
		lblCalculate.setBounds(94, 43, 118, 14);
		contentPane.add(lblCalculate);
	}

}
