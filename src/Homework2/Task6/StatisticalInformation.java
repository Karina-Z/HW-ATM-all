package Homework2.Task6;

import java.util.Arrays;

public class StatisticalInformation {

    static final int[] arr = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
    static final int size = arr.length;

    static double getMean() {
        double sum = 0.0;
        for (double a : arr)
            sum += a;
        return sum / size;
    }

    static double getVariance() {
        double mean = getMean();
        double temp = 0;
        for (double a : arr)
            temp += (a - mean) * (a - mean);
        return temp / (size - 1);
    }

    static double getStdDev() {
        return Math.sqrt(getVariance());
    }

    static double median() {
        Arrays.sort(arr);
        if (arr.length % 2 == 0)
            return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;
        return arr[arr.length / 2];
    }

    static int calculateMode() {

        int modeCount = 0;
        int mode = 0;
        int currCount = 0;

        for (int candidateMode : arr) {
            currCount = 0;
            for (int element : arr) {
                if (candidateMode == element) {
                    currCount++;
                }
            }

            if (currCount > modeCount) {
                modeCount = currCount;
                mode = candidateMode;
            }
        }

        return mode;
    }

    public static void main(String[] args) {

        System.out.println("Arithmetic mean " + getMean());
        System.out.println("Variance " + getVariance());
        System.out.println("Deviation " + getStdDev());
        System.out.println("Median " + median());
        System.out.println("Mode " + calculateMode());
    }
}