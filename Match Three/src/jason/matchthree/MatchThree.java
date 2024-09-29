package jason.matchthree;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import jason.mycomponents.TitleLabel;

public class MatchThree extends JFrame {

	private static final long serialVersionUID = 1L;
	
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
