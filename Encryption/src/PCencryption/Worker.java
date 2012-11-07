package PCencryption;

public class Worker {
	public String startWorking(String message, String key, boolean eod){
		String s;
		//Setting the String Values
		Values.setPreCodedMessage(message);
		Values.setPreCodedKey(key);
		//Setting the Char Arrays
		Values.setPreCodedMessageCharArray(Convert.stringToCharArray(Values.getPreCodedMessage()));
		Values.setPreCodedKeyCharArray(Convert.stringToCharArray(Values.getPreCodedKey()));
		//Setting the Int Arrays
		Values.setPreCodedMessageIntArray(Convert.charArrayToIntArray(Values.getPreCodedMessageCharArray()));
		Values.setPreCodedKeyIntArray(Convert.charArrayToIntArray(Values.getPreCodedKeyCharArray()));
		if (eod){
			//Encoding Int Arrays
			Values.setCodedMessageIntArray(Coder.encode(Values.getPreCodedMessageIntArray(), Values.getPreCodedKeyIntArray()));
		}else{
			//Decoding Int Arrays
			Values.setCodedMessageIntArray(Coder.decode(Values.getPreCodedMessageIntArray(), Values.getPreCodedKeyIntArray()));
		}
		Values.setCodedMessageCharArray(Convert.intArrayToCharArray(Values.getCodedMessageIntArray()));
		Values.setCodedMessage(Convert.charArrayToString(Values.getCodedMessageCharArray()));
		s = Values.getCodedMessage();
		return s;
	}
}
