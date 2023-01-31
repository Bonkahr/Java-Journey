package com.bonkahr;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double area = width * height;
        double areaForBucket = area / areaPerBucket;
        double numberOfBuckets = areaForBucket - extraBucket;
        double a = Math.ceil(numberOfBuckets);
        return (int) (a);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double areaForBucket = area / areaPerBucket;
        double a = Math.ceil(areaForBucket);
        return (int) (a);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double buckets = area / areaPerBucket;
        double bucket = Math.ceil(buckets);
        return (int) bucket;
    }


    public static void main(String[] args) {
        int b = getBucketCount(0.75, 0.75,0.5,0);
        System.out.println(b);
    }
}
