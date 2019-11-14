package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.PurProvider;
import cn.bdqn.erpsystem.pojo.PurProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurProviderMapper {
    int countByExample(PurProviderExample example);

    int deleteByExample(PurProviderExample example);

    int deleteByPrimaryKey(Integer proId);

    int insert(PurProvider record);

    int insertSelective(PurProvider record);

    List<PurProvider> selectByExample(PurProviderExample example);

    PurProvider selectByPrimaryKey(Integer proId);

    int updateByExampleSelective(@Param("record") PurProvider record, @Param("example") PurProviderExample example);

    int updateByExample(@Param("record") PurProvider record, @Param("example") PurProviderExample example);

    int updateByPrimaryKeySelective(PurProvider record);

    int updateByPrimaryKey(PurProvider record);
}