package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.ErpUser;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    //查询全部
    List<ErpUser> findAllErpUser();
    //验证用户名
    ErpUser login(String name,String password);
}
