package oddNoInList;

public class oddNoInAList {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,9,11};
		System.out.println("List of no is"+a);
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]+"Odd no is");
			}
			else if(a[i]%2==0) {
				System.out.println( a[i]+"even no is");
			}
		
		}

	}

}
