/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gubotdev.networking;

import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.ZigBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gizmo
 */
public class ZigBeeInfo {
    
    public void getLocalNodeInfo(ZigBeeDevice localZigBee) {
        try {
            localZigBee.readDeviceInfo();
        } catch (XBeeException ex) {
            Logger.getLogger(ZigBeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getRemoteNodeInfo(XBeeDevice remoteZigBee) {
        try {
            remoteZigBee.readDeviceInfo();
        } catch (XBeeException ex) {
            Logger.getLogger(ZigBeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
