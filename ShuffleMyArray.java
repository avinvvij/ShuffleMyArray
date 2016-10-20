package ShuffleMyArray;

import java.util.Random;

public class ShuffleMyArray {

	public static void shuffleArray(Object myarray[]){
		Random r = new Random();
		for(int i = myarray.length - 1 ; i>=0 ; i--){
			int randomnum = r.nextInt(myarray.length);
			Object temp = myarray[i];
			myarray[i] = myarray[randomnum];
			myarray[randomnum] = temp;
		}
	}
	
}
