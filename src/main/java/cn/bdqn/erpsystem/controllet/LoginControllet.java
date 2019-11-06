package cn.bdqn.erpsystem.controllet;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControllet {
    @RequestMapping(value = "/init")
    public String login(@Param("name") String name, @Param("password") String password){
        return "";
    }

    public String init(){
        return "";
    }
}
