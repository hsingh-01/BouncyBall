import java.awt.event.*;

class TimerListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (!GrapplePlatformer.PAUSE){
			GrapplePlatformer.pauseButton.setText("pause");
			GrapplePlatformer.graphicsPanel.updatePosition();  
			GrapplePlatformer.graphicsPanel.repaint();  
			GrapplePlatformer.MS_ELAPSED += GrapplePlatformer.GAME_SPEED;
		}
		if (GrapplePlatformer.PAUSE){
			GrapplePlatformer.pauseButton.setText("play");
		}
	}
}