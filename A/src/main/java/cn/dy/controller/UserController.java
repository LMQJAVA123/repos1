package cn.dy.controller;

import com.deyuan.pojo.Account;
import com.deyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Create by yanhongbo
 * 日期 2021/7/1
 *
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = userService.findAll();
        model.addAttribute("list",list);
        return "show";
    }
}
