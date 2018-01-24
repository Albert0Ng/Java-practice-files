import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class bubble {

	public static void main(String[] args) {
		
		ArrayList aL = new ArrayList<Integer>();
		int[] iA = {1,7,3,45,24,76,445,234,6,34,64,74,78,24};
		
		aL = arrayListInit(aL,iA);
		
		for(int e = 0; e<iA.length-1; e++){
			for(int a = 0; a<iA.length-1; a++){
				int pointer = iA[a];
				int pointer2 = iA[a+1];
				if(pointer>pointer2){
					iA[a]=pointer2;
					iA[a+1]=pointer;
				}
			}
		}
		for(int in: iA){
			System.out.println(in);
		}
	}
	private static ArrayList arrayListInit(ArrayList<Integer> aList, int[] iArray){
		for(int e=0; e<iArray.length; e++){
			aList.add(iArray[e]);
			System.out.println(aList.get(e));
		}
		return aList;
	}
}
