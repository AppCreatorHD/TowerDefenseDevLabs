package TowerDefense;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MAP {
	int[][] Map1 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{4,2,2,2,2,2,2,2,2,2,2,2,2,3,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	public MAP[][] map;
	
	public MAP(int[][]Map1){
	map = new MAP[15][15];
	for (int i = 0; i<15; i++){
		for (int j=0; j<15; j++){
			if(Map1[j][i] == 1){
				JButton casemap = new JButton( new ImageIcon("Image/herbe.jpg"));
				JPanel pnlNewPanel = new JPanel();
				pnlNewPanel.add(casemap);
			}
			if(Map1[j][i] == 2){
				JButton casemap = new JButton( new ImageIcon("Image/chemin.jpg"));
				JPanel pnlNewPanel = new JPanel();
				pnlNewPanel.add(casemap);
			}
			
		}
	}
}
}