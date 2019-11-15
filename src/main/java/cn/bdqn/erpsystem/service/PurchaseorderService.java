package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.PurPurchaseorder;
import cn.bdqn.erpsystem.pojo.PurPurchaseorderExample;

import java.util.List;

public interface PurchaseorderService {

    /*查询数据*/
    List<PurPurchaseorder> selectByExample(PurPurchaseorderExample example);

    /*新增数据*/
    int insert(PurPurchaseorder record);

    /*按添加显示*/
    PurPurchaseorder selectByPrimaryKey(Integer pId);

    /*修改*/
    int updateByPrimaryKey(PurPurchaseorder record);

    /*删除*/
    int deleteByPrimaryKey(Integer pId);



}
