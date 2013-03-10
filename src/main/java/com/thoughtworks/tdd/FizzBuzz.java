package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int number) {
        StringBuilder sb = new StringBuilder("");
        if(isMultiple(number, 3)) {
            sb.append("fizz");
        }
        if(isMultiple(number, 5)) {
            sb.append("buzz");
        }
        String specialWords = sb.toString();

        return specialWords.isEmpty() ? String.valueOf(number) : specialWords;
    }

    private boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
