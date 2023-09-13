package aggrEx;

public class Circle {
	
	Operation op;//aggregation
	double pi = 3.14;
	
	public double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
	
}
