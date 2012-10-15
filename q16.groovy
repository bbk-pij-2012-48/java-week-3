println "Welcome to My Mail Server!";
boolean accepted = false;
String sender;

while(!accepted){
	sender = System.console().readLine();
	
	if(sender.substring(0,11)=="MAIL FROM: "){ // i.e. format correct
		if(sender.charAt(11)!='@' && sender.charAt(sender.length()-1)!='@'){ 
			if(sender.indexOf("@")==sender.lastIndexOf("@") && sender.indexOf("@")!=-1){
				println "OK";
				accepted = true;
			}
			
		}
		else{
			println "Invalid email address";
		}
	}
	else{
		println "Invalid command";
	}
}
	
