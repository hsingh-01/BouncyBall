package Listener;
import Main.GrapplePlatformer;
import java.awt.event.*;

public class PauseButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		GrapplePlatformer.PAUSE = !GrapplePlatformer.PAUSE;
		GrapplePlatformer.graphicsPanel.requestFocusInWindow();
	}
}