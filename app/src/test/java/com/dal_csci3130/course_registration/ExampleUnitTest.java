package com.dal_csci3130.course_registration;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private String[] faculty_list = {"CSCI", "PHIL", "CHEM", "BIOL", "MATH"};
    private int[] year_list = {1,2,3,4,6,8};
    private int[] openspots_list = {0,10,20,50,100};

    filtered_search search1 = new filtered_search();
    filtered_search search2 = new filtered_search();
    filtered_search search3 = new filtered_search();

    @Test
    public void unit_test1() throws Exception {
        assertEquals(4, 2 + 2);

    }
}