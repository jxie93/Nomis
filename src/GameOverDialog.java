import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

class GameOverDialog extends JDialog {

    public GameOverDialog(int score) {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));
        
        JTextPane pane = new JTextPane();

        pane.setContentType("text/html");
        String text = "<p><center><b>Game Over</b></center></p>"+"<p><center>Your score: "+score+"</center></p>";
        pane.setText(text);
        pane.setEditable(false);
        add(pane);

        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

        close.setAlignmentX(0.5f);
        add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("Game Over");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 250);
    }
    public static void main(String args[])
    {
    	GameOverDialog gd1 = new GameOverDialog(1000);
    	gd1.setVisible(true);
    }
}