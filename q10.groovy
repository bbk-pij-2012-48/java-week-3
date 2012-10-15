print "Enter text to check for relaxed palindrome: ";
String str = System.console().readLine();

String strAllLetters = "";

for(int a=0 ; a<str.length() ; a++ ){			// Remove punctuation
	if(Character.isLetter(str.charAt(a)))
		strAllLetters += Character.toLowerCase(str.charAt(a));
}

boolean palindrome = true;

for(int a=0 ; a<(strAllLetters.length())/2 ; a++ ){  
	if(strAllLetters.charAt(a)!=strAllLetters.charAt(strAllLetters.length()-a-1)){
		palindrome = false;
		break;
	}
}

if(palindrome)
	println "The input is a relaxed palindrome";
else
	println "The input is not a relaxed palindrome";
