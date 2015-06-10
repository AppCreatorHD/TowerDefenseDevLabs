package TowerDefense;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
 
public class Carte_2 extends JFrame{
	//Declaration de variables
	private int heure=0,minute=0,seconde=0;
	private int delais=1000;
 
	private JLabel label=new JLabel(""+heure+":"+minute+":"+seconde);
	private ActionListener tache_timer;
	private Timer timer1;
 
 
	public Carte_2(){
		//Ajout de notre Jlabel au composant fenetre
		this.getContentPane().add(label);
		chrono();
	}
 
	//Methode pour lancer notre chrono
	public void chrono(){
		tache_timer= new ActionListener()  {
		  public void actionPerformed(ActionEvent e1)  {
		    seconde++;
		     if(seconde==60)  {
		          seconde=0;
		          minute++;
		      }
		  if(minute==60) {
		      minute=0;
		      heure++;
		   }
		  //Afficher le chrono dans un JLabel
		  label.setText(heure+":"+minute+":"+seconde);
 
		 }
     };
     //Action et temps execution de la tache
     timer1=new Timer(delais,tache_timer);
     //Demarrer le chrono
     timer1.start();
	}
 
}