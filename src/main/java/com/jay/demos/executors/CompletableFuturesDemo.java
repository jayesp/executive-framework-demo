package com.jay.demos.executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> 20);
        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first
            .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
            .thenAccept(result -> System.out.println(result));

        System.out.println("show() ended");
    }
}
