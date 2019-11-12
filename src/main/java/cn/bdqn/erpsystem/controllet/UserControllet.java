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
        System.out.println("用户展示==========>");
        return "table_users";
    }
    //转到用户增加页
    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAddErpUser(){
        System.out.println("转到用户增加==========>");
        return "add_user";
    }
    //用户增加提交
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
        System.out.println("用户增加提交==========>"+erpUser.getuName());
        return "add_user";
    }
    //转到用户修改页
    @RequestMapping("/getUserbyId")
    public String getErpUserById(@Param("uId") String uId,Model model){
        ErpUser erpUser = userService.findUserById(uId);
        model.addAttribute("erpUser",erpUser);
        System.out.println("获取用户===========>"+erpUser.getuName());
        return "update_user";
    }
    /*//转到用户修改
    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    public String toUpdateErpUser(){
        System.out.println("转到用户修改==========>");
        return "update_user";
    }*/

    //转到用户修改
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateErpUser(ErpUser erpUser,@Param("password")String password,
                                @Param("birthday")String birthday,
                                Model model){
        erpUser.setuPassword(password);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            erpUser.setuBirthday(simpleDateFormat.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("用户修改提交=============>");
        if (userService.updateErpUser(erpUser)){
            return "redirect:/user/list";
        }
        model.addAttribute("addError","修改失败!");
        return "update_user";
    }
    @RequestMapping("/deleteErpUserById")
    @ResponseBody
    public String deleteErpUser(@Param("uId")String uId){
        System.out.println("删除用户==========>"+uId);
        return JSONArray.toJSONString(userService.deleteErpUserById(Integer.valueOf(uId)));
    }
}
