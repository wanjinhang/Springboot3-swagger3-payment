package com.wansui.payment.controller;

import com.wansui.payment.pojo.Product;
import com.wansui.payment.service.ProductService;
import com.wansui.payment.vo.R;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wansui
 * @version 1.0
 * @since 2023/10/17 21:54
 */

@RestController
@Tag(name = "testController")
public class TestController {
    @Autowired
    private ProductService  productService;
    @GetMapping("test")
    public R test(){
        return R.ok().data("test", "test");
    }

    @GetMapping("list")
    public R test2(){
        List<Product> list = productService.list();

        return R.ok().data("list", list);

    }
}
