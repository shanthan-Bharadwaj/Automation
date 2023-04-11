
public class BreakAndContinue {

//Break will be used in only loop or switch. 
//When condition is satisfied with break will be used to terminate the loop
//Continue will be used only in loops
//continue will be used to skip the iteration in a loop. ex:in a for loop you want to print 0-5 and 8-9 out of 10 no's then we will use continue option.
	
	public static void main(String[] args) {
		
//		BreakAndContinue b = new BreakAndContinue();
//		b.go();
		System.out.println("i values are");
		for(int i=0;i<10;i++) {
			
			if(i>=5 && i<=7)
				continue;
			
			System.out.println(i);
		}
		System.out.println("j values are");
		for (int j=0;j<10;j++) {
			if(j==5) 
				break;
			
			System.out.println(j);
		}
	}
}
