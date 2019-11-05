package cn.bdqn.erpsystem.service.user;


import cn.bdqn.erpsystem.pojo.ErpUser;

import java.util.List;

public interface UserService {
    /**
     * 查询全部user
     * @return
     */
    List<ErpUser> selectByUserList();
}
