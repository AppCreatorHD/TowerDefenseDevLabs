package TowerDefense;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Carte_2 extends JFrame {
	public int heure=0, minute=0, seconde=0, ressources=0;
	public int delais=1000;
	
	public JLabel lblNewLabel_1 = new JLabel(""+heure+":"+minute+":"+seconde+" "+ressources);
	public ActionListener tacheTimer;
	public Timer timer1;
	
	public Carte_2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Image/imgDL.jpg"));
		setResizable(false);
		setTitle("Tower Defense");
		getContentPane().setBackground(Color.BLACK);
		
		this.getContentPane().add(lblNewLabel_1);
		chrono();
		
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("Image/Map3-3.png"));
		
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
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(152)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTour, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTour_1, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnTour_2, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnAmlior, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnSuppr, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(154))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(95)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(209, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
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
					.addContainerGap(441, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
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
		  //Afficher le chrono dans un JLabel
		  lblNewLabel_1.setText(heure+":"+minute+":"+seconde+" "+ressources);
 
		 }
     };
     //Action et temps execution de la tache
     timer1=new Timer(delais,tacheTimer);
     //Demarrer le chrono
     timer1.start();

	}
}