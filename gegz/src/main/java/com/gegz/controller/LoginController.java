package com.gegz.controller;

import com.gegz.base.BaseController;
import com.gegz.common.utils.PasswordUtil;
import com.gegz.common.utils.StringUtilPlus;
import com.gegz.dto.PlatManagerDto;
import com.gegz.service.PlatManagerService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController extends BaseController{
    @Autowired
    private PlatManagerService platManagerService;

    @RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> checkLogin(HttpServletRequest request, String phone, String password) throws Exception{
        Map<String,Object> map = new HashMap<>();
        if(StringUtilPlus.isNotEmpty(phone) && StringUtilPlus.isNotEmpty(password)) {
            PlatManagerDto platManagerDto = platManagerService.findPlatManagerDtoByPhone(phone);
            if(platManagerDto==null){
                map.put("msg","用户名不存在");
                map.put("code",-1);
            }else{
                if(!PasswordUtil.validPassword(password,platManagerDto.getPassword())){
                    map.put("msg","密码错误");
                    map.put("code",-1);
                }else{
                    HttpSession session = request.getSession();
                    session.setAttribute("token",platManagerDto);
                    map.put("msg","登录成功");
                    map.put("code",0);
                }
            }
        }else{
            map.put("msg","请输入用户名或密码");
            map.put("code",-1);
        }
        return map;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView mav = getModelAndView();
        mav.setViewName("index/index");
        return mav;
    }

    @RequestMapping(value = "/logOut",method = RequestMethod.GET)
    public ModelAndView logOut(HttpServletRequest request){
        ModelAndView mav = getModelAndView();
        HttpSession session = request.getSession();
        session.removeAttribute("token");
        mav.setViewName("/loginIn");
        return mav;
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView mav = getModelAndView();
        mav.setViewName("index/main");
        return mav;
    }
}
