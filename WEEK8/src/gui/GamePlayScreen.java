package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;
import spaceships.*;

public class GamePlayScreen extends JPanel implements KeyListener{
	private static final long serialVersionUID = 1L;
	
	private SpaceShip userSpaceShip;
	GamePlayScreen(){   	
     	addKeyListener(this);
    	this.setVisible(true); 
    	this.setBackground( Color.BLACK );
    	createDaemon();
    }
	private void createDaemon() {
		Timer timer = new Timer();
		TimerTask task = new monitor DaemonGame();
		timer.schedule(task, 100,100);
	}
	class monitorDaemonGame extends TimerTask{
		public void run() {repaint();}
	}
	 @Override
	 public void paintComponent (Graphics g) {   	
	        super.paintComponent(g);
	        enemySpaceShip.hunterUserSpaceShip(userSpaceShip);
	        userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
	        enemySpaceShip.getIcon().paintIcon(this, g ,enemySpaceShip.getX(), enemySpaceShip.getY());
	        showLaserShootings(g);
	 }
	 
	 private void showLaserShootings(Graphics g) {
		 userSpaceShip.gun.laserShootersLinkedList.forEach((tmp) -> {
			 g.setColor(userSpaceShip.gun.lasercolor);
			 g.drawLine(tmp.x,tmp.y,tmp.x,tmp.y-15);
			 tmp.y=tmp.y-15; //move line up
		 });
	 }
	@Override
	public void keyPressed (KeyEvent e) {  
		if (e.getKeyCode() == KeyEvent.VK_UP) userSpaceShip.moveUP();
		if (e.getKeyCode() == KeyEvent.VK_DOWN) userSpaceShip.moveDOWN();
		if (e.getKeyCode() == KeyEvent.VK_LEFT) userSpaceShip.moveLEFT();
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) userSpaceShip.moveRIGHT();
	    this.repaint();
    }    
	
	@Override
	public void keyReleased (KeyEvent e) {}    
	
	@Override
	public void keyTyped (KeyEvent e){}
	void setUserSpaceShip(SpaceShip usel) {
		userSpaceShip=usel;
	}
}


