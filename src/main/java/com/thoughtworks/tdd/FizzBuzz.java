package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int number) {
        if(number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
}
