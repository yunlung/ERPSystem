package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserControllet {
    @Resource
    private UserService userService;
    //用户展示也
    @RequestMapping("/list")
    public String init(Model model){
        model.addAttribute("userList",userService.findAllErpUser());
        return "table_users";
    }
    //转到用户增加页
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add_user";
    }

    public String addUser(ErpUser erpUser,Model model){
        if (userService.addErpUser(erpUser)){
            return "redirect:/user/list";
        }
        model.addAttribute("addError","增加失败!");
        return "add_user";
    }
}
