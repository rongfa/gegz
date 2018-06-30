package com.gegz.model;

import com.gegz.base.BaseDomain;

import javax.persistence.Table;

/**
 * Created by dell on 2018/6/11.
 */
@Table(name = "plat_user")
public class User  extends BaseDomain<Long> {
    private static final long serialVersionUID = 605951941121048422L;

    private String avatarUrl;

    private String nickName;

    private String gender;

    private String province;

    private String city;

    private String country;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
