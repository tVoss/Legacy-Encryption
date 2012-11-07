package PCencryption;
public class Coder {
	
	public static int[] encode(int[] message, int[] key){
		
		int[] encoded = new int[message.length];
		
		for(int i=0;i<message.length;i++){
			encoded[i]=message[i]+(key[i%key.length]);
		
			while (encoded[i]>126){
				encoded[i]-=95;
			}
		}
		return encoded;
	}
	
	
	public static int[] decode(int[] message, int[] key){
		int[] decoded = new int[message.length];
		
		for(int i=0;i<message.length;i++){
			decoded[i]=message[i]-(key[i%key.length]);
		while (decoded[i]<32){
			decoded[i]+=95;
			}
		}
		return decoded;
	}
}
