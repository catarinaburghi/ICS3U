/*Catarina Burghi
 * Date: March 2nd 2021
 * This program simulates a shop,
 * you can input the amount of flowers you want
 * and it outputs the subtotal, the total
 * and the amout that you are paying in taxes.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMakingPurchases extends JFrame {

	private JPanel contentPane;
	private JTextField txtRedTulips;
	private JTextField txtAllium;
	private JTextField txtBlueOrchid;
	private JTextField txtPinkTulip;
	private JTextField txtOrangeTulip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMakingPurchases frame = new FrmMakingPurchases();
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
	public FrmMakingPurchases() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFlowerShop = new JLabel("Cat's Flower Shop!");
		lblFlowerShop.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblFlowerShop.setForeground(Color.GREEN);
		lblFlowerShop.setBounds(0, 0, 277, 64);
		contentPane.add(lblFlowerShop);
		
		JLabel lblFlowers = new JLabel("");
		lblFlowers.setIcon(new ImageIcon(FrmMakingPurchases.class.getResource("/flowers.jfif")));
		lblFlowers.setBounds(302, 0, 132, 107);
		contentPane.add(lblFlowers);
		
		JLabel lblInstruction = new JLabel("Please enter the amount you would like of each flower!");
		lblInstruction.setBounds(0, 33, 264, 44);
		contentPane.add(lblInstruction);
		
		JLabel lblPurchaseInstruction = new JLabel("If you'd like to purchase the flowers press \"buy\"");
		lblPurchaseInstruction.setBounds(0, 63, 248, 24);
		contentPane.add(lblPurchaseInstruction);
		
		JLabel lblRedTulips = new JLabel("Red Tulip $1 each");
		lblRedTulips.setBounds(10, 98, 113, 14);
		contentPane.add(lblRedTulips);
		
		JLabel lblAllium = new JLabel("Allium $1 each");
		lblAllium.setBounds(10, 123, 96, 14);
		contentPane.add(lblAllium);
		
		JLabel lblBlueOrchid = new JLabel("Blue Orchid $1 each");
		lblBlueOrchid.setBounds(10, 148, 149, 14);
		contentPane.add(lblBlueOrchid);
		
		txtRedTulips = new JTextField();
		txtRedTulips.setText("0");
		txtRedTulips.setBounds(133, 95, 26, 20);
		contentPane.add(txtRedTulips);
		txtRedTulips.setColumns(10);
		
		txtAllium = new JTextField();
		txtAllium.setText("0");
		txtAllium.setBounds(133, 120, 26, 20);
		contentPane.add(txtAllium);
		txtAllium.setColumns(10);
		
		txtBlueOrchid = new JTextField();
		txtBlueOrchid.setText("0");
		txtBlueOrchid.setBounds(133, 145, 26, 20);
		contentPane.add(txtBlueOrchid);
		txtBlueOrchid.setColumns(10);
		
		txtPinkTulip = new JTextField();
		txtPinkTulip.setText("0");
		txtPinkTulip.setBounds(133, 170, 26, 20);
		contentPane.add(txtPinkTulip);
		txtPinkTulip.setColumns(10);
		
		JLabel lblPinkTulip = new JLabel("Pink Tulip $1 each");
		lblPinkTulip.setBounds(10, 173, 113, 14);
		contentPane.add(lblPinkTulip);
		
		JLabel lblOrangeTulip = new JLabel("Orange Tulip $1 each");
		lblOrangeTulip.setBounds(10, 198, 124, 14);
		contentPane.add(lblOrangeTulip);

		txtOrangeTulip = new JTextField();
		txtOrangeTulip.setText("0");
		txtOrangeTulip.setBounds(133, 195, 26, 20);
		contentPane.add(txtOrangeTulip);
		txtOrangeTulip.setColumns(10);

		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(346, 148, 88, 14);
		contentPane.add(lblSubtotal);
		
		JLabel lbltax = new JLabel("Tax:");
		lbltax.setBounds(346, 173, 88, 14);
		contentPane.add(lbltax);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(346, 198, 88, 14);
		contentPane.add(lblTotal);
		
		JButton btnbuy = new JButton("Buy!");
		btnbuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Tax;
				double RedTulip;
				double price;
				double OrangeTulip;
				double PinkTulip;
				double Allium;
				double BlueOrchid;
				double subtotal;
				double total1;
				double total2;
				double totaltax;
				
				price=1;
				Tax= 0.13;
				
				RedTulip=Double.parseDouble(txtRedTulips.getText());
				OrangeTulip=Double.parseDouble(txtOrangeTulip.getText());
				PinkTulip=Double.parseDouble(txtPinkTulip.getText());
				Allium=Double.parseDouble(txtAllium.getText());
				BlueOrchid=Double.parseDouble(txtBlueOrchid.getText());
				
				subtotal=RedTulip+OrangeTulip+PinkTulip+Allium+BlueOrchid;
				total1=subtotal*price;
				totaltax=total1*Tax;
				total2=total1+totaltax;
				
				lblSubtotal.setText("SubTotal:$ "+subtotal);
				lbltax.setText("Tax:$ "+totaltax);
			    lblTotal.setText("Total:$ "+total2);
			    
				
			}
		});
		btnbuy.setBounds(324, 118, 89, 23);
		contentPane.add(btnbuy);
		
		
		
		
		}
	}	





