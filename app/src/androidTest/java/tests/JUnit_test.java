package tests;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import group47.testproject.MainActivity;

/**
 * Created by Chris Miranda on 4/15/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_Sum() {
    mainActivity = getActivity();
        int a = 1;
        int b = 35;
        assertEquals(a+b, mainActivity.sum(a,b));
        assertEquals(a-b, mainActivity.sum(a, -b));
        assertEquals(0, mainActivity.sum(0,0));

    }
}
