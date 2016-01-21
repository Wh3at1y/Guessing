package guess.controller;

import guess.model.ChangeDifficultyWindow;
import guess.view.GameFrame;

public class GameController
	{
		ChangeDifficultyWindow changeDifficult;
		GameFrame baseFrame;
		
		public GameController()
		{
			changeDifficult = new ChangeDifficultyWindow();
			baseFrame = new GameFrame();
		}
		
		public void start()
		{
			changeDifficult.buildFrame();
		}
	}
