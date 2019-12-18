// The entry point of the game.
// This class loads up a JFrame window and
// puts a GamePanel into it.

package com.neet.DiamondHunter.Main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;

public class Game {

	private static JFrame window;

	public static void runDHMainGame() {
		window = new JFrame("Diamond Hunter: Map Viewer Instance");
		GamePanel gp = new GamePanel();
		window.add(gp);

		window.setResizable(false);
		window.pack();

		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		WindowListener closeWindow = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				window.setVisible(false);
				gp.getGsm().setState(GameStateManager.INTRO);
				JukeBox.stopAll();
			}

		};

		window.addWindowListener(closeWindow);
	}

	public static JFrame getWindow() {
		return window;
	}

}


