package net.emv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public SomeBean someProblematicBean() {
        throw new RuntimeException("here is a problem");
    }
}
