package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.PurSection;
import cn.bdqn.erpsystem.pojo.PurSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurSectionMapper {
    int countByExample(PurSectionExample example);

    int deleteByExample(PurSectionExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(PurSection record);

    int insertSelective(PurSection record);

    List<PurSection> selectByExample(PurSectionExample example);

    PurSection selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") PurSection record, @Param("example") PurSectionExample example);

    int updateByExample(@Param("record") PurSection record, @Param("example") PurSectionExample example);

    int updateByPrimaryKeySelective(PurSection record);

    int updateByPrimaryKey(PurSection record);
}