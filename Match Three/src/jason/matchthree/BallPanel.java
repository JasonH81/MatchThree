package jason.matchthree;

import javax.swing.JPanel;

public class BallPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static final int ROWS = 10;
	private static final int COLS = 6;
	private static final int WIDTH = COLS * Cell.SIZE;
	private static final int HEIGHT = ROWS & Cell.SIZE;
	
	private MatchThree game;
	private Cell[][] cells = new Cell[ROWS][COLS];

}
