/*Catarina Burghi
 * Date: March 16th 2021
 * This program simulates a pizza shop,
 * the clients get to pick the diameter of their pizza
 * and the program outputs the total, subtotal, tax and a message 
 * depending on the size of the pizza you selected.
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmPizza extends JFrame {

	private JPanel contentPane;
	private JTextField textDiameter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPizza frame = new FrmPizza();
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
	public FrmPizza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Putrid Pizza!");
		lblName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(10, 11, 144, 44);
		contentPane.add(lblName);
		
		JLabel lblDiameter = new JLabel("Please enter the diameter of the pizza you'd like: (in centemeters)");
		lblDiameter.setBounds(10, 49, 414, 14);
		contentPane.add(lblDiameter);
		
		textDiameter = new JTextField();
		textDiameter.setBounds(172, 74, 86, 20);
		contentPane.add(textDiameter);
		textDiameter.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(10, 131, 97, 14);
		contentPane.add(lblSubtotal);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setBounds(10, 156, 97, 14);
		contentPane.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(10, 181, 97, 14);
		contentPane.add(lblTotal);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(0, 206, 424, 48);
		contentPane.add(lblMessage);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\cfbur\\OneDrive\\Pictures\\pizza.jfif"));
		lblPicture.setBounds(268, 70, 166, 111);
		contentPane.add(lblPicture);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declaring all my variables
				
				final double LABOUR;
				final double RENT;
				final double DIAMETERS;
				final double TAX;
				double subtotal;
				double total;
				double taxtotal;
				double size;
				double finalsize;
				
				TAX = 0.13;
				LABOUR = 0.75;
				RENT = 0.99;
				DIAMETERS = 0.50;
				
				size=Double.parseDouble(textDiameter.getText());
				finalsize=size*DIAMETERS;
				subtotal=finalsize+RENT+LABOUR;
				taxtotal=subtotal*TAX;
				
				// rounding to 2 decimal places 
				taxtotal=taxtotal*100;
				taxtotal= Math.round(taxtotal);
				taxtotal=taxtotal/100;
				total=taxtotal+subtotal;	
				total=total*100;
				total= Math.round(total);
				total=total/100;
				
				lblSubtotal.setText("Subtotal: "+subtotal);
				lblTax.setText("Tax: "+taxtotal);
				lblTotal.setText("Total: "+total);
				
				//if statements 
				
				if(size<=15) {
				lblMessage.setText("We are going to make you a cute little pizza!");
				
				}
				else if (size<=20) {
				lblMessage.setText("This one is good to eat alone!");
				
				}
				else if (size<=40) {
				lblMessage.setText("This will be delicious!");
				
				}
				else {
				lblMessage.setText("Whoa, big pizza! You might need a truck to get this home!");
				
				}
				
			}
			});
		btnCalculate.setBounds(172, 101, 89, 23);
		contentPane.add(btnCalculate);
	}

}
