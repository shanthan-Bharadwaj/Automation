
public class ConstMethod {
	public double a,b,x,y,z,r;
	
	public ConstMethod (double a,double b) {
		this.a=a;
		this.b=b;
	}
	public ConstMethod (double x,double y,double z) {
		this.x=x;
		this.y=y;
	}
	public ConstMethod (double r) {
		this.r=r;
	}
	
	public double rectangleperimeter() {
		System.out.println("perimeter of a rectangle");
		double l=2*(a+b);
		return l;
		
		
	}
	public double triangleperimeter() {
		System.out.println("perimeter of a triangle");
		double t=(x+y+z);
		return t;
		
		
	}
	
	public double circleperimeter() {
		System.out.println("perimeter of a circle");
		double c=2*3.14*r;
		return c;
		
		
	}
	

}
