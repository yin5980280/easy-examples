package com.vartime.easy.examples.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.org.easysite.spring.boot.tk.mybatis.core.mapper.CommonMapper;
import com.vartime.easy.examples.entity.GameUserSendMessageRecord;

/**
 * 用户短信发送记录(GameUserSendMessageRecord)表数据库访问层
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:05:39
 */
@Mapper
public interface GameUserSendMessageRecordMapper extends CommonMapper<GameUserSendMessageRecord> {

}