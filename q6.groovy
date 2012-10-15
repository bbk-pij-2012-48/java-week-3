print "Enter search string: ";
String target = System.console().readLine();
print "Enter text to search: "
String source = System.console().readLine();

boolean match;
int count = 0;

for (int a=0 ; a<source.length()-target.length()+1 ; a++){
    match = true;
    for (int b=0 ; b<target.length() ; b++){
        if(target.charAt(b)!=source.charAt(a+b)){
              match = false;
              break;
        }
    }
    if(match)
             count++;
}

println "The search string occurs " + count + " times";
