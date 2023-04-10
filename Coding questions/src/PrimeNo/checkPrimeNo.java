package PrimeNo;

public class checkPrimeNo {
	
	public static void primeno(int n) {
		
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"is a not prime no");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+"is a not prime no");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(n+ " is a prime no");
			}
		}
		
		
	}

	public static void main(String[] args) {
		primeno(3);
		primeno(5);
		primeno(7);
		primeno(15);

	}

}
