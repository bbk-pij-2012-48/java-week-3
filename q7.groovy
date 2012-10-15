print "Enter sentence: ";
String str = System.console().readLine();
char newTargetChar = 'a';
char[] oldTargetChar = new char[26];
int targetCount = 0, searchCount = 0;
boolean doubled = false;

print "Enter character to search for: ";
newTargetChar = System.console().readLine();
newTargetChar = Character.toLowerCase(newTargetChar);

while(!doubled){
	targetCount=0; 

	for(int a=0 ; a<str.length() ; a++){
		if(str.charAt(a)==newTargetChar || str.charAt(a)==Character.toUpperCase(newTargetChar))
			targetCount++;
	}

	println "There are " + targetCount + " '" + newTargetChar + "'s in the text";
	
	oldTargetChar[searchCount] = newTargetChar;
	
	print "Enter character to search for: ";
	newTargetChar = System.console().readLine();
	newTargetChar = Character.toLowerCase(newTargetChar)
	
	for(int a=0 ; a<=targetCount ; a++){
		if(newTargetChar==oldTargetChar[a]){
			doubled = true;
			break;
		}
	}

	searchCount++;
}

println "Same character entered twice, exiting program...";
