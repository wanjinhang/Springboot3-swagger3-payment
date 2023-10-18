package com.wansui.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wansui.payment.pojo.PaymentInfo;
import com.wansui.payment.service.PaymentInfoService;
import com.wansui.payment.mapper.PaymentInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_payment_info】的数据库操作Service实现
* @createDate 2023-10-18 15:03:36
*/
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo>
    implements PaymentInfoService {

}




