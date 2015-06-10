package TowerDefense;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class choixJeu extends JFrame {
	public choixJeu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(Color.BLACK);
		
		JButton btnCarte = new JButton("Carte 1");
		btnCarte.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Carte carte = new Carte();
				carte.setSize(800,600);
				carte.setVisible(true);
				carte.setLocationRelativeTo(null);
			}
		});
		
		JButton btnCarte_1 = new JButton("Carte 2");
		btnCarte_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Carte_1 carte_1 = new Carte_1();
				carte_1.setSize(800,600);
				carte_1.setVisible(true);
				carte_1.setLocationRelativeTo(null);
			}
		});
		
		JButton btnCarte_2 = new JButton("Carte 3");
		btnCarte_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Carte_2 carte_2 = new Carte_2();
				carte_2.setSize(800,600);
				carte_2.setVisible(true);
				carte_2.setLocationRelativeTo(null);
			}
		});
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Fenetre fenetre = new Fenetre();
				fenetre.setSize(800,600);
				fenetre.setVisible(true);
				fenetre.setLocationRelativeTo(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(677, Short.MAX_VALUE)
					.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(73)
					.addComponent(btnCarte, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(98)
					.addComponent(btnCarte_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(97)
					.addComponent(btnCarte_2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(66))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(312, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCarte_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCarte_2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCarte, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addGap(134)
					.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	 }
}
