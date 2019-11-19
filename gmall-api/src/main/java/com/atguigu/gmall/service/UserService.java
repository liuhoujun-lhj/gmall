package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    /**
      * 功能描述: 获取所有用户信息
      * 作    者: liuhoujun
      * 创建时间: 2019/11/1 14:23
      */
    List<UmsMember> getAllUser();

    /**
      * 功能描述: 根据用户ID
      * 作    者: liuhoujun
      * 创建时间: 2019/11/4 11:02
      */
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
