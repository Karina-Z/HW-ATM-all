package Homework2.Task3;

public class ChineseZodiac {

    public static void main(String[] args) {

        String[] values = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};
        String[] colors = {"Blue", "Red", "Yellow", "White", "Black"};

        int year = 2019;
        String value = values[year % 12];
        String color = colors[(int) Math.floor((year - 4) % 10 / 2)];

        System.out.println(year + " is the " + color + " " + value + " year");
    }
}