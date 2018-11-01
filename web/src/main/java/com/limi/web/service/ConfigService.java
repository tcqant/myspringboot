package com.limi.web.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * @Description: TODO
 * @Author Limi Pan
 * @Date 2018-10-25 10:10
 * @Version v1.0
 */
@Service("configService")
public class ConfigService {

    @Value("${name}")
    private String name;
    @Value("${title}")
    private String tile;
    @Value("${desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public String getTile() {
        return tile;
    }


    public String getDesc() {
        return desc;
    }

}
