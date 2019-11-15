package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.pojo.Indent;
import cn.bdqn.erpsystem.service.IndentService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/indent")
public class IndentController {
    @Resource
    IndentService indentService;

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("indentList",indentService.selectByExample());
        return "IndentOrder";
    }
    //转到订单增加页
    @RequestMapping("/production")
    public String toAddIndent(){
        System.out.println("转到用户增加==========>");
        return "ProAdd";
    }
    /*添加*/
    @RequestMapping("/addPro")
    public  String AddIndent(@RequestParam(value = "name",required = false) String name,
                             @RequestParam(value = "goods",required = false)String goods,
                             @RequestParam(value = "counts",required = false) Integer counts,
                             @RequestParam(value = "phone",required = false) String phone,
                             @RequestParam(value = "address",required = false) String address,
                             @RequestParam(value = "datetime",required = false) String datetime,
                             @RequestParam(value = "datetimeos",required = false) String datetimeos,
                             String path){
        Indent indent = new Indent();
        indent.setName(name);
        indent.setGoods(goods);
        indent.setCounts(counts);
        indent.setPhone(phone);
        indent.setAddress(address);
        indent.setDatetime(datetime);
        indent.setDatetimeos(datetimeos);
        int rest = indentService.insert(indent);
        System.out.println(rest);
        if (rest >=1){
            path="redirect:show";
        }else{
            path="ProAdd";
        }
        return path;
    }

    /*修改前查询*/
    @RequestMapping("/updatePro")
    public  String updatePro(@RequestParam("uId") Integer uId,Model model){
        System.out.println(uId);
        Indent indent = indentService.selectByPrimaryKey(uId);
        model.addAttribute("indent",indent);
        return "ProUpdate";
    }

    /*修改*/
    @RequestMapping("/updateInsert")
    public  String updateInsert(@RequestParam(value = "name",required = false) String name,
                             @RequestParam(value = "goods",required = false)String goods,
                             @RequestParam(value = "counts",required = false) Integer counts,
                             @RequestParam(value = "phone",required = false) String phone,
                             @RequestParam(value = "address",required = false) String address,
                             @RequestParam(value = "datetime",required = false) String datetime,
                             @RequestParam(value = "datetimeos",required = false) String datetimeos,
                             @RequestParam(value = "id",required = false) Integer id,
                             String path){
        Indent indent = new Indent();
        indent.setId(id);
        indent.setName(name);
        indent.setGoods(goods);
        indent.setCounts(counts);
        indent.setPhone(phone);
        indent.setAddress(address);
        indent.setDatetime(datetime);
        indent.setDatetimeos(datetimeos);
        int rest = indentService.updateByPrimaryKey(indent);
        if (rest >=1){
            path="redirect:show";
        }else{
            path="ProUpdate";
        }
        return path;
    }

    /*删除*/
    @RequestMapping("/delOrder")
    @ResponseBody
    public String delOrder(@RequestParam("id") Integer id,String path){
        System.out.println(id);
        boolean falg = false;
        int rest = indentService.deleteByPrimaryKey(id);
        if (rest>=1){
            falg = true;
            path ="redirect:show";
        }else {
            falg = false;
        }
        return JSONArray.toJSONString(falg);
    }
}
