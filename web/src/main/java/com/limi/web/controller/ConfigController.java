package com.limi.web.controller;

import com.limi.web.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 * @Author Limi Pan
 * @Date 2018-10-25 10:35
 * @Version v1.0
 */
@Controller
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @GetMapping("/all")
    @ResponseBody
    public String all(){
        return "{\"name\":"+configService.getName()+"," +
                "\"title\":"+configService.getTile()+"," +
                "\"desc\":"+configService.getDesc()+"}";
    }
}
