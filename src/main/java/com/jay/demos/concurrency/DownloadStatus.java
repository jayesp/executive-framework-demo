package com.jay.demos.concurrency;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }
    
    public void incrementTotalBytes() {
        totalBytes++;
    }
}
