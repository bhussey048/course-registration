package com.dal_csci3130.course_registration;

/**
 * Created by AJ on 2018-03-10.
 * This test will recognize, deny, and throw errors for the registration view.
 */

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class addingTest {

    //Creates activity to be used
    private Main2Activity m2a = new Main2Activity();

    /**
     * Tests if course is already completed
     *
     * @throws Exception
     */
    //Test if the system recognizes there's been past credit.
    @Test
    public void testCompleted() throws Exception {

        assertTrue(m2a.notCompleted("CSCI3190"));

    }

    /**
     * Tests if proper access was thrown.
     *
     * @throws Exception
     */
    //Test if the system properly denies registering for the class.
    @Test
    public void testAccess() throws Exception {
        assertTrue(m2a.denyAccess("CSCI3190"));

    }

    /**
     * Tests if proper error was thrown.
     *
     * @throws Exception
     */
    //Test if the system properly throws the correct arguments if the user selects an already completed class
    @Test
    public void testError() throws Exception {

        assertTrue(m2a.throwError("CSCI3190"));

    }
}
