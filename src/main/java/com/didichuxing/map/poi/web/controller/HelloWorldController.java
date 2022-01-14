package com.didichuxing.map.poi.web.controller;
import com.didichuxing.map.poi.web.datas.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @RequestMapping("/hello")
    public Object helloWorld() {
        return ResultUtil.success("hello, world") ;
    }

}
