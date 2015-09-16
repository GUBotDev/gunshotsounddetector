/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;

/**
 *
 * @author gizmo
 */
public class HelloXbee {

    public boolean sendMessage(String DATA_TO_SEND){

        /* Constants */
    // TODO Replace with the port where your sender module is connected to.
    final String PORT = "COM1";
    // TODO Replace with the baud rate of your sender module.
    final int BAUD_RATE = 9600;
     
    //String DATA_TO_SEND = "Hello XBee World!";
     
 
        XBeeDevice myDevice = new XBeeDevice(PORT, BAUD_RATE);
        byte[] dataToSend = DATA_TO_SEND.getBytes();
         
        try {
            myDevice.open();
             
            System.out.format("Sending broadcast data: '%s'", new String(dataToSend));
             
            myDevice.sendBroadcastData(dataToSend);
             
            System.out.println(" >> Success");
            return true;
             
        } catch (XBeeException e) {
            System.out.println(" >> Error");
            e.printStackTrace();
            System.exit(1);
            return false;
        } finally {
            myDevice.close();
        }
            
          
    }
}
