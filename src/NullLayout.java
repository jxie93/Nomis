import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

import javax.swing.*;

public class NullLayout extends JFrame {
	
	ArrayList seq = new ArrayList();

	private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8;
	private JLabel label;
	boolean isTrue;
	
	
	private JButton[] buttonArray = new JButton[9];

	public NullLayout(int size) {
	
		
		
		buttonArray[0]=jb0;
		buttonArray[1]=jb1;
		buttonArray[2]=jb2;
		buttonArray[3]=jb3;
		buttonArray[4]=jb4;
		buttonArray[5]=jb5;
		buttonArray[6]=jb6;
		buttonArray[7]=jb7;
		buttonArray[8]=jb8;
		
		// TODO Auto-generated constructor stub
		isTrue=true;
		JPanel mainPanel = new JPanel();//Base panel definition
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);
		setTitle("New Game");
        setSize(new Dimension(1000, 600));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
		label = new JLabel();
		
		Container c = getContentPane();
		c.setLayout(null);
		
		ImageIcon image0 = new ImageIcon("resources/icons/red1.png");
		final ImageIcon image01 = new ImageIcon("resources/icons/green1.png");
		jb0 = new JButton();
		jb0.setIcon(image0);
		ImageIcon image1 = new ImageIcon("resources/icons/green1.png");
		final ImageIcon image11 = new ImageIcon("resources/icons/green1.png");
		jb1 = new JButton();
		jb1.setIcon(image1);
		ImageIcon image2 = new ImageIcon("resources/icons/yellow1.png");
		final ImageIcon image21 = new ImageIcon("resources/icons/green1.png");
		jb2 = new JButton();
		jb2.setIcon(image2);
		ImageIcon image3 = new ImageIcon("resources/icons/brown1.png");
		final ImageIcon image31 = new ImageIcon("resources/icons/green1.png");
		jb3 = new JButton();
		jb3.setIcon(image3);
		ImageIcon image4 = new ImageIcon("resources/icons/violet1.png");
		final ImageIcon image41 = new ImageIcon("resources/icons/green1.png");
		jb4 = new JButton();
		jb4.setIcon(image4);
		ImageIcon image5 = new ImageIcon("resources/icons/blue1.png");
		final ImageIcon image51 = new ImageIcon("resources/icons/green1.png");
		jb5 = new JButton();
		jb5.setIcon(image5);
		ImageIcon image6 = new ImageIcon("resources/icons/dgreen1.png");
		final ImageIcon image61 = new ImageIcon("resources/icons/green1.png");
		jb6 = new JButton();
		jb6.setIcon(image6);
		ImageIcon image7 = new ImageIcon("resources/icons/white1.png");
		final ImageIcon image71 = new ImageIcon("resources/icons/green1.png");
		jb7 = new JButton();
		jb7.setIcon(image7);
		ImageIcon image8 = new ImageIcon("resources/icons/cyan1.png");
		final ImageIcon image81 = new ImageIcon("resources/icons/green1.png");
		jb8 = new JButton();
		jb8.setIcon(image8);
		final ImageIcon image9 = new ImageIcon("");

		
		jb0.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			    	label.setText("String 0");
			    	jb0.setIcon(image01);
			    	}

			   }
		 });
		
	
		jb1.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 1");	
			     jb1.setIcon(image11);
			    }
		 
			   }
		 });
		
		jb2.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 2");
			     jb2.setIcon(image21);
			    }
		 
			   }
		 });
		
		jb3.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 3");
			     jb3.setIcon(image31);
			    }
		 
			   }
		 });
		
		jb4.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 4");
			     jb4.setIcon(image41);
			    }
		 
			   }
		 });
		
		jb5.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 5");
			     jb5.setIcon(image51);
			    }
		 
			   }
		 });
		
		jb6.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 6");
			     jb6.setIcon(image61);
			    }
		 
			   }
		 });
		
		jb7.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 7");
			     jb7.setIcon(image71);
			    }
		 
			   }
		 });
		
		jb8.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 8");
			     jb8.setIcon(image81);
			     }
			   
			   }
		 });
		
		
		
		if(size==4)
		{
			jb0.setBounds(0, 0, 120, 125);
			c.add(jb0);
			jb1.setBounds(125, 0, 120, 125);
			c.add(jb1);
			jb3.setBounds(0, 130, 120, 125);
			c.add(jb3);
			jb4.setBounds(125, 130, 120, 125);
			c.add(jb4);
			setSize(250, 600);
		}
		
		if(size==6)
		{
			jb0.setBounds(0, 0, 120, 125);
			c.add(jb0);
			jb1.setBounds(125, 0, 120, 125);
			c.add(jb1);
			jb2.setBounds(250,0, 120, 125);
			c.add(jb2);
			jb3.setBounds(0, 130, 120, 125);
			c.add(jb3);
			jb4.setBounds(125, 130, 120, 125);
			c.add(jb4);
			jb5.setBounds(250, 130, 120, 125);
			c.add(jb5);
			setSize(380, 600);
		}
		
		if(size==9)
		{
		jb0.setBounds(0, 0, 120, 125);
		c.add(jb0);
		jb1.setBounds(125, 0, 120, 125);
		c.add(jb1);
		jb2.setBounds(250,0, 120, 125);
		c.add(jb2);
		jb3.setBounds(0, 130, 120, 125);
		c.add(jb3);
		jb4.setBounds(125, 130, 120, 125);
		c.add(jb4);
		jb5.setBounds(250, 130, 120, 125);
		c.add(jb5);
		jb6.setBounds(0, 260, 120, 125);
		c.add(jb6);
		jb7.setBounds(125, 260 , 120, 125);
		c.add(jb7);
		jb8.setBounds(250, 260, 120, 125);
		c.add(jb8);
		
		setSize(380, 600);
		}
		
		label.setBounds(180,550,100,30);
		c.add(label);
		
		
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JButton getButton(int buttonNo)
	{
		return buttonArray[buttonNo];
		
	}
	
	public static void main(String[] args) {
		new NullLayout(4);
	}
}
