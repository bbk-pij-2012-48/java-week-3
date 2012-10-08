// Given a total cost and a total payment, program outputs correct change

print "Enter amount due, followed by amount paid: ";
double due = Double.parseDouble(System.console().readLine());
double paid = Double.parseDouble(System.console().readLine());
double change = paid - due;

int counter = 0;
printf "Change due is %1.2f made up of: \n", change;

while(change>=50){
	counter++;
	change-=50;
}
println counter + " x 50 ";
counter = 0;

while(change>=20){
	counter++;
	change-=20;
}
println counter + " x 20 ";
counter = 0;

while(change>=10){
	counter++;
	change-=10;
}
println counter + " x 10 ";
counter = 0;

while(change>=5){
	counter++;
	change-=5;
}
println counter + " x 5 ";
counter = 0;

while(change>=2){
	counter++;
	change-=2;
}
println counter + " x 2 ";
counter = 0;

while(change>=1){
	counter++;
	change-=1;
}
println counter + " x 1 ";
counter = 0;

while(change>=0.5){
	counter++;
	change-=0.5;
}
println counter + " x 50p ";
counter = 0;

while(change>=0.2){
	counter++;
	change-=0.2;
}
println counter + " x 20p ";
counter = 0;

while(change>=0.1){
	counter++;
	change-=0.1;
}
println counter + " x 10p ";
counter = 0;

while(change>=0.05){
	counter++;
	change-=0.05;
}
println counter + " x 5p ";
counter = 0;

while(change>=0.02){
	counter++;
	change-=0.02;
}
println counter + " x 2p ";
counter = 0;

while(change>=0.01){
	counter++;
	change-=0.01;
}
println counter + " x 1p ";
counter = 0;

