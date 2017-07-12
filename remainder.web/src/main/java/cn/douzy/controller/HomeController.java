package cn.douzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/12.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/test")
    public String home(){
        return "hello word!";
    }
}
