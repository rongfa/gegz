package com.gegz.dto;

import com.gegz.base.BaseDto;

/**
 * Created by dell on 2018/6/11.
 */
public class PlatManagerDto extends BaseDto<Long> {
    private static final long serialVersionUID = 605951941121041253L;

    private String phone;


    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
