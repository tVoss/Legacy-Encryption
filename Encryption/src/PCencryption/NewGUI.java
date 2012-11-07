package PCencryption;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class NewGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton encode;
	private JButton decode;
	private JTextField message;
	private JTextField key;
	private JTextField output;
	
	public NewGUI(){
		super("Tyler Voss' Encryption Program");
		setLayout(new FlowLayout());
		
		encode = new JButton("Encode");
		decode = new JButton("Decode");
		message = new JTextField("Message to be encoded / decoded");
		key = new JTextField("Key to be used");
		output = new JTextField("This is the output of the program");
		message.setSize(50, 100);
		
		add(message);
		add(key);
		add(encode);
		add(decode);
		add(output);
		
		
	}
}
