print "Enter two numbers: ";
double number1 = Double.parseDouble(System.console().readLine());
double number2 = Double.parseDouble(System.console().readLine());

println "What would you like to do with your numbers?";
println "1. Add \n2. Subtract \n3. Multiply \n4. Divide\n";
int choice = Integer.parseInt(System.console().readLine());

switch(choice){
	case 1: print number1 + " + " + number2 + " = ";
		println number1 + number2;
		break;
	case 2: print number1 + " - " + number2 + " = ";
		println number1 - number2;
		break;
	case 3: print number1 + " * " + number2 + " = ";
		println number1 * number2;
		break;
	case 4: print number1 + " / " + number2 + " = ";
		println number1 / number2;
		break;	
	default:
		println "Error - invalid choice";
		break;
}
