package switchCase;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display dayname in a week
		int day=5;
		String dayname="";
		switch(day){
		case 1:dayname= "Monday";
		break;
		case 2:dayname= "Tuesday";
		break;
		case 3:dayname= "Wednesday";
		break;
		case 4:dayname= "Thursday";
		break;
		case 5:dayname= "Friday";
		break;
		case 6:dayname= "Saturday";
		break;
		case 7:dayname= "Sunday";
		break;
		default: System.out.println("day is not matching with any ");
		}
		System.out.println(dayname);
	}

}
