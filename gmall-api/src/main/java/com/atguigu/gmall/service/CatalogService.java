package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    /* 获取一级目录 */
    List<PmsBaseCatalog1> getCatalog1();

    /* 通过选择的一级目录ID获取二级目录 */
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    /* 通过选择的二级目录ID获取三级目录 */
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}

