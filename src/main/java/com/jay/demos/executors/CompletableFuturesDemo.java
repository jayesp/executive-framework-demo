package com.jay.demos.executors;

public class CompletableFuturesDemo {

    public static void show() {
        var service = new FlightService();
        service.getQuote("site1")
            .thenAccept(System.out::println);

        service.getQuote("site2")
            .thenAccept(System.out::println);

        service.getQuote("site3")
            .thenAccept(System.out::println);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("show() ended");
    }
}
