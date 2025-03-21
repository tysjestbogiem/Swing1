package swingTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	//private JTextArea textArea;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	// constructor
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
	
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}

		});

			
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		
		setSize(600, 600); //size of window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to allow to close
		setVisible(true);
	}
}
