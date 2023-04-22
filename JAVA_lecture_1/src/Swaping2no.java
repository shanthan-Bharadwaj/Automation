
public class Swaping2no {

	public static void main(String[] args) {
	int n1=10,n2=20;
	
	System.out.println("no before swap"+n1);
	System.out.println("no before swap"+n2);
	
	n1 = n1+n2;
	n2 = n1-n2;
	n1 = n1-n2;
	
	System.out.println("no after swap"+n1);
	System.out.println("no after swap"+n2);
	

	}

}
