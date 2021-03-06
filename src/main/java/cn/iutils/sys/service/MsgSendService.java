package cn.iutils.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.iutils.common.service.CrudService;
import cn.iutils.sys.dao.MsgSendDao;
import cn.iutils.sys.entity.MsgSend;

/**
* 消息发送表 Service层
* @author iutils.cn
* @version 1.0
*/
@Service
@Transactional(readOnly = true)
public class MsgSendService extends CrudService<MsgSendDao, MsgSend> {

}
