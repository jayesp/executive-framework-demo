package com.jay.demos.concurrency;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus();

        var threads = new ArrayList<Thread>();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        System.out.println(status.getTotalBytes());
    }
}
