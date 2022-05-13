package com.lgf.demo.service.impl;

import com.lgf.demo.pojo.Message;
import com.lgf.demo.mapper.MessageMapper;
import com.lgf.demo.service.MessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息通知表  服务实现类
 * </p>
 *
 * @author lgf
 * @since 2021-09-28
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {
}


