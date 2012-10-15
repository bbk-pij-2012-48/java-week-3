print "Enter sentence: ";
String str = System.console().readLine();

print "Enter character to search for: ";
char targetChar = System.console().readLine();
targetChar = Character.toLowerCase(targetChar);

int targetCount=0; 

for(int a=0 ; a<str.length() ; a++){
        if(str.charAt(a)==targetChar || str.charAt(a)==Character.toUpperCase(targetChar))
        targetCount++;
}

println "There are " + targetCount + " '" + targetChar + "'s in the text";
