package Homework2.Task1;

public class Prime {
    public static void main(String args[]) {
        int s1 = 0;
        int s2 = 50000;
        int i;
        int j;
        int flag = 0;

        System.out.println("The prime numbers in between the entered limits are :");

        for (i = s1; i <= s2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}