package com.jay.demos.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        try {
            var temperature = future.exceptionally(ex -> 1).get();
            System.out.println(temperature);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("show() ended");
    }
}
