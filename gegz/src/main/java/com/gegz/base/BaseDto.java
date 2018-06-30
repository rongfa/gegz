package com.gegz.base;

import java.io.Serializable;

public class BaseDto<PK extends Serializable> implements Serializable {

    private static final long serialVersionUID = -3761675344684204231L;

    private PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }
}
