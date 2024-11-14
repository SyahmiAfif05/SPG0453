package JavaPop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Chap7_GUI_Voting {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chap7_GUI_Voting window = new Chap7_GUI_Voting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chap7_GUI_Voting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Kick Sauber Voting");
		Image icons = Toolkit.getDefaultToolkit().getImage("src/2418779.png");
		frame.setIconImage(icons);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 980, 798);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 966, 283);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Hello_World\\src\\kick.png"));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("                                             Vote for the Stake F1 Team Kick Sauber drivers for 2025 !!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(-179, 293, 1034, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Screenshot 2024-10-23 173303.png"));
		lblNewLabel_2.setBounds(109, 345, 213, 254);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("                  Valtteri Bottas");
		rdbtnNewRadioButton.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBounds(109, 592, 213, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Screenshot 2024-10-23 173654.png"));
		lblNewLabel_2_1.setBounds(407, 345, 198, 254);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JRadioButton rdbtnZhouGuanyu = new JRadioButton("                  Guanyu Zhou");
		rdbtnZhouGuanyu.setForeground(Color.WHITE);
		rdbtnZhouGuanyu.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		rdbtnZhouGuanyu.setBackground(Color.BLACK);
		rdbtnZhouGuanyu.setBounds(392, 592, 213, 21);
		frame.getContentPane().add(rdbtnZhouGuanyu);
		
		JRadioButton rdbtnZaneMaloney = new JRadioButton("                  Zane Maloney");
		rdbtnZaneMaloney.setForeground(Color.WHITE);
		rdbtnZaneMaloney.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 15));
		rdbtnZaneMaloney.setBackground(Color.BLACK);
		rdbtnZaneMaloney.setBounds(676, 592, 213, 21);
		frame.getContentPane().add(rdbtnZaneMaloney);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Screenshot 2024-10-23 173813.png"));
		lblNewLabel_2_1_1.setBounds(676, 345, 198, 245);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("or enter your driver of choice !");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(381, 632, 258, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(381, 669, 258, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(439, 713, 147, 48);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}
