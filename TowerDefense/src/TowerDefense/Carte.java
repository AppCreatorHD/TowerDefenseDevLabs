package TowerDefense;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Carte extends JFrame {
	public Carte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(Color.BLACK);
	}
}