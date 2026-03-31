import java.awt.event.*;

class PauseButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		GrapplePlatformer.PAUSE = !GrapplePlatformer.PAUSE;
		GrapplePlatformer.graphicsPanel.requestFocusInWindow();
	}
}