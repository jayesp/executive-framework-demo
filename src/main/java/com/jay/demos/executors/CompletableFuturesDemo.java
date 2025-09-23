package com.jay.demos.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        var all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            try {
                var firstResult = first.get();
                System.out.println(firstResult);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("All tasks completed successfully");
        });

        System.out.println("show() ended");
    }
}
