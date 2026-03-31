package Listener;
import Main.GrapplePlatformer;
import Class.Ball;
import java.awt.event.*;

public class BallMotionListener implements KeyListener {
	@Override
	public void keyPressed(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_LEFT){
			GrapplePlatformer.ball.setAX(-Ball.X_A);
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			GrapplePlatformer.ball.setAX(Ball.X_A);
		}
	}
	@Override
	public void keyReleased(KeyEvent e){
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT){
			GrapplePlatformer.ball.setAX(0);
		}
	}
	@Override
	public void keyTyped(KeyEvent e){
		return; 
	}
}