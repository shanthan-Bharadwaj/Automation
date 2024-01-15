package Strings;

public class StrinfBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append method()
		StringBuffer s1 = new StringBuffer("Shanthan");
		s1.append(" Bharadwaj");
		System.out.println(s1);
		
		// insert method will return the string value. whose string value will be inserted in the given offset
		StringBuffer s = new StringBuffer("Shanthan");
		s.insert(3, "Boin");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("shan");
		sb.insert(4, "than");
		System.out.println(sb);
		
		//Replace method 
		StringBuffer s2 = new StringBuffer("shanthan");
		s2.replace(2, 4, "sush");
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("shanthan");
		s3.replace(4, 10, "sush");
		System.out.println(s3);
		
		//delete method
		StringBuffer sb1 = new StringBuffer("Shanthan");
		sb1.delete(4,8);
		System.out.println(sb1);
		
		
		

	}

}
