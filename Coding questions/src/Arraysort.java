import java.util.ArrayList;

public class Arraysort {

	public static void main(String[] args) {
		int[] arr1 = {9,0,0,5,0,4,6,0};
	ArrayList<Integer> zero = new ArrayList<Integer>();
	ArrayList<Integer> nonzero = new ArrayList<Integer>();
	for(int i:arr1) {
		if(i==0) {
			zero.add(i);
		}else {
			nonzero.add(i);
		}
	}
	nonzero.addAll(zero);
	System.out.println(nonzero);
	}
		
}
