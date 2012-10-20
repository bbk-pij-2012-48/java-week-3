println "Welcome to My Mail Server!";
boolean accepted = false, finished = false;
String sender, recipient, command, message = "", messageTemp;

// Input sender
while(!accepted){
	sender = System.console().readLine();
	if(sender=="QUIT"){
		println "Bye!";
		return;
	}
	
	if(sender.length()>=11){
	// ensures next condition does not use invalid index value
	
		if(sender.substring(0,11)=="MAIL FROM: "){ 
		// format correct
		
			if(sender.charAt(11)!='@' && sender.charAt(sender.length()-1)!='@'){ 
			// no @ first or last
			
				if(sender.indexOf("@")==sender.lastIndexOf("@") && sender.indexOf("@")!=-1){ 
				// exactly one @				
					println "OK";
					accepted = true;
				}
				else
					println "Invalid email address";			
			}
			else
				println "Invalid email address";
		}
		else
			println "Invalid command 1";
	}
	else 
		println "Invalid command 2";
}

// Input recipient
accepted = false;

while(!accepted){
	recipient = System.console().readLine();
	if(recipient=="QUIT"){
		println "Bye!";
		return;
	}
	
	if(recipient.length()>=9){
	// ensures next condition does not use invalid index value
	
		if(recipient.substring(0,9)=="RCPT TO: "){ 
		// format correct
		
			if(recipient.charAt(9)!='@' && recipient.charAt(recipient.length()-1)!='@'){ 
			// no @ first or last
			
				if(recipient.indexOf("@")==recipient.lastIndexOf("@") && recipient.indexOf("@")!=-1){ 
				// exactly one @				
					println "OK";
					accepted = true;
				}
				else
					println "Invalid email address";			
			}
			else
				println "Invalid email address";
		}
		else
			println "Invalid command";
	}
	else 
		println "Invalid command";
}

accepted = false;

while(!accepted){
	command = System.console().readLine();
	if(command=="QUIT"){
		println "Bye!";
		return;
	}
	
	if(command=="DATA"){
		accepted = true;
		
		while(!finished){
			
			messageTemp = System.console().readLine();
			
			if(messageTemp=="."){
				finished = true;
				message = message.substring(0,message.length()-1);
			}
			else
				message += messageTemp + "\n";
		}
	}
}

println "Sending email...";
println "From: " + sender.substring(11,sender.length());
println "To: " + recipient.substring(9,recipient.length());
println message;
println "...done!"

accepted = false;
while(!accepted){
	command = System.console().readLine();
	
	if(command=="QUIT"){
		println "Bye!";
		return;
	}
	else
		println "Invalid command"
}
		


		


