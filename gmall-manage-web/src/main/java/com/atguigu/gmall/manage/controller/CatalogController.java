package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
/* 此注解在后台解决跨域不信任问题 */
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    /* 通过选择的二级目录ID获取三级目录 */
    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCata3 (String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }

    /* 通过选择的一级目录ID获取二级目录 */
    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCata2 (String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    /* 获取一级目录 */
    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> getCatalog1 = catalogService.getCatalog1();
        return getCatalog1;
    }

}
