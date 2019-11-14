package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.PurPerson;
import cn.bdqn.erpsystem.pojo.PurPersonExample;

import java.util.List;

public interface PersonService {
    /*插叙采购人员*/
    List<PurPerson> selectByExample(PurPersonExample example);
}
