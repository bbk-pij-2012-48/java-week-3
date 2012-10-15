print "Enter sentence: ";
String str = System.console().readLine();
char newTargetChar = 'a', oldTargetChar = '\u0000'; //null char
int targetCount = 0;

print "Enter character to search for: ";
newTargetChar = System.console().readLine();
newTargetChar = Character.toLowerCase(newTargetChar);

while(oldTargetChar!=newTargetChar){
	targetCount=0; 

	for(int a=0 ; a<str.length() ; a++){
		if(str.charAt(a)==newTargetChar || str.charAt(a)==Character.toUpperCase(newTargetChar))
			targetCount++;
	}

	println "There are " + targetCount + " '" + newTargetChar + "'s in the text";
	
	oldTargetChar = newTargetChar;
	print "Enter character to search for: ";
	newTargetChar = System.console().readLine();
	newTargetChar = Character.toLowerCase(newTargetChar);
}

println "Same character entered twice in a row, exiting program...";
