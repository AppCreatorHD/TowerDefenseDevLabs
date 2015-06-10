package TowerDefense;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Carte_2 extends JFrame {
	public Carte_2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(Color.BLACK);
	}
}