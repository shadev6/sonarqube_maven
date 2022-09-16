package com.sddevops.sonarqube_maven.eclipse;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author keyongenesis - Republic Polytechnic
 *
 */

public class AdditionTest {

    private Addition main = new Addition();

    @BeforeEach
    public void setUp() throws ArithmeticException {
        main = new Addition();
    }

    @Test
    public void testAddition(){
        assertEquals(16, main.addition(9,7));
    }
}
