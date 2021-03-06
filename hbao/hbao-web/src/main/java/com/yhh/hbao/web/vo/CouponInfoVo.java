package com.yhh.hbao.web.vo;

import com.yhh.hbao.web.model.BaseDataReqVo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

import static com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL;

/**
 * <p>
 * 卡券信息
 * </p>
 * @author yhh
 * @since 2018-05-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonSerialize(include=NON_NULL)
public class CouponInfoVo extends BaseDataReqVo implements Serializable{

            /**
    * 自增ID
    */
    private Long id;
    /**
    * 活动Id
    */
    private Long campaignId;
    /**
    * 券码
    */
    private String couponCode;
    /**
    * 失效时间
    */
    private Date invalidTime;
    /**
    * 获取时间
    */
    private Date getTime;
    /**
    * 来源:1:自主生成 2:第三方生成
    */
    private Integer source;
    /**
    * 卡券状态 0:未激活 1:已激活 2:已失效 3:已使用 4:已过期
    */
    private Integer status;
    /**
    * 是否已核销 0:否 1:是
    */
    private Integer isVerification;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;


}
