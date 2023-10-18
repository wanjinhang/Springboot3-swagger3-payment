package com.wansui.payment.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName t_product
 */
@TableName(value ="t_product")
@Data
public class Product implements Serializable {
    @TableId
    private Long id;

    private String title;

    private Integer price;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}