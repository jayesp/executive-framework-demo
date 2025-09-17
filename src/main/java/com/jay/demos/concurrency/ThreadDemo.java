package com.jay.demos.concurrency;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        var threads = new ArrayList<Thread>();
        var tasks = new ArrayList<DownloadFileTask>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
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
        
        var totalBytes = tasks.stream()
            .map(t->t.getStatus().getTotalBytes())
            .reduce(Integer::sum);

        System.out.println(totalBytes);
    }
}
