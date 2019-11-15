package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.PurPurchaseorderMapper;
import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.pojo.ErpUserExample;
import cn.bdqn.erpsystem.pojo.PurPurchaseorder;
import cn.bdqn.erpsystem.pojo.PurPurchaseorderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("purchaseorderService")
public class PurchaseorderServiceImpl implements PurchaseorderService {

    @Resource
    PurPurchaseorderMapper purOrderMapper;

    @Override
    public List<PurPurchaseorder> selectByExample(PurPurchaseorderExample example) {
        PurPurchaseorderExample ue=new PurPurchaseorderExample();
        List<PurPurchaseorder> purList=purOrderMapper.selectByExample(ue);

        return purList;
    }

    @Override
    public int insert(PurPurchaseorder record) {
        PurPurchaseorderExample ue=new PurPurchaseorderExample();
        List<PurPurchaseorder> list=selectByExample(ue);
        int poID =(list.get(list.size()-1).getpId())+1;
        Date now = new Date();//获取当前时间
        SimpleDateFormat sim = new SimpleDateFormat("yyMMddhhmm");
        String datenow = sim.format(now);
        String p_porder ="Pur"+datenow+poID;
        record.setpOrder(p_porder);//自动生成编号
        System.out.println(p_porder);

        SimpleDateFormat simdate = new SimpleDateFormat("yyyy-MM-dd");
        String date = simdate.format(now);
        System.out.println(date);
        record.setpDate(date);//自动生成日期
        return purOrderMapper.insert(record);
    }

    @Override
    public PurPurchaseorder selectByPrimaryKey(Integer pId) {
        PurPurchaseorder purchaseorder = purOrderMapper.selectByPrimaryKey(pId);

        if (purchaseorder !=null){
            return purchaseorder;
        }else{
            return  null;
        }

    }

    @Override
    public int updateByPrimaryKey(PurPurchaseorder record) {
        System.out.println("service");
        return purOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer pId) {
        int rest = purOrderMapper.deleteByPrimaryKey(pId);
        if (rest>=1){
            return 1;
        }else {
            return 0;
        }
    }


}
