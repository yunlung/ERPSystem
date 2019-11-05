package cn.bdqn.erpsystem.dao;

import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.pojo.ErpUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ErpUserMapper {
    int countByExample(ErpUserExample example);

    int deleteByExample(ErpUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(ErpUser record);

    int insertSelective(ErpUser record);

    List<ErpUser> selectByExample(ErpUserExample example);

    ErpUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") ErpUser record, @Param("example") ErpUserExample example);

    int updateByExample(@Param("record") ErpUser record, @Param("example") ErpUserExample example);

    int updateByPrimaryKeySelective(ErpUser record);

    int updateByPrimaryKey(ErpUser record);
}