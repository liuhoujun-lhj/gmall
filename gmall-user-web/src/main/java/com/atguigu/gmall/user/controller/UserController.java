package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    /**
      * 功能描述: 通过用户ID查询用户收货地址
      * 作    者: liuhoujun
      * 创建时间: 2019/11/4 10:55
      */
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> receiveAddressByMemberId = userService.getReceiveAddressByMemberId(memberId);
        return receiveAddressByMemberId;
    }

    @RequestMapping("getUser")
    @ResponseBody
    /**
     * 功能描述: 查询所有用户信息
     * 作    者: liuhoujun
     * 创建时间: 2019/11/1 17:14
     */
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "登录成功";
    }


}
