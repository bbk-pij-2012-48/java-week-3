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
Point d = new Point();
Point e = new Point();

println "Entering rectangle 1 vertices: ";
print "Enter x coord of upper left vertex: ";
a.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of upper left vertex: ";
a.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of lower right vertex: ";
b.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of lower right vertex: ";
b.y = Double.parseDouble(System.console().readLine());

println "Entering rectangle 2 vertices: ";
print "Enter x coord of upper left vertex: ";
c.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of upper left vertex: ";
c.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of lower right vertex: ";
d.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of lower right vertex: ";
d.y = Double.parseDouble(System.console().readLine());

print "Enter x coord of check point: ";
e.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of check point: ";
e.y = Double.parseDouble(System.console().readLine());

Rectangle testingA = new Rectangle();
Rectangle testingB = new Rectangle();
testingA.upLeft = a;
testingA.downRight = b;
testingB.upLeft = c;
testingB.downRight = d;

if(testingA.inside(e) && testingB.inside(e))
	println "The point is inside both rectangles";
else if(testingA.inside(e))
	println "The point is inside rectangle 1 only";
else if(testingB.inside(e))
	println "The point is inside rectangle 2 only";
else
	println "The point is in neither rectangle";
