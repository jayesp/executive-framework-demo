package com.jay.demos.concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        // TODO Auto-generated constructor stub
        this.status = status;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            status.incrementTotalBytes();
        }

        status.done();

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

}
