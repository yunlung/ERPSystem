package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.ErpUserMapper;
import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.pojo.ErpUserExample;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private ErpUserMapper erpUserMapper;
    @Override
    public List<ErpUser> findAllErpUser() {
        ErpUserExample ue=new ErpUserExample();
        return erpUserMapper.selectByExample(ue);
    }
}
