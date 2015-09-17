/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gubotdev.networking;

import com.digi.xbee.api.ZigBeeDevice;


/**
 *
 * @author gizmo
 */
public class MainApp {
    
    ZigBeeConfig zBConfig = new ZigBeeConfig();
    ZigBeeInfo zBInfo = new ZigBeeInfo();
    
    public MainApp() {
        zBConfig.localZigBee();
        
        
    }
    
   
    
}
