package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserControllet {
    @Resource
    private UserService userService;
    @RequestMapping("/init")
    public String init(Model model){
        model.addAttribute("userList",userService.findAllErpUser());
        return "tables_lists";
    }

    @RequestMapping("/list")
    public String table_lists(){
        return JSONArray.toJSONString("table_lists");
    }
}
