package com.springboot_mybatis.wx_uax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class droneController {

    @RequestMapping(value="/drone",method = RequestMethod.GET)
    public String droneController(){

        return "drone!";

    }
}
