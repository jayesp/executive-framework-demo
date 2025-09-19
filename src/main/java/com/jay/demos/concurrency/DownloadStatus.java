package com.jay.demos.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalBytes = new AtomicInteger();
    private AtomicInteger totalFiles = new AtomicInteger();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    public int getTotalFiles() {
        return totalFiles.get();
    }

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
    }

    public void incrementTotalFiles() {
        totalFiles.incrementAndGet();
    }
}
