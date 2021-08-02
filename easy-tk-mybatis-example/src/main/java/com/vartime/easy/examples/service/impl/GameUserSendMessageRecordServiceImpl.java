package com.vartime.easy.examples.service.impl;

import com.vartime.easy.examples.entity.GameUserSendMessageRecord;
import com.vartime.easy.examples.service.GameUserSendMessageRecordService;

import org.springframework.stereotype.Service;

import cn.org.easysite.spring.boot.tk.mybatis.core.repository.impl.AbstractBaseLogicRepositoryImpl;

/**
 * 用户短信发送记录(GameUserSendMessageRecord)表服务实现类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:05:39
 */
@Service("gameUserSendMessageRecordService")
public class GameUserSendMessageRecordServiceImpl extends AbstractBaseLogicRepositoryImpl<GameUserSendMessageRecord> implements GameUserSendMessageRecordService {

}
