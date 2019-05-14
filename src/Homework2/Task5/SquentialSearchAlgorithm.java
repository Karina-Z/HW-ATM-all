package Homework2.Task5;

public class SquentialSearchAlgorithm {

    public static void main(String[] args) {

        int[] arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int target = 315;

        System.out.println("The range of numbers:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        int pos = seqsearch(arr, target, arr.length);
        if (pos != -1) System.out.println("The value " + target + " is found at the position of " + pos);
        else System.out.println("Number is out of the range");
    }

    static int seqsearch(int[] dataset, int target, int n) {
        int found = 0;
        int pos = -1;
        for (int i = 0; i < n && found != 1; i++)
            if (target == dataset[i]) {
                pos = i;
                found = 1;
            }
        return pos;
    }
}