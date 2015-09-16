/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gubotdev.networking;

import com.digi.xbee.api.RemoteXBeeDevice;
import com.digi.xbee.api.ZigBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import com.digi.xbee.api.models.XBee64BitAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gizmo
 */
public class ZigBeeConfig {
    
    ZigBeeDevice localZigBee = new ZigBeeDevice("COM1", 9600); 
    RemoteXBeeDevice remoteZigBee = new RemoteXBeeDevice(localZigBee,
                                   new XBee64BitAddress("000000409D5EXXXX"));

    
    private ZigBeeDevice getZigBee() {
        return localZigBee;
    }
    
    private RemoteXBeeDevice getRemoteZigBee() {
        return remoteZigBee;
    }
    
    private void readDeviceInformation() {
        try {
            remoteZigBee.readDeviceInfo();
        } catch (XBeeException ex) {
            Logger.getLogger(ZigBeeConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
