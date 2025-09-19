package com.jay.demos.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadDemo {
    public static void show() {
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<Integer>());
        Thread thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });
        Thread thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}
