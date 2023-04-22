import java.awt.geom.Arc2D.Float;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=12345678;
			float f= 12.34567888888888999f;
			long l = 1234567898766655l;
			double d= 1.222222222233333334455555666667;
			boolean b=false;
			char c = 'c';
			String s = "This is a string";
			
			String s1 = "Hello";
			String s2= "Shanthan";
			String s3= "Bharadwaj";
			String s4= s1+s2+s3;
			
			System.out.println(s4);
			System.out.println(s1+s2+s3);
			System.out.println(s1+" "+s2+" "+s3);
			
			int n1 = 5;
			int n2 = 10;
			
			System.out.println(n1+n2);
			System.out.println(n1+n2+"After");
			System.out.println("before"+n1+n2+"After");
			System.out.println("before"+(n1+n2)+"After");
			
			System.out.println((123==123)&&(123<124));
			System.out.println((123==123)&&(124<=124));
			System.out.println((125<=123)&&(124<=124));
			System.out.println((125<=120)||(124<=124));
			System.out.println((125<=120)||(124>200));
	}

}
