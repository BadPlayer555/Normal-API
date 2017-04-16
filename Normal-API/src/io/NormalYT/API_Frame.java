package io.NormalYT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

public class API_Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					API_Frame window = new API_Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public API_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Normal-API");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("C://Users//douglas2//Desktop//Resources//minecraft_icon_by_dharmainitiative2010-d33ca5p.png");
		frame.setIconImage(img.getImage());
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.NORTH);

		JComponent panel1 = makeTextPanel("In DEV");
		tabbedPane.addTab("Flood attack", null, panel1,
		                  "lol");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

		JComponent panel2 = makeTextPanel("In DEV");
		tabbedPane.addTab("Tab 2", null, panel2,
		                  "Does twice as much nothing");
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		JComponent panel3 = makeTextPanel("In DEV");
		tabbedPane.addTab("Tab 3", null, panel3,
		                  "Still does nothing");
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		JComponent panel4 = InfoPanel(//code here 
		        "<html><span style='font-size:20px'>Normal-API</span><span>   In DEV   </html>");
		//panel4.setPreferredSize(new Dimension(410, 50));
		tabbedPane.addTab("Info", null, panel4,
		                      "Info");
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton button = new JButton("Self Destruct");
		panel.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Object[] options = {"Yup",
                "Nope"};
                int n = JOptionPane.showOptionDialog(frame,
                "Are you sure?",
                "confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
                
                switch(n){
                case 0: JOptionPane.showMessageDialog(frame,
                	    "I think your fucked now.",
                	    "Inane error",
                	    JOptionPane.ERROR_MESSAGE);
                //case 1: JOptionPane.showMessageDialog(frame,
                //	    "You are smart man!");
                }
			}
		});
		
		
	}
	
	

	private JComponent makeTextPanel(String text) {
		JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
	}
	
	private JComponent InfoPanel(String text) {
		JPanel panel = new JPanel(false);
        panel.setLayout(new GridLayout(1, 1));
        JLabel filler = new JLabel(text);
        panel.add(filler);
        filler.setHorizontalAlignment(JLabel.CENTER);
        return panel;
		
	}
		
	

}
