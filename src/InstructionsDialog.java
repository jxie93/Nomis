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

class InstructionsDialog extends JDialog {

    public InstructionsDialog() {

        initUI();
    }

    public final void initUI() {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));
        
        JTextPane pane = new JTextPane();

        pane.setContentType("text/html");
        String text = "<p><b>Instructions v1.0</b></p>" +
        	"<p></p>" +
            "<p>Press 'Start Game' to begin a new game session. Once the game has started, Nomis will display a sequence of button flashes. " +
            "Once the sequence is complete, you must reproduce it by clicking the corresponding buttons.</p>" +
            "<p>If you produce the matching sequence, you will proceed to the next level where one more flash is added to the sequence.</p>" +
            "<p>If you produce the incorrect sequence, the game will end.";
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

        setTitle("Instructions");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 400);
    }
}