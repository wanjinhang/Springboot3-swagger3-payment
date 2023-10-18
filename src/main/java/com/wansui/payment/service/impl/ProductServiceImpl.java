package com.wansui.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wansui.payment.pojo.Product;
import com.wansui.payment.service.ProductService;
import com.wansui.payment.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【t_product】的数据库操作Service实现
* @createDate 2023-10-18 15:03:36
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




