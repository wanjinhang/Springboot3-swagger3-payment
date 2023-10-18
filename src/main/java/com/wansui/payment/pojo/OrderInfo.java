package com.wansui.payment.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName t_order_info
 */
@TableName(value ="t_order_info")
@Data
public class OrderInfo implements Serializable {
    @TableId
    private Long id;

    private String title;

    private String orderNo;

    private Long userId;

    private Long productId;

    private Integer totalFee;

    private String codeUrl;

    private String orderStatus;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}