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

        if(sb.toString().isEmpty()) {
            return String.valueOf(number);
        } else {
            return sb.toString();
        }
    }

    private boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
