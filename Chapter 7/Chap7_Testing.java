import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Chap7_Testing extends JFrame {
    private JLabel label2;
    private JLabel label1;
    private JTextField textField1;
    private JButton plainButton;
    private JButton fancyButton;
    private JTextArea Textbox1;
    private JTextField TextA;
    private JRadioButton b1, b2, b3;
    private JComboBox ComboBox;
    private String names[]= {"kuih.gif","kuih1.gif","kuih3.gif"};
    private JCheckBox cb1, c2 ;
    private JMenuBar Menubar1;
   
    public Chap7_Testing(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       
       label1 = new JLabel("Hello There");
       container.add(label1);
       
       Icon MaxVer = new ImageIcon("src/MaxVer.jpg");
       label2 = new JLabel("This is Max Verstappen");
      // label1.setToolTipText("this is label1");
       label2.setToolTipText("This is Max Verstappen");
       container.add(label2);
       label2.setIcon(MaxVer);
       setSize(275,200);
       setVisible(true);
       
       textField1 = new JTextField(10);
       container.add(textField1);
       
       plainButton = new JButton("Plain Button");
       container.add(plainButton);
       
       Icon AMG = new ImageIcon("src/amg_button.png");
       fancyButton = new JButton("Register", AMG);
       container.add(fancyButton);
       
       TextA = new JTextField ("Key in here");
       TextA.setSize(100,20);
       TextA.setLocation(20,20);
       TextA.setBackground(Color.red);
       TextA.setForeground(Color.BLUE);
       TextA.setFont(new Font("Courier",Font.ITALIC,15));
       add(TextA);
       
       Textbox1 = new JTextArea ("Multiple line");
       Textbox1.setSize(100,200);
       Textbox1.setLocation(150,50);
       Textbox1.setBackground(Color.PINK);
       Textbox1.setForeground(Color.DARK_GRAY);
       Textbox1.setFont(new
       Font("Bookman",Font.TRUETYPE_FONT,16));
       add(Textbox1);
       
       ButtonGroup group1 = new ButtonGroup();
       
       b1 =new JRadioButton("Hagen Dazz");
       b2 =new JRadioButton("Basken Robin");
       b3 =new JRadioButton("Walls");
       
       b1.setBounds(20,20,200,50);
       b2.setBounds(20,70,200,50);
       b3.setBounds(20,110,200,50);
       
       container.add(b1);
       container.add(b2);
       container.add(b3);
       
       group1.add(b1);
       group1.add(b2);
       group1.add(b3);
       
       ComboBox = new JComboBox(names);
       ComboBox.setMaximumRowCount(3);
       ComboBox.setBounds(50,50,100,20);
       add(ComboBox);
       
       cb1 = new JCheckBox("C");
       c2 = new JCheckBox("JAVA");
       
       cb1.setBounds(20,20,200,50);
       c2.setBounds(20,70,200,50);
       add(cb1);
       add(c2);
       
       
       
       JMenu Menusub1,Menusub2,sub1;
       JMenuItem itemlist1,itemlist2;
       Menubar1 = new JMenuBar();
       Menusub1=new JMenu ("File");
       Menusub2=new JMenu ("Help");
       sub1 = new JMenu();
       itemlist1=new JMenuItem ("Open File");
       Menusub1.add(itemlist1);
       itemlist1=new JMenuItem ("Close File");
       Menusub1.add(itemlist1);
       itemlist1=new JMenuItem ("Save File");
       Menusub1.add(itemlist1);
       itemlist1=new JMenuItem ("About");
       Menusub2.add(itemlist1);
       sub1 =new JMenu ("Expand");
       
       //******Adding submenu*********//
       itemlist2=new JMenuItem ("Expand 1");
       sub1.add(itemlist2);
       itemlist2=new JMenuItem ("Expand 2");
       sub1.add(itemlist2);
       //******Finish adding submenu*********//
       Menusub2.add(sub1);
       itemlist1=new JMenuItem ("Exit");
       Menusub2.add(itemlist1);
       Menubar1.add(Menusub1);
       Menubar1.add(Menusub2);
       
       setJMenuBar(Menubar1);
    }
    public static void main(String[] args) {
        Chap7_Testing application = new Chap7_Testing();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
