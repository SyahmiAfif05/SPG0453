package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class CalcGUI {

	private JFrame frame;
	private JTextField ResultsDisplay;
	private JButton ButtonCE;
	private JButton ButtonPlusMinus;
	private JButton ButtonC;
	private JButton Button8;
	private JButton Button7;
	private JButton ButtonPlus;
	private JButton Button9;
	private JButton Button5;
	private JButton Button4;
	private JButton ButtonMinus;
	private JButton Button6;
	private JButton Button2;
	private JButton Button1;
	private JButton ButtonPoint;
	private JButton Button0;
	private JButton ButtonMultiply;
	private JButton Button3;
	private JButton ButtonDivide;
	private JButton ButtonEquals;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	double NumEnter1;
	double NumEnter2;
	double Result;
	String Op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
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
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void EnterNumbers(String X) 
	{
		String Numbers = ResultsDisplay.getText() + X;
		ResultsDisplay.setText(Numbers);
	}
	private void initialize() {
		

		
		
		frame = new JFrame();
		frame.setTitle("Iphone Calculator");
		Image icons = Toolkit.getDefaultToolkit().getImage("src/calculator_pic.png");
		frame.setIconImage(icons);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 525, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button1 = new JButton("1");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("1");
			}
		});
		
		ButtonMultiply = new JButton("X");
		ButtonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(ResultsDisplay.getText());
				ResultsDisplay.setText("");
				Op = "*";
			}
		});
		ButtonMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonMultiply.setForeground(new Color(255, 255, 255));
		ButtonMultiply.setBackground(new Color(255, 159, 10));
		ButtonMultiply.setBounds(363, 425, 100, 100);
		frame.getContentPane().add(ButtonMultiply);
		
		Button2 = new JButton("2");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("2");
			}
		});
		Button2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button2.setForeground(new Color(255, 255, 255));
		Button2.setBackground(new Color(42, 42, 44));
		Button2.setBounds(140, 425, 100, 100);
		frame.getContentPane().add(Button2);
		
		Button3 = new JButton("3");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("3");
			}
		});
		Button3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button3.setForeground(new Color(255, 255, 255));
		Button3.setBackground(new Color(42, 42, 44));
		Button3.setBounds(253, 425, 100, 100);
		frame.getContentPane().add(Button3);
		
		Button4 = new JButton("4");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("4");
			}
		});
		Button4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button4.setForeground(new Color(255, 255, 255));
		Button4.setBackground(new Color(42, 42, 44));
		Button4.setBounds(30, 315, 100, 100);
		frame.getContentPane().add(Button4);
		
		Button7 = new JButton("7");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("7");
			}
		});
		Button7.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button7.setForeground(new Color(255, 255, 255));
		Button7.setBackground(new Color(42, 42, 44));
		Button7.setBounds(30, 205, 100, 100);
		frame.getContentPane().add(Button7);
		
		Button6 = new JButton("6");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("6");
			}
		});
		Button6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button6.setForeground(new Color(255, 255, 255));
		Button6.setBackground(new Color(42, 42, 44));
		Button6.setBounds(253, 315, 100, 100);
		frame.getContentPane().add(Button6);
		
		Button8 = new JButton("8");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("8");
			}
		});
		Button8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button8.setForeground(new Color(255, 255, 255));
		Button8.setBackground(new Color(42, 42, 44));
		Button8.setBounds(140, 205, 100, 100);
		frame.getContentPane().add(Button8);
		
		Button9 = new JButton("9");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("9");
			}
		});
		Button9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button9.setForeground(new Color(255, 255, 255));
		Button9.setBackground(new Color(42, 42, 44));
		Button9.setBounds(253, 205, 100, 100);
		frame.getContentPane().add(Button9);
		
		Button5 = new JButton("5");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("5");
			}
		});
		Button5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button5.setForeground(new Color(255, 255, 255));
		Button5.setBackground(new Color(42, 42, 44));
		Button5.setBounds(140, 315, 100, 100);
		frame.getContentPane().add(Button5);
		Button1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button1.setForeground(new Color(255, 255, 255));
		Button1.setBackground(new Color(42, 42, 44));
		Button1.setBounds(30, 425, 100, 100);
		frame.getContentPane().add(Button1);
		
		ResultsDisplay = new JTextField();
		ResultsDisplay.setForeground(new Color(255, 255, 255));
		ResultsDisplay.setBackground(new Color(0, 0, 0));
		ResultsDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResultsDisplay.setBounds(30, 10, 433, 77);
		frame.getContentPane().add(ResultsDisplay);
		ResultsDisplay.setColumns(10);
		
		JButton ButtonBack = new JButton("←");
		ButtonBack.setToolTipText("");
		ButtonBack.setFont(new Font("Tahoma", Font.BOLD, 30));
		ButtonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(ResultsDisplay.getText().length() > 0);
				{
					StringBuilder sb = new StringBuilder(ResultsDisplay.getText());
					sb.deleteCharAt(ResultsDisplay.getText().length() - 1);
					backspace = sb.toString();
					ResultsDisplay.setText(backspace);
				}
				
			}
		});
		ButtonBack.setBackground(new Color(92, 92, 95));
		ButtonBack.setForeground(new Color(255, 255, 255));
		ButtonBack.setBounds(30, 97, 100, 100);
		frame.getContentPane().add(ButtonBack);
		
		ButtonCE = new JButton("CE");
		ButtonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultsDisplay.setText("");
				String Fn, Sn;
				
				Fn = String.valueOf(NumEnter1);
				Sn = String.valueOf(NumEnter2);
				
				Fn=""; 
				Sn ="";
			}
		});
		ButtonCE.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonCE.setForeground(new Color(255, 255, 255));
		ButtonCE.setBackground(new Color(92, 92, 95));
		ButtonCE.setBounds(140, 97, 100, 100);
		frame.getContentPane().add(ButtonCE);
		
		ButtonPlusMinus = new JButton("±");
		ButtonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double nums = Double.parseDouble(String.valueOf(ResultsDisplay.getText()));
				nums = nums * (-1);
				ResultsDisplay.setText(String.valueOf(nums));
				
			}
		});
		ButtonPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonPlusMinus.setForeground(new Color(255, 255, 255));
		ButtonPlusMinus.setBackground(new Color(255, 159, 10));
		ButtonPlusMinus.setBounds(363, 97, 100, 100);
		frame.getContentPane().add(ButtonPlusMinus);
		
		ButtonC = new JButton("C");
		ButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultsDisplay.setText("");
			}
		});
		ButtonC.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonC.setForeground(new Color(255, 255, 255));
		ButtonC.setBackground(new Color(92, 92, 95));
		ButtonC.setBounds(253, 97, 100, 100);
		frame.getContentPane().add(ButtonC);
		
		ButtonPlus = new JButton("+");
		ButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(ResultsDisplay.getText());
				ResultsDisplay.setText("");
				Op = "+";
			}
		});
		ButtonPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonPlus.setForeground(new Color(255, 255, 255));
		ButtonPlus.setBackground(new Color(255, 159, 10));
		ButtonPlus.setBounds(363, 205, 100, 100);
		frame.getContentPane().add(ButtonPlus);
		
		ButtonMinus = new JButton("-");
		ButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(ResultsDisplay.getText());
				ResultsDisplay.setText("");
				Op = "-";
			}
		});
		ButtonMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonMinus.setForeground(new Color(255, 255, 255));
		ButtonMinus.setBackground(new Color(255, 159, 10));
		ButtonMinus.setBounds(363, 315, 100, 100);
		frame.getContentPane().add(ButtonMinus);
		
		ButtonPoint = new JButton(".");
		ButtonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (! ResultsDisplay.getText().contains("."))
				{
					ResultsDisplay.setText(ResultsDisplay.getText() + ButtonPoint.getText());
				}
			}
		});
		ButtonPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonPoint.setForeground(new Color(255, 255, 255));
		ButtonPoint.setBackground(new Color(42, 42, 44));
		ButtonPoint.setBounds(140, 535, 100, 100);
		frame.getContentPane().add(ButtonPoint);
		
		Button0 = new JButton("0");
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNumbers("0");
			}
		});
		Button0.setFont(new Font("Tahoma", Font.BOLD, 20));
		Button0.setForeground(new Color(255, 255, 255));
		Button0.setBackground(new Color(42, 42, 44));
		Button0.setBounds(30, 535, 100, 100);
		frame.getContentPane().add(Button0);
		
		ButtonDivide = new JButton("÷");
		ButtonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter1 = Double.parseDouble(ResultsDisplay.getText());
				ResultsDisplay.setText("");
				Op = "/";
			}
		});
		ButtonDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonDivide.setForeground(new Color(255, 255, 255));
		ButtonDivide.setBackground(new Color(255, 159, 10));
		ButtonDivide.setBounds(363, 535, 100, 100);
		frame.getContentPane().add(ButtonDivide);
		
		ButtonEquals = new JButton("=");
		ButtonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NumEnter2 = Double.parseDouble(ResultsDisplay.getText());
				if (Op == "+")
				{
					Result = NumEnter1 + NumEnter2;
					ResultsDisplay.setText(String.valueOf(NumEnter1 + "+" + NumEnter2 + "=" + Result));
				}
				
				else if (Op == "-")
				{
					Result = NumEnter1 - NumEnter2;
					ResultsDisplay.setText(String.valueOf(NumEnter1 + "-" + NumEnter2 + "=" + Result));
				}
				
				else if (Op == "*")
				{
					Result = NumEnter1 * NumEnter2;
					ResultsDisplay.setText(String.valueOf(NumEnter1 + "x" + NumEnter2 + "=" + Result));
				}
				
				else if (Op == "/")
				{
					Result = NumEnter1 / NumEnter2;
					ResultsDisplay.setText(String.valueOf(NumEnter1 + "÷" + NumEnter2 + "=" + Result));
				}
			}
		});
		ButtonEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonEquals.setForeground(new Color(255, 255, 255));
		ButtonEquals.setBackground(new Color(255, 159, 10));
		ButtonEquals.setBounds(253, 535, 100, 100);
		frame.getContentPane().add(ButtonEquals);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 511, 643);
		frame.getContentPane().add(panel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
