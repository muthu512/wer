package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootTest(exclude = { DataSourceAutoConfiguration.class }) // Exclude DataSource configuration
class Online1ApplicationTests {

    @Test
    void contextLoads() {
        // This test will now run without trying to configure a data source
    }

}
