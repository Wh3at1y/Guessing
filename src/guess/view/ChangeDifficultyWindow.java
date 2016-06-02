package guess.view;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class ChangeDifficultyWindow extends JFrame
	{
		private GridLayout baseLayout;
		private JPanel basePanel;
		private JButton easyButton;
		private JButton normalButton;
		private JButton hardButton;
		
		public ChangeDifficultyWindow()
		{
			baseLayout = new GridLayout();
			basePanel = new JPanel();
			easyButton = new JButton("Easy");
			normalButton = new JButton("Normal");
			hardButton = new JButton("Hard");
			
			buildFrame();
			buildPanel();
			buildListeners();
		}
		private void buildFrame()
		{	
			setContentPane(basePanel);
			basePanel.setLayout(baseLayout);
			setTitle("Change Difficulty");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pack();
			setSize(500, 150);
			setVisible(true);
		}
		
		private void buildPanel()
		{
			basePanel.add(easyButton);
			basePanel.add(normalButton);
			basePanel.add(hardButton);
		}
		
		private void buildListeners()
		{
			easyButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent clicked)
					{
						GameFrame startGame = new GameFrame();
						startGame.buildFrame();
						startGame.setVisible(true);
						setVisible(false);
					}
				});
		}
	}

