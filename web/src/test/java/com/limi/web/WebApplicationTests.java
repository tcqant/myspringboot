package com.limi.web;

import com.limi.web.service.ConfigService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

    @Autowired
    private ConfigService configService;

    @Test
    public void contextLoads() {
        Assert.assertEquals(configService.getName(), "Limi");
        Assert.assertEquals(configService.getTile(), "Learning Spring Boot");
    }

}
