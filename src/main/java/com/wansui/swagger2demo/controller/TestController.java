package com.wansui.swagger2demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wansui
 * @version 1.0
 * @since 2023/10/17 21:54
 */

@RestController
@Tag(name = "testController")
public class TestController {
    @GetMapping("test")
    public String test(){
        return "test";
    }
}
