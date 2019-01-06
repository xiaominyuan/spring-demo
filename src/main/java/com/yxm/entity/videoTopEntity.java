package com.yxm.entity;

public class videoTopEntity {
    private String fileName;
    private long fileSize;
    private long fileRestSize;
    private int tag=0;
    private int percent=0;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getFileRestSize() {
        return fileRestSize;
    }

    public void setFileRestSize(long fileRestSize) {
        this.fileRestSize = fileRestSize;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
