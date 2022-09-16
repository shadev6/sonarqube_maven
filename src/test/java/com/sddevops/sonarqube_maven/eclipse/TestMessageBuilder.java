package com.sddevops.sonarqube_maven.eclipse;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author keyongenesis - Republic Polytechnic
 *
 */

public class TestMessageBuilder {
	

    private MessageBuilder obj = new MessageBuilder();
	

    @BeforeEach
    public void setUp() throws Exception {
    	obj = new MessageBuilder();
	  }

	 @Test
	 public void testNameKeyon() {
        assertEquals("Hello keyon", obj.getMessage("keyon"));

    }
    /*
     After adding the new unit test have to run 'mvn clean' before 'mvn test'
     *
     * */

	 @Test
	 public void testNameEmpty() {
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

	 @Test
	 public void testNameNull() {
        assertEquals("Please provide a name!", obj.getMessage(null));

    }

}