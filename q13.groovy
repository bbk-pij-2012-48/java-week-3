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
}

Point a = new Point();
Point b = new Point();

print "Enter x coord of vertex 1: ";
a.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of vertex 1: ";
a.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of vertex 2: ";
b.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of vertex 2: ";
b.y = Double.parseDouble(System.console().readLine());

Rectangle testing = new Rectangle();
testing.upLeft = a;
testing.downRight = b;

println "Area = " + testing.area();
println "Perimeter = " + testing.perimeter();
