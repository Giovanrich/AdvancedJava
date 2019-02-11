
package com.notification;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;

/**
 *@Created on Feb 8, 2019
 *@author chiraran (Giovanrich/JWizard)
 */
public class QCNotifier {

//    public static void main(String[] args) throws AWTException, MalformedURLException {
//        if (SystemTray.isSupported()) {
//            QCNotifier td = new QCNotifier();
//            td.displayTray();
//        } else {
//            System.err.println("System tray not supported!");
//        }
//    }

    public static void displayTray() throws AWTException, MalformedURLException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("QC System", "Stock Controller: some batches need your attention", MessageType.INFO);
    }
}