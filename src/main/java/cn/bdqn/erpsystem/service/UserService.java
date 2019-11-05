package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.ErpUser;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    List<ErpUser> findAllErpUser();
}
