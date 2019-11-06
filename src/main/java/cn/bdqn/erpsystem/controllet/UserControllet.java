package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserControllet {
    @Resource
    private UserService userService;
    @RequestMapping("/list")
    public String init(Model model){
        model.addAttribute("userList",userService.findAllErpUser());
        return "table_users";
    }

}
