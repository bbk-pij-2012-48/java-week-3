class Point{
	double x;
	double y;
	
	double distanceFrom(Point b){
		return Math.sqrt(Math.pow(this.x-b.x,2)+Math.pow(this.y-b.y,2));
	}
}

Point a = new Point();
Point b = new Point();
Point c = new Point();

print "Enter x coord of point 1: ";
a.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of point 1: ";
a.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of point 2: ";
b.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of point 2: ";
b.y = Double.parseDouble(System.console().readLine());
print "Enter x coord of point 3: ";
c.x = Double.parseDouble(System.console().readLine());
print "Enter y coord of point 3: ";
c.y = Double.parseDouble(System.console().readLine());

if(a.distanceFrom(b)<=a.distanceFrom(c)&&a.distanceFrom(b)<=b.distanceFrom(c)){
	println "Points 1 and 2 are closest at distance " + a.distanceFrom(b);
}
else if(a.distanceFrom(c)<=b.distanceFrom(c)&&a.distanceFrom(c)<=a.distanceFrom(b)){
		println "Points 1 and 3 are closest at distance " + a.distanceFrom(c);
}
else if(b.distanceFrom(c)<=b.distanceFrom(a)&&b.distanceFrom(c)<=a.distanceFrom(c)){
		println "Points 2 and 3 are closest at distance " + b.distanceFrom(c);
}
