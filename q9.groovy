print "Enter your text for palindrome creation: ";
String str = System.console().readLine();

print str;
for(int a=str.length()-1 ; a>=0 ; a--){
	print str.charAt(a);
}
