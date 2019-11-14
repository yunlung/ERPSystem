package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.PurPerson;
import cn.bdqn.erpsystem.pojo.PurPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurPersonMapper {
    int countByExample(PurPersonExample example);

    int deleteByExample(PurPersonExample example);

    int deleteByPrimaryKey(Integer personid);

    int insert(PurPerson record);

    int insertSelective(PurPerson record);

    List<PurPerson> selectByExample(PurPersonExample example);

    PurPerson selectByPrimaryKey(Integer personid);

    int updateByExampleSelective(@Param("record") PurPerson record, @Param("example") PurPersonExample example);

    int updateByExample(@Param("record") PurPerson record, @Param("example") PurPersonExample example);

    int updateByPrimaryKeySelective(PurPerson record);

    int updateByPrimaryKey(PurPerson record);
}