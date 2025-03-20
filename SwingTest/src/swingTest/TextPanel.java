package swingTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	public TextPanel() {
		textArea = new JTextArea();
		
		setLayout (new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER); //scrolle added
	}

	
	public void appendText(String text) {
		
		textArea.append(text);
	}
	
	

}
