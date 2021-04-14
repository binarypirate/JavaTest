package com.company.sections.section8_method_overloading;

/*
 In ElectricWorld:
   1 Wire is Positive (+)
   1 Wire is Negative (-)

 To turn on an Electric Appliance/Machine:
      we have to provide both Positive & Negative Current
      if both are positive, or both are negative, things will not work
      if voltage is low it will not work too.

 you are required to complete those functions, keeping in mind that redundant code is not allowed.
*/

public class FunTask2 {
    public static final int NORMAL_ELECTRICITY_VOLTAGE = 220;
    public static final String BULB = "Bulb"; // Takes 25-100 Voltage
    public static final String LED = "LED LIGHT"; // Takes 220-240 Voltage, Requires Supply
    public static final String FAN = "Fan"; // Takes 150-220 Voltage
    public static final String REFRIGERATOR = "Refrigerator"; // Takes 220-240 Voltage, Requires Supply

    static void enableAppliance(String gadget, byte positiveCurrent, byte negativeCurrent, short voltage, boolean electricSupply) {
        // todo: you have to check if current provided is valid, (positive, negative)
        // todo: you have to check if electric supply is provided, add 20 to voltage

        // todo: Power on The appliance if everything is correct, you have to check the voltage too.
        // todo: if voltage is lower then required, don't turn on the gadget.
        // todo: if voltage is higer than required, print 'Appliance_Name Burned!'
        // todo: if voltage is between the required voltage, print 'Appliance_name Powered On'
    }

    static void enableAppliance(String gadget, byte positiveCurrent, byte negativeCurrent, short voltage) {
        // todo: you have to check if current provided is valid, (positive, negative)
        // todo: you have to check if electric supply is provided, add 20 to voltage

        // todo: Power on The appliance if everything is correct, you have to check the voltage too.
        // todo: if voltage is lower then required, don't turn on the gadget.
        // todo: if voltage is higer than required, print 'Appliance_Name Burned!'
        // todo: if voltage is between the required voltage, print 'Appliance_name Powered On'
    }

    public static void main(String[] args) {
        enableAppliance(REFRIGERATOR, (byte) 1, (byte) -1, (short) 210, true);
        enableAppliance(LED, (byte) 2, (byte) 2, (short) 220, false);
    }
}
