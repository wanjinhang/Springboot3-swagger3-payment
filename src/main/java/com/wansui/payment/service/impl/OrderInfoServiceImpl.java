package com.wansui.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wansui.payment.pojo.OrderInfo;
import com.wansui.payment.service.OrderInfoService;
import com.wansui.payment.mapper.OrderInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_order_info】的数据库操作Service实现
* @createDate 2023-10-18 15:03:36
*/
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo>
    implements OrderInfoService {

}




