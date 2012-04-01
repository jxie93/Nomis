import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

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

class HighscoreDialog extends JDialog {

    public HighscoreDialog(ArrayList<Record> data) {


        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));
        
        JTextPane pane = new JTextPane();
        JTextPane r1 = new JTextPane();
        JTextPane r2 = new JTextPane();
        JTextPane r3 = new JTextPane();
        JTextPane r4 = new JTextPane();
        JTextPane r5 = new JTextPane();
        JTextPane r6 = new JTextPane();
        JTextPane r7 = new JTextPane();
        JTextPane r8 = new JTextPane();
        JTextPane r9 = new JTextPane();
        JTextPane r10 = new JTextPane();

        pane.setContentType("text/plain");
        r1.setContentType("text/plain");
        r2.setContentType("text/plain");
        r3.setContentType("text/plain");
        r4.setContentType("text/plain");
        r5.setContentType("text/plain");
        r6.setContentType("text/plain");
        r7.setContentType("text/plain");
        r8.setContentType("text/plain");
        r9.setContentType("text/plain");
        r10.setContentType("text/plain");
        
        String text = "Rank\tScore\tLevel";
        pane.setText(text);
        
        
        String[] dataIn = new String[data.size()];
        for(int n=0;n<data.size();n++)
        {
        	dataIn[n]=(Integer.toString(data.get(n).getrank())+"\t"+Integer.toString(data.get(n).getmarks())+"\t"+Integer.toString(data.get(n).getlevels()));
        }
        r1.setText(dataIn[0]);
        r2.setText(dataIn[1]);
        r3.setText(dataIn[2]);
        r4.setText(dataIn[3]);
        r5.setText(dataIn[4]);
        r6.setText(dataIn[5]);
        r7.setText(dataIn[6]);
        r8.setText(dataIn[7]);
        r9.setText(dataIn[8]);
        r10.setText(dataIn[9]);
        
        pane.setEditable(false);
        add(pane);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        add(r6);
        add(r7);
        add(r8);
        add(r9);
        add(r10);

        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

        close.setAlignmentX(0.5f);
        add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("Highscore Table");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(215, 400);
    }
    
/*    public static void main (String args[])
    {
    	Record d = new Record(1,1000,50);
    	Record e = new Record(1,500,50);
    	Record f = new Record(1,800,50);
    	Record g = new Record(1,100,50);
    	ArrayList<Record> a = new ArrayList<Record>();
    	a.add(d);
    	a.add(e);
    	a.add(f);
    	a.add(g);
    	a.add(g);
    	a.add(f);
    	a.add(g);
    	a.add(g);
    	a.add(d);
    	a.add(e);
    	HighscoreDialog hsd = new HighscoreDialog(a);
    	hsd.setVisible(true);
    }*/
}