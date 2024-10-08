package jason.matchthree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import jason.mycomponents.ScorePanel;
import jason.mycomponents.TitleLabel;

public class MatchThree extends JFrame {

	private static final long serialVersionUID = 1L;
	private ScorePanel scorePanel = new ScorePanel(0, Color.GREEN);
	private BallPanel ballPanel = new BallPanel(this);
	
	public MatchThree() {
		initGUI();
		setTitle("Match Three");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initGUI() {
		TitleLabel titleLabel = new TitleLabel("Match Three");
		add(titleLabel, BorderLayout.PAGE_START);
		
		// main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.GREEN);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		add(mainPanel, BorderLayout.CENTER);
		
		// score panel
		mainPanel.add(scorePanel);

		// ball panel
		mainPanel.add(ballPanel);
		
		// button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		mainPanel.add(buttonPanel);
		
		JButton hintButton = new JButton("Hint");
		hintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showHint();
			}
		});
		buttonPanel.add(hintButton);
	}
	
	public void addToScore(int newPoints) {
		scorePanel.addToScore(newPoints);
	}
	
	public void restart() {
		scorePanel.reset();
		ballPanel.setInitialBalls();
	}
	
	public void showHint() {
		ballPanel.showHint();
	}

	public static void main(String[] args) {
		try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		}
		catch (Exception e) {}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MatchThree();
			}
		});

	}

}
