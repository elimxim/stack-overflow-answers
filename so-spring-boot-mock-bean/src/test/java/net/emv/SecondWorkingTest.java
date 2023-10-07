package net.emv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootTest
public class SecondWorkingTest {

    @TestConfiguration
    public static class Configuration {

        @Bean
        @Primary // it's not necessary
        public SomeBean someProblematicBean() {
            return new SomeBean();
        }
    }

    @Autowired
    private SomeBean someBean;

    @Test
    void test() {
        Assertions.assertEquals("Hello World!", someBean.getGreeting());
    }
}
