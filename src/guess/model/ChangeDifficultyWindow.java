package guess.model;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeDifficultyWindow extends JFrame
	{
		private GridLayout baseLayout;
		private JPanel basePanel;
		private JButton easyButton;
		
		public ChangeDifficultyWindow()
		{
			baseLayout = new GridLayout();
			easyButton = new JButton("Easy");
			basePanel = new JPanel();
			
			buildPanel();
		}
		public void buildFrame()
		{
			setContentPane(basePanel);
			setLayout(baseLayout);
			setTitle("Change Difficulty");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(500, 150);
			setVisible(true);
		}
		
		private void buildPanel()
		{
			basePanel.add(easyButton);
		}
	}

