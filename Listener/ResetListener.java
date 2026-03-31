package Listener;
import Main.GrapplePlatformer;
import Class.Ball;
import java.awt.event.*;

public class ResetListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		GrapplePlatformer.ball.setX(GrapplePlatformer.WIDTH/2);
		GrapplePlatformer.ball.setY(GrapplePlatformer.HEIGHT/2);
		GrapplePlatformer.ball.setDisplayX(0);
		GrapplePlatformer.ball.setDisplayY(0);
		GrapplePlatformer.ball.setVX(0);
		GrapplePlatformer.ball.setVY(0);

		GrapplePlatformer.ball.setGrapOnCooldown(false);
		GrapplePlatformer.ball.setGrapMeter(Ball.GRAP_LIMIT);

		GrapplePlatformer.grounds.clear();
		CreateGroundListener resetGroundTemp = new CreateGroundListener();
		resetGroundTemp.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
		GrapplePlatformer.graphicsPanel.requestFocusInWindow();
	}
}