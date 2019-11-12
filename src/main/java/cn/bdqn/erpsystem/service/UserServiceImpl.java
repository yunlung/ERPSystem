package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.ErpUserMapper;
import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.pojo.ErpUserExample;
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
        List<ErpUser> erpAll=erpUserMapper.selectByExample(ue);
        for (ErpUser erpUst:erpAll) {
            erpUst.setuType(formatType(erpUst.getuType()));
        }
        return erpAll;
    }


    @Override
    public ErpUser login(String name, String password) {
        ErpUserExample ue=new ErpUserExample();
        ErpUserExample.Criteria criteria= ue.createCriteria();
        criteria.andUNameEqualTo(name);
        List<ErpUser> list=erpUserMapper.selectByExample(ue);
        ErpUser eprUser=null;
        for (ErpUser erp:list) {
            if(erp.getuPassword().equals(password)){
                eprUser=erp;
            }
        }
        return eprUser;
    }

    @Override
    public boolean addErpUser(ErpUser erpUser) {
        if (erpUserMapper.insertSelective(erpUser)>0){
            return true;
        }
        return false;
    }



    @Override
    public boolean updateErpUser(ErpUser erpUser) {
        if (erpUserMapper.updateByPrimaryKeySelective(erpUser)>0){
            return true;
        }
        return false;
    }

    @Override
    public ErpUser findUserById(String uId) {
        ErpUserExample ue=new ErpUserExample();
        ErpUserExample.Criteria criteria= ue.createCriteria();
        criteria.andUIdEqualTo(Integer.valueOf(uId));
        return erpUserMapper.selectByExample(ue).get(0);
    }
    @Override
    public boolean deleteErpUserById(Integer uId) {
        if (erpUserMapper.deleteByPrimaryKey(uId)>0){
            return true;
        }
        return false;
    }
    public String formatType(String type){
        String returnType="";
        switch (type){
            case "1":
                returnType= "系统管理员";
                break;
            case "2":
                returnType= "部门主管";
                break;
            case "3":
                returnType= "部门文员";
                break;
        }
            return returnType;
    }

}
