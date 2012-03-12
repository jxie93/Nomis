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

class AboutDialog extends JDialog {

    public AboutDialog() {

        initUI();
    }

    public final void initUI() {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));
        
        JTextPane pane = new JTextPane();

        pane.setContentType("text/html");
        String text = "<p><b>Nomis v1.0</b></p>" +
        	"<p></p>" +
            "<p><b>Project Manager</b>: Chen Zhang</p>" + 
        	"<p><b>Interface Design</b>: Jason Xie</p>" + 
            "<p><b>Graphic Controls</b>: QiLiang Chen</p>" +
            "<p><b>Audio Design</b>: Victor Ng</p>" +
            "<p><b>Support</b>: Luis Liu, Adam Nabi</p>" ;
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

        setTitle("Credits");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 400);
    }
}