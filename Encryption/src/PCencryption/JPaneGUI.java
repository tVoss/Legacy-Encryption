package PCencryption;
import javax.swing.JOptionPane;
public class JPaneGUI {

	/**
	 * @param args
	 */
	static Worker pc1 = new Worker();
	public static void main(String[] args) {
		TextTransfer copy = new TextTransfer();
		boolean eod = true;
		String EoD = "null";
		String EoDC = "Null";
		
		
		String input = JOptionPane.showInputDialog("Would you like to encode or decode?");
		if (input.equals("encode")){
			eod = true;
			EoD = "encoded";
			EoDC = "Encoded";
		}else if(input.equals("decode")){
			eod = false;
			EoD = "decoded";
			EoDC = "Decoded";
		}else{
			JOptionPane.showMessageDialog(null, "Incorrect input! Please type either encode or decode.", "Error!", JOptionPane.ERROR_MESSAGE );
			System.exit(0);
		}
		String message = JOptionPane.showInputDialog("Enter message to be " + EoD + ":");
		String key = JOptionPane.showInputDialog("Enter key to be used:");
		
		String print = pc1.startWorking(message, key, eod);
		if (input.equals("encode")){
			copy.setClipboardContents(print);
			JOptionPane.showMessageDialog(null, EoDC + " message is: " + print , EoDC +"! (Copied to clipboard)", JOptionPane.INFORMATION_MESSAGE );		
		}else{
			JOptionPane.showMessageDialog(null, EoDC + " message is: " + print , EoDC +"!", JOptionPane.INFORMATION_MESSAGE );
		}
	}

}
