package com.vartime.easy.examples.service.impl;

import com.vartime.easy.examples.entity.GameUserSendMessageRecord;
import com.vartime.easy.examples.service.GameUserSendMessageRecordService;
import org.springframework.stereotype.Service;

import cn.org.easysite.spring.boot.tk.mybatis.core.service.impl.AbstractBaseLogicServiceImpl;

/**
 * 用户短信发送记录(GameUserSendMessageRecord)表服务实现类
 *
 * @author 熊猫大侠
 * @since 2019-05-05 18:05:39
 */
@Service("gameUserSendMessageRecordService")
public class GameUserSendMessageRecordServiceImpl extends AbstractBaseLogicServiceImpl<GameUserSendMessageRecord> implements GameUserSendMessageRecordService {

}
