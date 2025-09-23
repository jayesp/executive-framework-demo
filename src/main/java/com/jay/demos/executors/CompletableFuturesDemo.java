package com.jay.demos.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> "email");

        future
            .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist" ))
            .thenAccept(playlist -> System.out.println(playlist));

        System.out.println("show() ended");
    }
}
