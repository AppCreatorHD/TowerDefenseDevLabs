package TowerDefense;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JSlider;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Fenetre extends JFrame {
	private JTextField txtTowerDefense;
	public Fenetre() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.BLACK);
		
		txtTowerDefense = new JTextField();
		txtTowerDefense.setText("Tower Defense");
		txtTowerDefense.setForeground(Color.RED);
		txtTowerDefense.setBackground(Color.BLACK);
		getContentPane().add(txtTowerDefense, BorderLayout.NORTH);
		txtTowerDefense.setColumns(10);
		setFont(null);
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane()}));
	}
}
