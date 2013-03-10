package com.thoughtworks.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldSayGivenNumber() throws Exception {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String word = fizzBuzz.say(2);

        // then
        assertThat(word, is("2"));
    }
}
