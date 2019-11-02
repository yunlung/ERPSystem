package cn.bdqn.erpsystem.controllet;

import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserControllet {
    @RequestMapping("/init")
    public String init(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public String table_lists(){
        return JSONArray.toJSONString("table_content");
    }
}
