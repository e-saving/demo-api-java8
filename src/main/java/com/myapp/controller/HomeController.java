package com.myapp.controller;

import com.myapp.service.car.DefaultCarService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {

    private static org.slf4j.Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @Value("${test.password}")
    private String testPwd;

    @RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }

    @RequestMapping("/test")
    public void test() {
        LOG.info("TestPWD=>"+testPwd);

//        return testPwd;
    }

}
