package guess.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GamePanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton selectDifficultyButton;
		
		public GamePanel()
		{
			baseLayout = new SpringLayout();
			selectDifficultyButton = new JButton("Change the Difficulty");
			
			buildPanel();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setLayout(baseLayout);
			add(selectDifficultyButton);
		}
		public void nothing()
			{
				ChangeDifficultyWindow changeDiff = new ChangeDifficultyWindow();
				//changeDiff.setVisible(true);
			}
		private void buildListeners()
		{
			selectDifficultyButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent clicked)
					{
						GameFrame gameFrame = new GameFrame();
						
						gameFrame.setVisible(false);
						nothing();
						
					}
				});
		}
		
	}
