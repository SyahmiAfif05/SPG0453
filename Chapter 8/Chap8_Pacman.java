package JavaPop;

import java.awt.*;
import javax.swing.*;

public class Chap8_Pacman extends JPanel {
	public void paint(Graphics g) {

        super.paint(g);

 g.setFont(new Font("Arial", Font.BOLD+Font.ITALIC,50));
        g.drawString("Pacman Eating Dots",10,50);
        g.setColor(Color.BLUE);
        g.drawLine(5, 50, 500, 50);
        g.setColor( Color.YELLOW);
        g.fillArc( 10, 120,90, 90,45,300 );
        g.setColor( Color.WHITE);
        g.fillArc( 120, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 150, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 180, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 210, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 240, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 270, 140,20, 20,45,360 );
        g.setColor( Color.WHITE);
        g.fillArc( 300, 140,20, 20,45,360 );
}
	public static void main(String[] args) {
        // Create a JFrame and add the JPanel to it
        JFrame frame = new JFrame("Pacman");
        Chap8_Pacman panel = new Chap8_Pacman();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
