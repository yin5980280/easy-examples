package com.vartime.easy.examples.entity;

import java.util.Date;
import cn.org.easysite.spring.boot.tk.mybatis.core.entity.BaseLogicEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户短信发送记录(GameUserSendMessageRecord)表实体类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:05:39
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "game_user_send_message_record")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameUserSendMessageRecord extends BaseLogicEntity {
    /** 
     * 手机号
     **/
    @Column(name = "phone")
    private String phone;
    /** 
     * 验证码
     **/
    @Column(name = "code")
    private String code;
    /** 
     * 备注
     **/
    @Column(name = "remark")
    private String remark;
}