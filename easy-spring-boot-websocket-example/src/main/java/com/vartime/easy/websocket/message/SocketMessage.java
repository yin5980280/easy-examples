package com.vartime.easy.websocket.message;

import cn.org.easysite.commons.base.BaseObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-03-20 20:40
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : com.vartime.easy.websocket.message.SocketMessage
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocketMessage extends BaseObject {

    private String message;

    private String date;
}
