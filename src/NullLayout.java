import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

import javax.swing.*;
import javax.swing.border.LineBorder;

/*Pass an ArrayList of generated integers as inputSequence to get this class to flash the corresponding buttons. 
This class will produce an integer array userInput as a record of buttons pressed by the user. Use returnUserIn method to access it.*/

public class NullLayout extends JFrame {

	private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8;
	private JLabel label;
	private int[] userInput = new int[9]; //Array to record user's interaction with buttons
	private JButton[] buttonArray = new JButton[9]; //Array containing all buttons
	private ImageIcon[] imageOn = new ImageIcon[9]; //Array containing all static images for buttons
	private ImageIcon[] imageFlash = new ImageIcon[9]; //Array containing all flashing images for buttons
	

	public NullLayout(int size) {

		for (int i=0;i<9;i++)
		{
			userInput[i]=0;
		}
		

		//Define button array
		buttonArray[0]=jb0;
		buttonArray[1]=jb1;
		buttonArray[2]=jb2;
		buttonArray[3]=jb3;
		buttonArray[4]=jb4;
		buttonArray[5]=jb5;
		buttonArray[6]=jb6;
		buttonArray[7]=jb7;
		buttonArray[8]=jb8;
		
		//Define all static image icons
		imageOn[0]=new ImageIcon("resources/icons/red1.png");
		imageOn[1]=new ImageIcon("resources/icons/green1.png");
		imageOn[2]=new ImageIcon("resources/icons/yellow1.png");
		imageOn[3]=new ImageIcon("resources/icons/brown1.png");
		imageOn[4]=new ImageIcon("resources/icons/cyan1.png");
		imageOn[5]=new ImageIcon("resources/icons/violet1.png");
		imageOn[6]=new ImageIcon("resources/icons/blue1.png");
		imageOn[7]=new ImageIcon("resources/icons/dgreen1.png");
		imageOn[8]=new ImageIcon("resources/icons/white1.png");
		
		//Define all flash image icons
		imageFlash[0]=new ImageIcon("resources/icons/red2.gif");
		imageFlash[1]=new ImageIcon("resources/icons/green2.gif");
		imageFlash[2]=new ImageIcon("resources/icons/yellow2.gif");
		imageFlash[3]=new ImageIcon("resources/icons/brown2.gif");
		imageFlash[4]=new ImageIcon("resources/icons/cyan2.gif");
		imageFlash[5]=new ImageIcon("resources/icons/violet2.gif");
		imageFlash[6]=new ImageIcon("resources/icons/blue2.gif");
		imageFlash[7]=new ImageIcon("resources/icons/dgreen2.gif");
		imageFlash[8]=new ImageIcon("resources/icons/white2.gif");


		JPanel mainPanel = new JPanel();//Base panel definition
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		add(mainPanel);
		setTitle("New Game");
		setSize(new Dimension(1000, 600));
		setLocationRelativeTo(null);
		setResizable(false);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);

		label = new JLabel();
		Container c = getContentPane();
		c.setLayout(null);
		
		for (int y=0;y<9;y++) //Set initial states for all buttons
		{
			buttonArray[y]=new JButton();
			buttonArray[y].setIcon(imageOn[y]);
		}
		
		for(int i = 0; i < 9; i++) {
		    makeButton(i);
		}

		JButton spell = new JButton("Magic Spell");
        spell.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent event) {
        		//Place magic spell routine here
        	}
        });
		
		if(size==4)
		{
			buttonArray[0].setBounds(0, 0, 120, 125);
			c.add(buttonArray[0]);
			buttonArray[1].setBounds(125, 0, 120, 125);
			c.add(buttonArray[1]);
			buttonArray[3].setBounds(0, 130, 120, 125);
			c.add(buttonArray[3]);
			buttonArray[4].setBounds(125, 130, 120, 125);
			c.add(buttonArray[4]);

			JLabel scorebar = new JLabel();
		    scorebar.setPreferredSize(new Dimension(-1, 22));
		    scorebar.setBorder(LineBorder.createGrayLineBorder());
		    scorebar.setText("Score: ");
		    scorebar.setBounds(0,270,1000,25);
		    c.add(scorebar);
		    JLabel itembar = new JLabel();
		    itembar.setPreferredSize(new Dimension(-1, 22));
		    itembar.setBorder(LineBorder.createGrayLineBorder());
		    itembar.setText("Spells remaining: ");
		    itembar.setBounds(0,296,1000,25);
		    c.add(itembar);
		    
			spell.setBounds(120, 270, 125, 50);
			c.add(spell);
			setSize(250, 350);
		}

		if(size==6)
		{
			buttonArray[0].setBounds(0, 0, 120, 125);
			c.add(buttonArray[0]);
			buttonArray[1].setBounds(125, 0, 120, 125);
			c.add(buttonArray[1]);
			buttonArray[2].setBounds(250,0, 120, 125);
			c.add(buttonArray[2]);
			buttonArray[3].setBounds(0, 130, 120, 125);
			c.add(buttonArray[3]);
			buttonArray[4].setBounds(125, 130, 120, 125);
			c.add(buttonArray[4]);
			buttonArray[5].setBounds(250, 130, 120, 125);
			c.add(buttonArray[5]);
			
			JLabel scorebar = new JLabel();
		    scorebar.setPreferredSize(new Dimension(-1, 22));
		    scorebar.setBorder(LineBorder.createGrayLineBorder());
		    scorebar.setText("Score: ");
		    scorebar.setBounds(0,270,1000,25);
		    c.add(scorebar);
		    JLabel itembar = new JLabel();
		    itembar.setPreferredSize(new Dimension(-1, 22));
		    itembar.setBorder(LineBorder.createGrayLineBorder());
		    itembar.setText("Spells remaining: ");
		    itembar.setBounds(0,296,1000,25);
		    c.add(itembar);
		    
		    spell.setBounds(250, 270, 125, 50);
			c.add(spell);
			setSize(380, 350);
		}

		if(size==9)
		{
			buttonArray[0].setBounds(0, 0, 120, 125);
			c.add(buttonArray[0]);
			buttonArray[1].setBounds(125, 0, 120, 125);
			c.add(buttonArray[1]);
			buttonArray[2].setBounds(250,0, 120, 125);
			c.add(buttonArray[2]);
			buttonArray[3].setBounds(0, 130, 120, 125);
			c.add(buttonArray[3]);
			buttonArray[4].setBounds(125, 130, 120, 125);
			c.add(buttonArray[4]);
			buttonArray[5].setBounds(250, 130, 120, 125);
			c.add(buttonArray[5]);
			buttonArray[6].setBounds(0, 260, 120, 125);
			c.add(buttonArray[6]);
			buttonArray[7].setBounds(125, 260 , 120, 125);
			c.add(buttonArray[7]);
			buttonArray[8].setBounds(250, 260, 120, 125);
			c.add(buttonArray[8]);
			
			JLabel scorebar = new JLabel();
		    scorebar.setPreferredSize(new Dimension(-1, 22));
		    scorebar.setBorder(LineBorder.createGrayLineBorder());
		    scorebar.setText("Score: ");
		    scorebar.setBounds(0,415,1000,25);
		    c.add(scorebar);
		    JLabel itembar = new JLabel();
		    itembar.setPreferredSize(new Dimension(-1, 22));
		    itembar.setBorder(LineBorder.createGrayLineBorder());
		    itembar.setText("Spells remaining: ");
		    itembar.setBounds(0,441,1000,25);
		    c.add(itembar);
		    
		    spell.setBounds(250, 415, 125, 50);
			c.add(spell);
			setSize(380, 500);
		}

		label.setBounds(180,550,100,30);
		c.add(label);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void makeButton(final int index){ //Each button initialisation
		buttonArray[index].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(index+" pressed"); //Test line
				buttonArray[index].setIcon(imageOn[index]);
				userInput[index]+=1; //Record the button pressed into the userInput array
			}
		});
}

	public void flash(ArrayList<Integer> inputSequence) //Feed an array of integers into this to get corresponding buttons to flash
	{
		for (int i=0;i<inputSequence.size();i++)
		{
			int currentButton=inputSequence.get(i);
			buttonArray[currentButton].setIcon(imageFlash[currentButton]); //Set corresponding icon to animate
			stopButtonFlash(i); //Set icon back to static image after a delay
		}
	}
	
	private void stopButtonFlash(final int c)
	{
		Timer timer = new Timer(500, new ActionListener() { //Timer set to 500ms, after that the button icon will be reset to its original static image
			public void actionPerformed(ActionEvent e) {
				buttonArray[c].setIcon(imageOn[c]);
			}
		});
		timer.start();
	}
	
	public int[] returnUserIn()
	{
		return userInput;
	}

	public JButton getButton(int buttonNo)
	{
		return buttonArray[buttonNo];
	}
	
	public static void main(String[] args) {
		new NullLayout(9);		
	}
}
