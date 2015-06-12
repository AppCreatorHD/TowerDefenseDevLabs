package TowerDefense;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Fenetre extends JFrame {
	public Fenetre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));  //sert a changer l'icone en haut a gauche de la fenetre
		setResizable(false);  //empeche de changer la taille de la fenetre
		setTitle("Tower Defense");  //donne un titre a la fenetre
		getContentPane().setBackground(new Color(0, 0, 0));  //permet de mettre un fond noir

		JButton btnChargerPartie = new JButton("Charger Partie");  //JButton sert a creer un bouton
		btnChargerPartie.setFont(new Font("Tahoma", Font.PLAIN, 18));  //permet de changer la police d'écriture sur le bouton

		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuitter.addActionListener(new ActionListener() {  //attend l'action
			public void actionPerformed(ActionEvent e) {  // execute  l'action
				System.exit(0); //ferme toutes les fenetres
			}
		});

		JLabel lblTowerDefense = new JLabel("");  //permet de creer une étiquette
		lblTowerDefense.setIcon(new ImageIcon("Image/imgTD.jpg"));  //insertion d'une image
		lblTowerDefense.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 50));
		lblTowerDefense.setHorizontalAlignment(SwingConstants.CENTER);  //permet de centrer ce qui se trouve dans le Label
		lblTowerDefense.setForeground(Color.RED);  //changer la couleur de l'écriture

		JButton btnJouer = new JButton("Jouer");
		btnJouer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnJouer.setForeground(new Color(0, 0, 0));
		btnJouer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();  //ferme la fenetre
				choixJeu ChoixJeu = new choixJeu();
				ChoixJeu.setSize(800,600);  //donne une taille a la fenetre
				ChoixJeu.setVisible(true);  //rend visible la fenetre
				ChoixJeu.setLocationRelativeTo(null);  //centre la fenetre
			}
		});
		
		//positionne tous les elements dans la fenetre
		GroupLayout groupLayout = new GroupLayout(getContentPane());  //permet de positionner les elements dans la fenetre
		groupLayout.setHorizontalGroup( //decoupe la fenetre en plusieurs colonnes
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()  //ajoute un groupe a un autre
					.addGap(89)  //intervalle avant le bouton "charger partie"
					.addComponent(btnChargerPartie, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)  //ajoute un composant en lui attribuant une largeur
					.addPreferredGap(ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(89))  //intervalle apres le bouton "Quitter"
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(287, Short.MAX_VALUE)
					.addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addGap(287))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(159, Short.MAX_VALUE)
					.addComponent(lblTowerDefense, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
		);
		groupLayout.setVerticalGroup(  //decoupe la fenetre en plusieurs lignes
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTowerDefense, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnChargerPartie, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}