package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("user")
public class UserControllet {
    @Resource
    private UserService userService;
    //用户展示页
    @RequestMapping("/list")
    public String init(Model model){
        model.addAttribute("userList",userService.findAllErpUser());
        return "table_users";
    }
    //转到用户增加页
    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAdd(){
        return "add_user";
    }
    @RequestMapping(value = "/toAdd",method = RequestMethod.POST)
    public String addUser(ErpUser erpUser,@Param("password")String password,
                          @Param("birthday")String birthday,
                          Model model){
        erpUser.setuPassword(password);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            erpUser.setuBirthday(simpleDateFormat.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (userService.addErpUser(erpUser)){
            return "redirect:/user/list";
        }
        model.addAttribute("addError","增加失败!");
        return "add_user";
    }
    @RequestMapping("/getUserbyId")
    @ResponseBody
    public String getUserById(){
        return "";
    }
}
