class Point{
	double x;
	double y;
	
	double distanceFrom(Point b){
		return Math.sqrt(Math.pow(this.x-b.x,2)+Math.pow(this.y-b.y,2));
	}
}

class Rectangle{
	Point upLeft;
	Point downRight;
	
	double perimeter(){
		return 2*Math.abs(upLeft.x-downRight.x) + 2*Math.abs(upLeft.y-downRight.y);
	}
	
	double area(){
		return Math.abs(upLeft.x-downRight.x) * Math.abs(upLeft.y-downRight.y);
	}
	
	boolean inside(Point a){
		if(a.x>=upLeft.x && a.x<=downRight.x && a.y<=upLeft.y && a.y>=downRight.y)
			return true;
		else
			return false;
	}
			
}

Point a = new Point();
Point b = new Point();
Point c = new Point();

print "Enter x coord of upper left vertex: ";
a.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of upper left vertex: ";
a.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of lower right vertex: ";
b.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of lower right vertex: ";
b.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of check point: ";
c.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of check point: ";
c.y = Double.parseDouble(System.console().readLine());

Rectangle testing = new Rectangle();
testing.upLeft = a;
testing.downRight = b;

if(testing.inside(c))
	println "The point is inside the rectangle";
else
	println "The point is not inside the rectangle";
