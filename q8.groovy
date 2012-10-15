print "Enter your text for palindrome test: ";
String str = System.console().readLine();
boolean palindrome = true;

for(int a=0 ; a<(str.length())/2 ; a++ ){  // NB the length condition stops the program before
					   // the middle item in the case of an odd-length input string
	if(str.charAt(a)!=str.charAt(str.length()-a-1)){
		palindrome = false;
		break;
	}
}

if(palindrome)
	println "The input is a strict palindrome";
else
	println "The input is not a strict palindrome";
					   	   

