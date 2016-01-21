package guess.view;

import javax.swing.*;

public class GamePanel extends JPanel
	{
		private JButton selectDifficultyButton;
		
		public GamePanel()
		{
			selectDifficultyButton = new JButton("Change the Difficulty");
			buildPanel();
		}
		
		private void buildPanel()
		{
			add(selectDifficultyButton);
		}
	}
