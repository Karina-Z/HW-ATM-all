package Homework2.Task7;

public class BubbleSort {

    public static void main(String[] args) {

        int i;
        int j;
        int temp;
        int[] arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int num = arr.length;

        System.out.println("Integers to sort: ");

        for (i = 0; i < num; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
    }
}