package com.wansui.payment.service;

/**
 * 支付宝服务
 *
 * @author wansui
 * @date 2023/11/06
 */

public interface AlipayService {
    String tradeCreate(Long productId);
}
