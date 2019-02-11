package com.notification;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Created on Feb 8, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class Domino {

    public static void main(String[] args) {
        LookUpBatchImp l = new LookUpBatchImp();
        System.out.println("Running");
        Timer t = new Timer();
        t.schedule(new TimerTask() {

            @Override
            public void run() {
                List<LookUpBatch> list = l.getBatches();
                if (!list.isEmpty()) {
                    if (SystemTray.isSupported()) {
                        try {
                            QCNotifier.displayTray();
                        } catch (AWTException ex) {
                            Logger.getLogger(Domino.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(Domino.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        System.err.println("System tray not supported!");
                    }
                }
            }
        }, 0, 5000);
    }

}
