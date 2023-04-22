
public class methodMain {

	public static void main(String[] args) {
		ConstMethod CM = new ConstMethod(9.5, 8.5);
		ConstMethod CMt = new ConstMethod(5.8, 10, 9.5);
		ConstMethod Cr = new ConstMethod(7.5);
		
		double r = CM.rectangleperimeter();
		System.out.println(r);
		double t = CMt.triangleperimeter();
		System.out.println(t);
		double cl = Cr.circleperimeter();
		System.out.println(cl);
		
		

	}

}
