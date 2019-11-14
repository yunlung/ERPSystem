package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.pojo.PurProvider;
import cn.bdqn.erpsystem.pojo.PurProviderExample;

import java.util.List;

public interface ProviderService {
    List<PurProvider> selectByExample(PurProviderExample example);
}
