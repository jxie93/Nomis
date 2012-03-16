import java.awt.Dimension;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;


class ExitDialog extends JDialog {

    public ExitDialog() {

        initUI();
    }

    public final void initUI() {
    	
    	JPanel mainPanel = new JPanel();//Base panel definition
		mainPanel.setLayout(null);
		add(mainPanel);
		mainPanel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
		JLabel label = new JLabel();
		label.setText("Are you sure you want to exit?");

        //setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton yes = new JButton("Yes");
        JButton no = new JButton("No");

        
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });
        

        label.setBounds(55,20,200,50);
        mainPanel.add(label);
        yes.setBounds(20, 110, 100, 35);
        mainPanel.add(yes);
        no.setBounds(160,110,100,35);
        mainPanel.add(no);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("Exit");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
    }
}