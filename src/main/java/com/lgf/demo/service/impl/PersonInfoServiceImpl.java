package com.lgf.demo.service.impl;

import com.lgf.demo.pojo.PersonInfo;
import com.lgf.demo.mapper.PersonInfoMapper;
import com.lgf.demo.service.PersonInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工基本信息表 服务实现类
 * </p>
 *
 * @author lgf
 * @since 2021-09-28
 */
@Service
public class PersonInfoServiceImpl extends ServiceImpl<PersonInfoMapper, PersonInfo> implements PersonInfoService {

}
