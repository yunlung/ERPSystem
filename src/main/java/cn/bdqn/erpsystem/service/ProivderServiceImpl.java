package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.PurProviderMapper;
import cn.bdqn.erpsystem.pojo.PurPerson;
import cn.bdqn.erpsystem.pojo.PurPersonExample;
import cn.bdqn.erpsystem.pojo.PurProvider;
import cn.bdqn.erpsystem.pojo.PurProviderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("providerService")
public class ProivderServiceImpl implements ProviderService {

    @Resource
    PurProviderMapper providerMapper;

    @Override
    public List<PurProvider> selectByExample(PurProviderExample example) {
        PurProviderExample pro=new PurProviderExample();
        List<PurProvider> proList=providerMapper.selectByExample(pro);
        return proList;
    }
}
