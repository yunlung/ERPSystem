package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.PurPersonMapper;
import cn.bdqn.erpsystem.pojo.PurPerson;
import cn.bdqn.erpsystem.pojo.PurPersonExample;
import cn.bdqn.erpsystem.pojo.PurPurchaseorder;
import cn.bdqn.erpsystem.pojo.PurPurchaseorderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    PurPersonMapper personMapper;

    @Override
    public List<PurPerson> selectByExample(PurPersonExample example) {
        PurPersonExample pur=new PurPersonExample();
        List<PurPerson> perList=personMapper.selectByExample(pur);
        return perList;
    }
}
