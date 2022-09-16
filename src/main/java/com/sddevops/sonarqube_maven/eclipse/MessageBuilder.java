package com.sddevops.sonarqube_maven.eclipse;

/**
 * @author keyongenesis - Republic Polytechnic
 *
 */

public class MessageBuilder {
	
	 public MessageBuilder(){
//	        System.out.println("");
	       
	  }

	public String getMessage(String name) {
        StringBuilder result = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            result.append("Please provide a name!");
        } else {
        	result.append("Hello " + name);
        }
        return result.toString();
    }
}