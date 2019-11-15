package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.pojo.Indent;
import cn.bdqn.erpsystem.pojo.IndentExample;

import java.util.List;

public interface IndentService {
    //查询显示全部
    List<Indent> selectByExample();
    /*新增数据*/
    int insert(Indent record);
    /*修改前查询*/
    Indent selectByPrimaryKey(Integer id);
    /*修改*/
    int updateByPrimaryKey(Indent record);
    /*删除*/
    int deleteByPrimaryKey(Integer id);

}
