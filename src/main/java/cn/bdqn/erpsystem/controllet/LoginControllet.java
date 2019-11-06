package cn.bdqn.erpsystem.controllet;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControllet {
    @RequestMapping(value = "/login")
    public String login(@Param("name") String name, @Param("password") String password){
        return "";
    }
    @RequestMapping("/init")
    public String init(){
        return "index";
    }
}
