package com.eBanking;


import functionLibrarys.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends CommonFunctions{
    //CommonFunctions commonFunctions = new CommonFunctions();
    @Before
    public void beforeTest()
    {
        openHomepage();
    }

    @After
    public void afterTest()
    {
        closeHomepage();
    }
}
