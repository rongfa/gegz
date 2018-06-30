package com.gegz.model;

import com.gegz.base.BaseDomain;

import javax.persistence.Table;

/**
 * Created by dell on 2018/6/11.
 */
@Table(name = "plat_manager")
public class PlatManager extends BaseDomain<Long>{
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
