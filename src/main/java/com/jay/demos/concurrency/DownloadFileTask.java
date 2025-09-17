package com.jay.demos.concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;


    public DownloadFileTask() {
        // TODO Auto-generated constructor stub
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
