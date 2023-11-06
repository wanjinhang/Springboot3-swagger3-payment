package com.wansui.payment.controller;

import com.wansui.payment.service.AlipayService;
import com.wansui.payment.vo.R;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 支付宝控制器
 *
 * @author wansui
 * @date 2023/11/06
 */
@RestController
@CrossOrigin
@RequestMapping("/api/ali-pay")
@Tag(name="支付宝支付",description = "支付宝支付付款")
@Slf4j
public class AlipayController {
    @Resource
    private AlipayService alipayService;
    private Long productId;

    /**
     * 交易页面支付
     *
     * @param productId 产品ID
     * @return @return {@link R }
     * @author wansui
     * @date 2023/11/06
     */
    @PostMapping("/trade/page/pay/{productId}")
    public R tradePagePay(Long productId){

        log.info("统一下单并支付");
        String fromStr = alipayService.tradeCreate(productId);

        return R.ok().data("str",fromStr);
    }
}
