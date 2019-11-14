package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.PurApply;
import cn.bdqn.erpsystem.pojo.PurApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurApplyMapper {
    int countByExample(PurApplyExample example);

    int deleteByExample(PurApplyExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(PurApply record);

    int insertSelective(PurApply record);

    List<PurApply> selectByExample(PurApplyExample example);

    PurApply selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") PurApply record, @Param("example") PurApplyExample example);

    int updateByExample(@Param("record") PurApply record, @Param("example") PurApplyExample example);

    int updateByPrimaryKeySelective(PurApply record);

    int updateByPrimaryKey(PurApply record);
}