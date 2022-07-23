package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import com.cydeo.test.utilities.VyTrack_Utilities;
import org.testng.annotations.Test;

public class VyTrack {
    //1.Verify that Only truck driver  can access to vehicle odometer page
    //(Note: Non authorized users : Store manager, Sales manager )
    //2. Verify that truck driver should be able to see all vehicle odometer informations
    //on the grid.
    //3.Verify that Truck driver should be able to create Vehicle odometer or cancel it.
    //4.Verify that truck driver should be able to delete or edit Vehicle odometer.
    //5.Verify that truck driver should be able to reset grid by click on grid setting
@Test
    public void vtrackLogingPage(){
    Driver.getDriver().get("Vytrac_Login_Page");
    VyTrack_Utilities.VyTrack_Login(Driver.getDriver(),"user185","UserUser123");
}



}
