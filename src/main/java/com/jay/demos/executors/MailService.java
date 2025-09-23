package com.jay.demos.executors;

public class MailService {
    public static void send() {
        LongTask.simulate();
        System.out.println("Mail was sent.");
    }
}
