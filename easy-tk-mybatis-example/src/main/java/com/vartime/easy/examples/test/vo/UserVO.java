package com.vartime.easy.examples.test.vo;

import java.util.Date;
import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import cn.org.easysite.commons.base.BaseObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体View类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:00:00
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("")
public class UserVO extends BaseObject {
        @ApiModelProperty("")
    private Long id;
        @ApiModelProperty("")
    private String operating;
        @ApiModelProperty("")
    private Date serverCreateTime;
        @ApiModelProperty("")
    private Date serverUpdateTime;
        @ApiModelProperty("")
    private Long userAge;
        @ApiModelProperty("")
    private String userName;
        @ApiModelProperty("")
    private Integer usable;
}