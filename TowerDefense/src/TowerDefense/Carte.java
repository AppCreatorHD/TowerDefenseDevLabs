package TowerDefense;

import TowerDefense.MAP;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Carte extends JFrame {
	public int heure=0, minute=0, seconde=0, ressources=100;  //initialisation pour le timer et les ressources
	public int delais=1000;
	
	public JLabel lblNewLabel_1 = new JLabel(""+heure+":"+minute+":"+seconde);
	public JLabel lblNewLabel_2 = new JLabel("Or :"+ressources);
	public ActionListener tacheTimer;
	public Timer timer1;
	
	public Carte() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(Color.BLACK);
		
		this.getContentPane().add(lblNewLabel_1);
		chrono();
		
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//creation d'une grille de boutons dans un Panel
		JPanel pnlNewPanel = new JPanel(new GridLayout (15,15));
		{ 
			for(int i=0; i<225;i++){
				switch(i){
				case 105:
					JButton casemapspawn = new JButton( new ImageIcon("Image/spawn.png"));
					pnlNewPanel.add(casemapspawn);
					break;			
				case 106:
					JButton casemapchemin = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin);
					break;
				case 107:
					JButton casemapchemin1 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin1);
					break;
				case 108:
					JButton casemapchemin2 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin2);
					break;
				case 109:
					JButton casemapchemin3 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin3);
					break;
				case 110:
					JButton casemapchemin4 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin4);
					break;
				case 111:
					JButton casemapchemin5 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin5);
					break;
				case 112:
					JButton casemapchemin6 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin6);
					break;
				case 113:
					JButton casemapchemin7 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin7);
					break;
				case 114:
					JButton casemapchemin8 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin8);
					break;
				case 115:
					JButton casemapchemin9 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin9);
					break;
				case 116:
					JButton casemapchemin10 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin10);
					break;
				case 117:
					JButton casemapchemin11 = new JButton( new ImageIcon("Image/chemin.jpg"));
					pnlNewPanel.add(casemapchemin11);
					break;
				case 118:
					JButton casemapchemin12 = new JButton( new ImageIcon("Image/base.png"));
					pnlNewPanel.add(casemapchemin12);
					break;
				default:
					JButton casemap = new JButton( new ImageIcon("Image/herbe.jpg"));
					pnlNewPanel.add(casemap);
					break;
					
				}
			}
		}
		
		JButton btnNewButton = new JButton("Tour1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnTour = new JButton("Tour2");
		btnTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnTour_1 = new JButton("Tour3");
		
		JButton btnTour_2 = new JButton("Tour4");
		
		JButton btnAmlior = new JButton("Amel.");
		
		JButton btnSuppr = new JButton("Suppr");
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
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
					.addGap(152)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTour, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTour_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnTour_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnAmlior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnSuppr, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(154))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addGap(79)
					.addComponent(pnlNewPanel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
					.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(695, Short.MAX_VALUE)
					.addComponent(btnQuitter)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnQuitter)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(pnlNewPanel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTour, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTour_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTour_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAmlior, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSuppr, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addGap(26))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(106)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(336, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	//affichage du chrono
	public void chrono(){
		ActionListener tacheTimer= new ActionListener()  {
		  public void actionPerformed(ActionEvent e1)  {
		    seconde++;
		    ressources++;
		     if(seconde==60)  {
		          seconde=0;
		          minute++;
		      }
		  if(minute==60) {
		      minute=0;
		      heure++;
		   }
		 
		  lblNewLabel_1.setText(heure+":"+minute+":"+seconde);  //Afficher le chrono dans un Label
		  lblNewLabel_2.setText("Or: "+ressources);  //Afficher les ressources dans un Label
 
		 }
     };

     timer1=new Timer(delais,tacheTimer); //Action et temps execution de la tache
     
     timer1.start();  //Demarrer le chrono

	}
	
}