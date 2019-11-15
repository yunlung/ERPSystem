package cn.bdqn.erpsystem.service;

import cn.bdqn.erpsystem.dao.IndentMapper;
import cn.bdqn.erpsystem.pojo.Indent;
import cn.bdqn.erpsystem.pojo.IndentExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Service("indentService")
public class IndentServiceImpl implements IndentService {

    @Resource
    IndentMapper indentMapper;

    @Override
    public List<Indent> selectByExample() {
        IndentExample indentExample = new IndentExample();
        List<Indent> indentList = indentMapper.selectByExample(indentExample);
        return indentList;
    }

    @Override
    public int insert(Indent record) {
        return indentMapper.insert(record);
    }

    @Override
    public Indent selectByPrimaryKey(Integer id) {
        return indentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Indent record) {
        return indentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int rest = indentMapper.deleteByPrimaryKey(id);
        if (rest>=1){
            return 1;
        }else {
            return 0;
        }
    }


}
