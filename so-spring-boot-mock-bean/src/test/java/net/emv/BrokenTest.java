package net.emv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrokenTest {

    @Autowired
    private SomeBean someBean;

    @Test
    void test() {
        Assertions.assertEquals("Hello World!", someBean.getGreeting());
    }
}
