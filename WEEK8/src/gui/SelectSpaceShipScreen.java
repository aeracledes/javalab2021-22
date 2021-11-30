package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import spaceships.SpaceShipALPHA;
import spaceships.SpaceShipBETA;
import spaceships.SpaceShipDELTA;
import spaceships.SpaceShipGAMA;
import spaceships.SpaceShipZERO;

public class SelectSpaceShipScreen extends JPanel{
	private static final long serialVersionUID = 1L;
	
	SelectSpaceShipScreen(){
		this.setLayout( new BorderLayout(30, 30) );
		this.add(createNorthPanel(), BorderLayout.NORTH);
    	this.add(createCenterPanel(), BorderLayout.CENTER);
		this.add(createSouthPanel(), BorderLayout.SOUTH);
		this.setBackground(Color.BLACK);
    }
	
	
	
	private JPanel createNorthPanel()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        JLabel label = new JLabel("Please choose your Spaceship "); 
        label.setFont(new Font("Arcade Classic", Font.PLAIN, 25));
        label.setForeground(Color.WHITE);
        panel.setBackground(Color.BLACK);
        panel.add(label );
        return panel;
    }
	
	private JPanel createCenterPanel() {
		JButton btnspaceShipZero=new JButton();  
		JButton btnspaceShipAlpha=new JButton();  
		JButton btnspaceShipBeta=new JButton();  
		JButton btnspaceShipGama=new JButton();  
		JButton btnspaceShipDelta=new JButton(); 
		btnspaceShipZero.addActionListener(new SpaceShipSelectionBtnHandler("SZERO"));
		btnspaceShipAlpha.addActionListener(new SpaceShipSelectionBtnHandler("SALPHA"));
		btnspaceShipBeta.addActionListener(new SpaceShipSelectionBtnHandler("SBETA"));
		btnspaceShipGama.addActionListener(new SpaceShipSelectionBtnHandler("SGAMA"));
		btnspaceShipDelta.addActionListener(new SpaceShipSelectionBtnHandler("SDELTA"));
		
		btnspaceShipZero.setIcon(new ImageIcon(SpaceShipZERO.img));
		btnspaceShipAlpha.setIcon(new ImageIcon(SpaceShipALPHA.img));
		btnspaceShipBeta.setIcon(new ImageIcon(SpaceShipBETA.img));
		btnspaceShipGama.setIcon(new ImageIcon(SpaceShipGAMA.img));
		btnspaceShipDelta.setIcon(new ImageIcon(SpaceShipDELTA.img));
		makeBtnsTransparent(btnspaceShipZero);
		makeBtnsTransparent(btnspaceShipAlpha);
		makeBtnsTransparent(btnspaceShipBeta);
		makeBtnsTransparent(btnspaceShipGama);
		makeBtnsTransparent(btnspaceShipDelta);
		
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBackground(Color.BLACK);
        panel.add(btnspaceShipZero);  
        panel.add(btnspaceShipAlpha);  
        panel.add(btnspaceShipBeta);
        panel.add(btnspaceShipGama);
        panel.add(btnspaceShipDelta);
        return panel;
		
	}
	
	private JPanel createSouthPanel() {
		JPanel panelSouth = new JPanel();
        panelSouth.setPreferredSize(new Dimension(100, 200));
        panelSouth.setBackground(Color.BLACK);
        return panelSouth;
		
	}

	private void makeBtnsTransparent(JButton btn) {
		btn.setBackground(Color.BLACK);
		btn.setOpaque(false);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
		btn.setFocusPainted( false );
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR)); // This one line changes the cursor.
	}
	
	 
	class SpaceShipSelectionBtnHandler implements ActionListener {
			String name;
			
			public SpaceShipSelectionBtnHandler(String x) {
				name = x; 
			}
			
			public void actionPerformed(ActionEvent ev){
				
				SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
				SpaceFrame.gamePlayScreen.setFocusable(true);//in order to catch the keyevents
				SpaceFrame.gamePlayScreen.requestFocus();
				
				if(name.equalsIgnoreCase("SZERO"))SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipZERO());
				if(name.equalsIgnoreCase("SALPHA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipALPHA());
				if(name.equalsIgnoreCase("SBETA"))SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipBETA());
				if(name.equalsIgnoreCase("SGAMA"))SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipGAMA());
				if(name.equalsIgnoreCase("SDELTA"))SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipDELTA());
				
				
				
			}	
		}
}
