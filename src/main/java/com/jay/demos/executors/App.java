package com.jay.demos.executors;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("start");
        var service = new MailService();
        service.send();
        System.out.println("Hello World");
    }
}
