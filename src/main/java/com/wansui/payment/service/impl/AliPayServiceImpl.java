package com.wansui.payment.service.impl;

import com.wansui.payment.service.AlipayService;
import com.wansui.payment.service.OrderInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 阿里支付服务实施
 *
 * @author wansui
 * @date 2023/11/06
 * @see AlipayService
 */
@Service
public class AliPayServiceImpl implements AlipayService {

    @Resource
    private OrderInfoService orderInfoService;
    @Override
    public String tradeCreate(Long productId) {

        orderInfoService.createOrderByProductId(productId);
        return null;
    }
}
