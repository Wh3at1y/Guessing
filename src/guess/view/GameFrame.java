package guess.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame
	{
		GamePanel basePanel = new GamePanel();
		
		public GameFrame()
		{
			basePanel = new GamePanel();
			
			//buildFrame();
		}
		
		public void buildFrame()
		{
			setTitle("Guess the Number!");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,400);
			setContentPane(basePanel);
			setVisible(true);
		}
	}
