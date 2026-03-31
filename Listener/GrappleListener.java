package Listener;
import Main.GrapplePlatformer;
import java.awt.event.*;

public class GrappleListener implements KeyListener {
	@Override
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_Z){
			GrapplePlatformer.ball.setGrap(true);
		}
	}
	@Override
	public void keyReleased(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_Z){
			GrapplePlatformer.ball.setGrap(false);
			GrapplePlatformer.graphicsPanel.grappleTarget = null;
		}
	}
	@Override
	public void keyTyped(KeyEvent e){
		return;
	}
}
