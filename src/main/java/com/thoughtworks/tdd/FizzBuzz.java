package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int number) {
        if(isMultiple(number, 3)) {
            return "fizz";
        }
        if(isMultiple(number, 5)) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
