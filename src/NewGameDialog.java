import java.awt.Dimension;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;


class NewGameDialog extends JDialog {

    public NewGameDialog() {

        initUI();
    }

    public final void initUI() {
    	
    	JPanel mainPanel = new JPanel();//Base panel definition
		mainPanel.setLayout(null);
		add(mainPanel);
		mainPanel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton close = new JButton("Close");
        JButton veasyGame = new JButton("Cheat Mode");
        veasyGame.setToolTipText("Press this if you are retarded.");
        JButton easyGame = new JButton("Easy");
        easyGame.setToolTipText("Start a new game at easy difficulty");
        JButton mediumGame = new JButton("Medium");
        mediumGame.setToolTipText("Start a new game at medium difficulty");
        JButton hardGame = new JButton("Hard");
        hardGame.setToolTipText("Start a new game at hard difficulty.");
        JButton hellGame = new JButton("Hell");
        hellGame.setToolTipText("Start a new game at Hell difficulty, play if you want to go to hell.");
        
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });
        veasyGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	//
            }
        });
        easyGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	NullLayout ng1 = new NullLayout(4);
                ng1.setVisible(true);
                dispose();
            }
        });
        mediumGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	NullLayout ng1 = new NullLayout(6);
                ng1.setVisible(true);
                dispose();
            }
        });
        hardGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	NullLayout ng1 = new NullLayout(9);
                ng1.setVisible(true);
                dispose();
            }
        });
        hellGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	//
            }
        });

        
        veasyGame.setBounds(70, 25, 150, 25);
        mainPanel.add(veasyGame);
        easyGame.setBounds(70, 65, 150, 25);
        mainPanel.add(easyGame);
        mediumGame.setBounds(70, 105, 150, 25);
        mainPanel.add(mediumGame);
        hardGame.setBounds(70, 145, 150, 25);
        mainPanel.add(hardGame);
        hellGame.setBounds(70, 185, 150, 25);
        mainPanel.add(hellGame);
        close.setBounds(70, 280, 150, 25);
        mainPanel.add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("Select Game Mode");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 350);
    }
}