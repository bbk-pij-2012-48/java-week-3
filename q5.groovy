print "Enter sentence: ";
String str = System.console().readLine();

int eCount=0; 

for(int a=0 ; a<str.length() ; a++){
        if(str.charAt(a)=='e')
                              eCount++;
}

println "There are " + eCount + " 'e's in the text";
