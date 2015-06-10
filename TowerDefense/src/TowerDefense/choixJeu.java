package TowerDefense;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Image/Map1.png"));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("Image/Map2.png"));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setIcon(new ImageIcon("Image/Map3.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(687, Short.MAX_VALUE)
					.addComponent(btnRetour, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(73)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
						.addComponent(btnCarte, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
					.addGap(98)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
						.addComponent(btnCarte_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnCarte_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(190, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
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
