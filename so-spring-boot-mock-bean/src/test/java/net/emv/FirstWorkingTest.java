package net.emv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class FirstWorkingTest {

    @MockBean
    private SomeBean someBean;

    @BeforeEach
    void beforeEach() {
        Mockito.when(someBean.getGreeting()).thenReturn("Hello World!");
    }

    @Test
    void test() {
        Assertions.assertEquals("Hello World!", someBean.getGreeting());
    }
}
