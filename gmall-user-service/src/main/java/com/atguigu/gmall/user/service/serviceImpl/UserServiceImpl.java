package com.atguigu.gmall.user.service.serviceImpl;



import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    /**
      * 功能描述: 获取所有用户信息
      * 作    者: liuhoujun
      * 创建时间: 2019/11/1 14:25
      */
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembersList = userMapper.selectAllUser();
        return umsMembersList;
    }

    /**
      * 功能描述: 通过用户Id查询用户收获地址
      * 作    者: liuhoujun
      * 创建时间: 2019/11/4 11:15
      */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();//创建实体类对象
        umsMemberReceiveAddress.setMemberId(memberId);//将用户Id的参数传入
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);//查询出实体类信息

        return umsMemberReceiveAddresses;
    }
}
