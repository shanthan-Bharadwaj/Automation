
public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As Math.random will return the double values,and we want to return the int values
		// type cast should be used----> convert one type of data type to anther data type
		// for any math.random()if you multiply with any no result less than that no will display ex: math.random() * 100 will display values less than 100(till 99)
		
		int num1= (int)(Math.random()*100);//type casting the Math.random to int from duble
		double num = Math.random()*100; //with out type castin
		System.out.println(num);
		System.out.println(num1);

	}

}
