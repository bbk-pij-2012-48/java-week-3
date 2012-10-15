print "Input number: ";
String str = System.console().readLine();

int carry = 0;
int temp = 0;
char char0 = '0';

for(int a=0 ; a<str.length() ; a++){
	if(Character.isDigit(str.charAt(a))){
		temp = str.charAt(a) - 48;
		print ((temp/2)+carry);
		if(temp%2==0)
			carry = 0;
		else
			carry = 5;
	} else
		print str.charAt(a);
}
if(carry==5)
	print carry;
				
