package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.PurPurchaseorder;
import cn.bdqn.erpsystem.pojo.PurPurchaseorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurPurchaseorderMapper {
    int countByExample(PurPurchaseorderExample example);

    int deleteByExample(PurPurchaseorderExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(PurPurchaseorder record);

    int insertSelective(PurPurchaseorder record);

    List<PurPurchaseorder> selectByExample(PurPurchaseorderExample example);

    PurPurchaseorder selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") PurPurchaseorder record, @Param("example") PurPurchaseorderExample example);

    int updateByExample(@Param("record") PurPurchaseorder record, @Param("example") PurPurchaseorderExample example);

    int updateByPrimaryKeySelective(PurPurchaseorder record);

    int updateByPrimaryKey(PurPurchaseorder record);

    /*金额排序*/
    List<PurPurchaseorder> selectByMoney();

    /*日期排序*/
    List<PurPurchaseorder> selectByDate();
}