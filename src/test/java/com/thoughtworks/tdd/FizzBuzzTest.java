package com.thoughtworks.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        // given
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldSayGivenNumber() throws Exception {
        // when
        String word = fizzBuzz.say(2);

        // then
        assertThat(word, is("2"));
    }

    @Test
    public void shouldSayAnotherGivenNumber() throws Exception {
        // when
        String word = fizzBuzz.say(37);

        // then
        assertThat(word, is("37"));
    }

    @Test
    public void shouldSayFizzGiven3() throws Exception {
        // when
        String word = fizzBuzz.say(3);

        // then
        assertThat(word, is("fizz"));
    }

    @Test
    public void shouldSayFizzGivenMultipleOf3() throws Exception {
        // when
        String word = fizzBuzz.say(99);

        // then
        assertThat(word, is("fizz"));
    }

    @Test
    public void shouldSayBuzzGiven5() throws Exception {
        // when
        String word = fizzBuzz.say(5);

        // then
        assertThat(word, is("buzz"));
    }
}
