/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gubotdev.networking;

import com.digi.xbee.api.RemoteXBeeDevice;
import com.digi.xbee.api.ZigBeeDevice;
import com.digi.xbee.api.models.XBee64BitAddress;

/**
 *
 * @author gizmo
 */
public class ZigBeeConfig {
    
    ZigBeeDevice localZigBee = new ZigBeeDevice("COM1", 9600); 
    RemoteXBeeDevice remoteZigBee = new RemoteXBeeDevice(localZigBee,
                                   new XBee64BitAddress("000000409D5EXXXX"));
    
    public ZigBeeConfig() {
        
    }

    
    ZigBeeDevice getLocalZigBee() {
        return localZigBee;
    }
    
    public RemoteXBeeDevice getRemoteZigBee() {
        return remoteZigBee;
    }

 
    
}
