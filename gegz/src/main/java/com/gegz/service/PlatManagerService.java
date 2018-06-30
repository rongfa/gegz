package com.gegz.service;

import com.gegz.dto.PlatManagerDto;

/**
 * Created by dell on 2018/6/11.
 */
public interface PlatManagerService {
    //根据电话查询系统管理员
    PlatManagerDto findPlatManagerDtoByPhone(String phone);
}
