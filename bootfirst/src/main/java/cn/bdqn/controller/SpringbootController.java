package cn.bdqn.controller;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SpringbootController {
    @RequestMapping("/w/{mass}")
    public String index(@PathVariable(value="mass")String mass) {
        return "Boot!"+6*8+mass;
    }
    @RequestMapping("/s")
    public String s(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("客户端ip地址"+request.getRemoteAddr());
        return "Boot!";
    }
}
