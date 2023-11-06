package com.wansui.payment;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * 支付宝测试
 *
 * @author wansui
 * @date 2023/11/06
 */
@SpringBootTest
@Slf4j
public class AlipayTests {

    @Resource
    private Environment config;

    @Test
    public void test() {
        log.info("支付宝配置信息：{}", config.getProperty("alipay.app-id"));
    }
}
