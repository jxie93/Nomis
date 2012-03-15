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
	private int changebutton0;
	private int changebutton1;
	private int changebutton2;
	private int changebutton3;
	private int changebutton4;
	private int changebutton5;
	private int changebutton6;
	private int changebutton7;
	private int changebutton8;
	
	
	
	private JButton[] buttonArray = new JButton[9];

	public NullLayout(int size) {
		changebutton0 =0;
		changebutton1 =0;
		changebutton2 =0;
		changebutton3 =0;
		changebutton4 =0;
		changebutton5 =0;
		changebutton6 =0;
		changebutton7 =0;
		changebutton8 =0;
		
		
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
		
		final ImageIcon image0 = new ImageIcon("resources/icons/red1.png");
		final ImageIcon image01 = new ImageIcon("resources/icons/red2.gif");
		jb0 = new JButton();
		jb0.setIcon(image0);
		final ImageIcon image1 = new ImageIcon("resources/icons/green1.png");
		final ImageIcon image11 = new ImageIcon("resources/icons/green2.gif");
		jb1 = new JButton();
		jb1.setIcon(image1);
		final ImageIcon image2 = new ImageIcon("resources/icons/yellow1.png");
		final ImageIcon image21 = new ImageIcon("resources/icons/yellow2.gif");
		jb2 = new JButton();
		jb2.setIcon(image2);
		final ImageIcon image3 = new ImageIcon("resources/icons/brown1.png");
		final ImageIcon image31 = new ImageIcon("resources/icons/brown2.gif");
		jb3 = new JButton();
		jb3.setIcon(image3);
		final ImageIcon image4 = new ImageIcon("resources/icons/violet1.png");
		final ImageIcon image41 = new ImageIcon("resources/icons/violet2.gif");
		jb4 = new JButton();
		jb4.setIcon(image4);
		final ImageIcon image5 = new ImageIcon("resources/icons/blue1.png");
		final ImageIcon image51 = new ImageIcon("resources/icons/blue2.gif");
		jb5 = new JButton();
		jb5.setIcon(image5);
		final ImageIcon image6 = new ImageIcon("resources/icons/dgreen1.png");
		final ImageIcon image61 = new ImageIcon("resources/icons/dgreen2.gif");
		jb6 = new JButton();
		jb6.setIcon(image6);
		final ImageIcon image7 = new ImageIcon("resources/icons/white1.png");
		final ImageIcon image71 = new ImageIcon("resources/icons/white2.gif");
		jb7 = new JButton();
		jb7.setIcon(image7);
		final ImageIcon image8 = new ImageIcon("resources/icons/cyan1.png");
		final ImageIcon image81 = new ImageIcon("resources/icons/cyan2.gif");
		jb8 = new JButton();
		jb8.setIcon(image8);
	

		
		jb0.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
			    if(changebutton0 % 2 == 0){
			    	label.setText("String 0");
			    	jb0.setIcon(image01);
			    	}
			    else {jb0.setIcon(image0);}
			    changebutton0 = changebutton0 + 1;
			    	jb7.setIcon(image7);
				   jb1.setIcon(image1);
				   jb2.setIcon(image2);
				   jb3.setIcon(image3);
				   jb4.setIcon(image4);
				   jb5.setIcon(image5);
				   jb6.setIcon(image6);
				   jb8.setIcon(image8);
			   }
		 });
		
	
		jb1.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
				   if(changebutton1 % 2 == 0){
				    	label.setText("String 1");
				    	jb1.setIcon(image11);
				    	}
				    else {jb1.setIcon(image1);}
				    changebutton1 = changebutton1 + 1;
				    jb0.setIcon(image0);
					   jb7.setIcon(image7);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb4.setIcon(image4);
					   jb5.setIcon(image5);
					   jb6.setIcon(image6);
					   jb8.setIcon(image8);
			    }
		 
			   
		 });
		
		jb2.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   
				   changebutton0 =0;
					changebutton1 =0;
				
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
					   if(changebutton2 % 2 == 0){
					    	label.setText("String 2");
					    	jb2.setIcon(image21);
					    	}
					    else {jb2.setIcon(image2);}
					    changebutton2 = changebutton2 + 1;
					    jb0.setIcon(image0);
						   jb1.setIcon(image1);
						   jb7.setIcon(image7);
						   jb3.setIcon(image3);
						   jb4.setIcon(image4);
						   jb5.setIcon(image5);
						   jb6.setIcon(image6);
						   jb8.setIcon(image8);
				    }
		 
			   
		 });
		
		jb3.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
				   if(changebutton3 % 2 == 0){
				    	label.setText("String 3");
				    	jb3.setIcon(image31);
				    	}
				    else {jb3.setIcon(image3);}
				    changebutton3 = changebutton3 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb7.setIcon(image7);
					   jb4.setIcon(image4);
					   jb5.setIcon(image5);
					   jb6.setIcon(image6);
					   jb8.setIcon(image8);
			    }
	 
		   
		 });
		
		jb4.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
				  
				   if(changebutton4 % 2 == 0){
				    	label.setText("String 4");
				    	jb4.setIcon(image41);
				    	}
				    else {jb4.setIcon(image4);}
				    changebutton4 = changebutton4 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb7.setIcon(image7);
					   jb5.setIcon(image5);
					   jb6.setIcon(image6);
					   jb8.setIcon(image8);
			    }
	 
		 });
		
		jb5.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					
					changebutton6 =0;
					changebutton7 =0;
					changebutton8 =0;
				   
				   if(changebutton5 % 2 == 0){
				    	label.setText("String 5");
				    	jb5.setIcon(image51);
				    	}
				    else jb5.setIcon(image5);
				    changebutton5 = changebutton5 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb4.setIcon(image4);
					   jb7.setIcon(image7);
					   jb6.setIcon(image6);
					   jb8.setIcon(image8);
			    }
	 
		 });
		
		jb6.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					
					changebutton7 =0;
					changebutton8 =0;
				   if(changebutton6 % 2 == 0){
				    	label.setText("String 6");
				    	jb6.setIcon(image61);
				    	}
				    else {jb6.setIcon(image6);}
				    changebutton6 = changebutton6 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb4.setIcon(image4);
					   jb5.setIcon(image5);
					   jb7.setIcon(image7);
					   jb8.setIcon(image8);
			    }
	 
		 });
		
		jb7.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					
					changebutton8 =0;
				   
				   if(changebutton7 % 2 == 0){
				    	label.setText("String 7");
				    	jb7.setIcon(image71);
				    	}
				    else {jb7.setIcon(image7);}
				    changebutton7 = changebutton7 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb4.setIcon(image4);
					   jb5.setIcon(image5);
					   jb6.setIcon(image6);
					   jb8.setIcon(image8);
			    }
	 
		 });
		
		jb8.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
				   changebutton0 =0;
					changebutton1 =0;
					changebutton2 =0;
					changebutton3 =0;
					changebutton4 =0;
					changebutton5 =0;
					changebutton6 =0;
					changebutton7 =0;
				
				   if(changebutton8 % 2 == 0){
				    	label.setText("String 8");
				    	jb8.setIcon(image81);
				    	}
				    else {jb8.setIcon(image8);}
				    changebutton8 = changebutton8 + 1;
				    jb0.setIcon(image0);
					   jb1.setIcon(image1);
					   jb2.setIcon(image2);
					   jb3.setIcon(image3);
					   jb4.setIcon(image4);
					   jb5.setIcon(image5);
					   jb6.setIcon(image6);
					   jb7.setIcon(image7);
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
		new NullLayout(9);
	}
}
