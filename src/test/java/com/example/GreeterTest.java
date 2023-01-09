package com.example;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GreeterTest {

        private Greeter greeter;

    @BeforeClass
    public void setup() {
        greeter = new Greeter();
    }
        @Test
        public void greetShouldIncludeTheOneBeingGreeted() {
            String someone = "World";

            Assert.assertEquals(greeter.greet(someone), someone);
        }

        @Test
        public void greetShouldIncludeGreetingPhrase() {
            String someone = "World";

            Assert.assertTrue(greeter.greet(someone).contains(someone), "Yes it contains the String !!!");
        }
    }
