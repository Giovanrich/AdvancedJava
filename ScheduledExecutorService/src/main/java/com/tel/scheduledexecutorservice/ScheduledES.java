package com.tel.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Created on Dec 8, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public class ScheduledES {

    public static void main(String[] args) {

        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                taskAfter24Hrs();
            }
        }, 0, 1, TimeUnit.SECONDS);

        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                taskAfter1min();
            }
        }, 0, 4, TimeUnit.SECONDS);
    }

    private static void taskAfter24Hrs() {
        System.out.println("after long task");
    }

    private static void taskAfter1min() {
        System.out.println("after short task");
    }
}
