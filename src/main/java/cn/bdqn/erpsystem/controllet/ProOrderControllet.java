package cn.bdqn.erpsystem.controllet;

import cn.bdqn.erpsystem.pojo.*;
import cn.bdqn.erpsystem.service.PersonService;
import cn.bdqn.erpsystem.service.ProviderService;
import cn.bdqn.erpsystem.service.PurchaseorderService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/purOrder")
public class ProOrderControllet {

    @Resource
    PurchaseorderService purService;
    @Resource
    PersonService perService;
    @Resource
    ProviderService providerService;
   
    @RequestMapping("/init")
    public  String init(){
        return "table_users";
    }

    /*添加页面跳转*/
    @RequestMapping("/purOrderAdd")
    public  String purOrderAdd(Model model, PurPersonExample purPerson, PurProviderExample provider){
        List<PurPerson> perList = perService.selectByExample(purPerson);
        model.addAttribute("perList",perList);
        List<PurProvider> proList = providerService.selectByExample(provider);
        model.addAttribute("proList",proList);
        return "PurOrderAdd";
    }

    /*详细信息显示*/
    @RequestMapping("/purDetailed")
    public String purOrderDetailed(@RequestParam("pId") Integer pId,Model model,String path){
        System.out.println(pId);
        PurPurchaseorder purOrder = purService.selectByPrimaryKey(pId);
        if (purOrder!=null){
            model.addAttribute("purOrder",purOrder);
            path ="PurOrderView";
        }else{
            path ="redirect:show";
        }
        return path;
    }

    /*跳转到修改页面*/
    @RequestMapping("/purUpdateView")
    public String purUpdateView(@RequestParam("pId") Integer pId,Model model,String path){

        PurPurchaseorder purOrder = purService.selectByPrimaryKey(pId);
        if (purOrder!=null){
            model.addAttribute("purOrder",purOrder);
            path ="PurOrderUpdate";
        }else{
            path ="redirect:show";
        }
        return path;
    }

    /*显示数据*/
    @RequestMapping("/show")
    public String show(Model model, PurPurchaseorderExample purorder){
       List<PurPurchaseorder> purList = purService.selectByExample(purorder);
       model.addAttribute("purList",purList);
       return "PurchaseOrder";
    }

    /*插入数据*/
    @RequestMapping("/addPurOrder")
    public String add(@RequestParam(value = "p_Name",required = false) String p_Name,
                      @RequestParam(value = "p_Number",required = false) Integer p_Number,
                      @RequestParam(value = "p_Money",required = false) Double p_Money,
                      @RequestParam(value = "p_Person",required = false) String p_Person,
                      @RequestParam(value = "p_ProviderId",required = false) String p_ProviderId,
                      @RequestParam(value = "p_Remarks",required = false) String p_Remarks,
                      String path){
        PurPurchaseorder purOrder = new PurPurchaseorder();
        purOrder.setpName(p_Name);
        purOrder.setpNumber(p_Number);
        purOrder.setpMoney(p_Money);
        purOrder.setpPerson(p_Person);
        purOrder.setpProviderid(p_ProviderId);
        purOrder.setpProductionid(0);
        purOrder.setpWarehouseid(0);
        purOrder.setpRemarks(p_Remarks);
        int rest =purService.insert(purOrder);
        if (rest>=1){
            path ="redirect:show";
        }else {
            path="PurOrderAdd";
        }
        return path;
    }

    /*修改*/
    @RequestMapping("/updateOrder")
    public String updateOrder(@RequestParam(value = "p_Order",required = false)  String p_Order,
                              @RequestParam(value = "p_Name",required = false) String p_Name,
                              @RequestParam(value = "p_Number",required = false) Integer p_Number,
                              @RequestParam(value = "p_Money",required = false) Double p_Money,
                              @RequestParam(value = "p_Date",required = false) String p_Date,
                              @RequestParam(value = "p_Person",required = false) String p_Person,
                              @RequestParam(value = "p_ProviderId",required = false) String p_ProviderId,
                              @RequestParam(value = "p_Remarks",required = false) String p_Remarks,
                              @RequestParam(value = "p_Id",required = false) Integer p_Id,
                              String path){
        PurPurchaseorder purOrder = new PurPurchaseorder();
        purOrder.setpId(p_Id);
        purOrder.setpOrder(p_Order);
        purOrder.setpName(p_Name);
        purOrder.setpNumber(p_Number);
        purOrder.setpMoney(p_Money);
        purOrder.setpDate(p_Date);
        purOrder.setpPerson(p_Person);
        purOrder.setpProviderid(p_ProviderId);
        purOrder.setpRemarks(p_Remarks);
        purOrder.setpProductionid(1);
        purOrder.setpWarehouseid(1);
        int rest  = purService.updateByPrimaryKey(purOrder);
        System.out.println(purOrder.getpDate());
        System.out.println(rest);
        if (rest>=1){
            path ="redirect:show";
        }else {
            path="PurOrderUpdate";
        }
        return  path;
    }

    /*删除*/
    @RequestMapping("/delOrder")
    @ResponseBody
    public String delOrder(@RequestParam("pId") Integer pId,String path){
        System.out.println(pId);
        boolean falg = false;
        int rest = purService.deleteByPrimaryKey(pId);
        if (rest>=1){
            falg = true;
            path ="redirect:show";
        }else {
            falg = false;
        }
        return JSONArray.toJSONString(falg);
    }
}
