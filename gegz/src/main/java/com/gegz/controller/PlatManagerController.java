package com.gegz.controller;

import com.gegz.base.BaseController;
import com.gegz.dto.PlatManagerDto;
import com.gegz.service.PlatManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/platManager")
public class PlatManagerController extends BaseController {
    @Autowired
    private PlatManagerService platManagerService;

    @RequestMapping(value = "/findPlatManagerDtoByPhone",method = RequestMethod.GET)
    public PlatManagerDto findPlatManagerDtoByPhone(String phone){
        return platManagerService.findPlatManagerDtoByPhone(phone);
    }
}
