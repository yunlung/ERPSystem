package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.pojo.ErpUser;
import cn.bdqn.erpsystem.service.UserService;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginControllet {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(HttpSession session, @Param("username") String username, @Param("password") String password){
        ErpUser erpUser = userService.login(username, password);
        session.setAttribute("user",erpUser);
        System.out.println("用户登录==========>"+erpUser.getuName());
        return JSONArray.toJSONString(erpUser);
    }
    @RequestMapping("/init")
    public String init(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
