package TowerDefense;

import javax.swing.JFrame;
/*import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;*/
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
// import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Fenetre extends JFrame {
	public Fenetre() {
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(new Color(0, 0, 0));
		
		JButton btnChargerPartie = new JButton("Charger Partie");
		btnChargerPartie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel lblTowerDefense = new JLabel("");
		lblTowerDefense.setIcon(new ImageIcon("Image/imgTD.jpg"));
		lblTowerDefense.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 50));
		lblTowerDefense.setHorizontalAlignment(SwingConstants.CENTER);
		lblTowerDefense.setForeground(Color.RED);
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnJouer.setForeground(new Color(0, 0, 0));
		btnJouer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				choixJeu ChoixJeu = new choixJeu();
				ChoixJeu.setSize(800,600);
				ChoixJeu.setVisible(true);
				ChoixJeu.setLocationRelativeTo(null);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(btnChargerPartie, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(284, Short.MAX_VALUE)
					.addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addGap(273))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(159, Short.MAX_VALUE)
					.addComponent(lblTowerDefense, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
		);
		groupLayout.setVerticalGroup(
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
