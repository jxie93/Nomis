import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

import javax.swing.*;

public class NullLayout extends JFrame {
	
	ArrayList seq = new ArrayList();

	private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
	private JLabel label;
	boolean isTrue;

	
	public NullLayout() {
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
		ImageIcon image0 = new ImageIcon("D:/Documents/My Java/Nomis/src/red1.png");
		jb0 = new JButton();
		jb0.setIcon(image0);
		ImageIcon image1 = new ImageIcon("D:/Documents/My Java/Nomis/src/green1.png");
		jb1 = new JButton();
		jb1.setIcon(image1);
		ImageIcon image2 = new ImageIcon("D:/Documents/My Java/Nomis/src/yellow1.png");
		jb2 = new JButton();
		jb2.setIcon(image2);
		ImageIcon image3 = new ImageIcon("/D:/Documents/My Java/Nomis/src/brown1.png");
		jb3 = new JButton();
		jb3.setIcon(image3);
		ImageIcon image4 = new ImageIcon("D:/Documents/My Java/Nomis/src/violet1.png");
		jb4 = new JButton();
		jb4.setIcon(image4);
		ImageIcon image5 = new ImageIcon("D:/Documents/My Java/Nomis/src/blue1.png");
		jb5 = new JButton();
		jb5.setIcon(image5);
		ImageIcon image6 = new ImageIcon("D:/Documents/My Java/Nomis/src/dgreen1.png");
		jb6 = new JButton();
		jb6.setIcon(image6);
		ImageIcon image7 = new ImageIcon("/D:/Documents/My Java/Nomis/src/white1.png");
		jb7 = new JButton();
		jb7.setIcon(image7);
		ImageIcon image8 = new ImageIcon("D:/Documents/My Java/Nomis/src/cyan1.png");
		jb8 = new JButton();
		jb8.setIcon(image8);
		final ImageIcon image9 = new ImageIcon("");
		jb9 = new JButton();
		jb9.setIcon(image9);
		
		
		/*Flash f1 = new Flash();
		jb0.addActionListener(f1);
		

		Timer timer = new Timer(500,f1);
		timer.setInitialDelay(1000);
		timer.start();*/
	
		
		jb0.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			    	label.setText("String 0");

			    	}

			   }
		 });
		
	
		jb1.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 1");	    
			    }
		 
			   }
		 });
		
		jb2.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 2");
			    }
		 
			   }
		 });
		
		jb3.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 3");
			    }
		 
			   }
		 });
		
		jb4.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 4");
			    }
		 
			   }
		 });
		
		jb5.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 5");
			    }
		 
			   }
		 });
		
		jb6.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 6");
			    }
		 
			   }
		 });
		
		jb7.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 7");
			    }
		 
			   }
		 });
		
		jb8.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 8");
			     }
			   
			   }
		 });
		
		jb9.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
			    if(isTrue){
			     label.setText("String 9");
			     }
			   
			   }
		 });
		
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
		jb9.setBounds(2, 400, 370, 130);
		c.add(jb9);
		
		label.setBounds(180,550,100,30);
		c.add(label);
		
		setSize(380, 600);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/*class Flash implements ActionListener {

	    public void actionPerformed(ActionEvent e) {
	        jb0.setVisible(false);
	    }
	}*/

	public static void main(String[] args) {
		new NullLayout();
	}
}
