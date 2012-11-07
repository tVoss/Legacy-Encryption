package PCencryption;

public class Convert {
	
	public static char[] stringToCharArray(String s){ 
		char[] a = s.toCharArray();
		return a;
	}
	
	public static int[] charArrayToIntArray(char[] a){
		int[] n = new int[a.length];
			for (int i=0;i<a.length;i++){
				n[i] = (int)(a[i]);
			}
		return n;
	}
	
	public static char[] intArrayToCharArray(int[] n){
		char[] a = new char[n.length];		
			for (int i=0;i<a.length;i++){
				a[i] = (char)(n[i]);
			}
		return a;
	}
	
	public static String charArrayToString(char[] c){
		String s = new String(c);
		return s;

	}
}
