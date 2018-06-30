package com.gegz.service.impl;

import com.gegz.common.BeanUtilPlus;
import com.gegz.dao.PlatManagerDao;
import com.gegz.dto.PlatManagerDto;
import com.gegz.model.PlatManager;
import com.gegz.service.PlatManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatManagerServiceImpl implements PlatManagerService {
    @Autowired
    private PlatManagerDao platManagerDao;

    @Override
    public PlatManagerDto findPlatManagerDtoByPhone(String phone) {
        PlatManager platManager = new PlatManager();
        platManager.setPhone(phone);
        platManager = platManagerDao.selectOne(platManager);
        PlatManagerDto platManagerDto = new PlatManagerDto();
        BeanUtilPlus.copy(platManager,platManagerDto);
        return platManagerDto;
    }
}
