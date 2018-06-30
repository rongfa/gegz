package com.gegz.model;

import com.gegz.base.BaseDomain;

import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dell on 2018/6/12.
 */
@Table(name = "plat_question")
public class Question  extends BaseDomain<Long> {
    private static final long serialVersionUID = 605951941121048121L;

    private String title;

    private Boolean status;

    private Date createTime;

    private Date updateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
