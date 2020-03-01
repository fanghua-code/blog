package com.ktz.blog;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    private Logger LOGGER = LoggerFactory.getLogger(BlogApplicationTests.class);

    @Test
    void contextLoads() {

        LOGGER.info("你好");
    }

}