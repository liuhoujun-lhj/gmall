package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface UserMapper extends Mapper<UmsMember> {

    /**
      * 功能描述: 查询所有用户信息
      * 作    者: liuhoujun
      * 创建时间: 2019/11/1 14:41
      */
    List<UmsMember> selectAllUser();


}
