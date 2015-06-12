package TowerDefense;

public class ASSAILLANTS {

	protected int nombre_hp;
	protected int nombre_degats;
	protected float vitesse_deplacement;
	protected int portee;
	protected float resistance;
	protected int ressources_gagnees;
	protected int nord = 0;
	protected int sud = 2;
	protected int est = 1;
	protected int ouest = 3;
	protected int x;
	protected int y;
	protected int direction;
	protected char dessin;
	protected int nbr_assaillants = 5;
	public int nextInt(int n) {
		return 0;
	}
	
	public ASSAILLANTS genererAssaillantRandom()
	{
		Object hasard = null;
		switch (((ASSAILLANTS) hasard).nextInt(nbr_assaillants)) {
		case 0:
			return new Assaillant1();
		case 1:
			return new Assaillant2();
		case 2:
			return new Assaillant3();
		case 3:
			return new Assaillant4();
		default:
			return new Assaillant5();
		}
	
	}
	
	public void ASSAILLANTSAttaques(){
		
	}
	
	public void SeDelplacer() {
		
	}
}

