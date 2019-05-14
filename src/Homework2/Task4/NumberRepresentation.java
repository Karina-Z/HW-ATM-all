package Homework2.Task4;

public class NumberRepresentation {

    static final String unitsArray[] = {"", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    static final String tensArray[] = {"", "ten", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};


    static String convert(final int i) {

        if (i < 20) {
            return unitsArray[i];
        }

        if (i < 100) {
            return tensArray[i / 10] + ((i % 10 != 0) ? " " : "") + unitsArray[i % 10];
        }

        if (i < 1000) {
            return unitsArray[i / 100] + " Hundred" + ((i % 100 != 0) ? " " : "") + convert(i % 100);
        }
        if (i <= 10000) {
            return convert(i / 1000) + " Thousand " + convert(i % 1000);
        }
        return "Number is out of the range";
    }

    public static void main(final String[] args) {

        for (int i = 10 ; i <= 150 ; i++) {
            System.out.println(convert(i));
        }

        for (int i = 9980; i <= 10000 ; i++) {
            System.out.println(convert(i));
        }
    }
}