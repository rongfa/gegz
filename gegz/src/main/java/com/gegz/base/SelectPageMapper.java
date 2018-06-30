package com.gegz.base;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.SelectProvider;

public interface SelectPageMapper<T> {
    @SelectProvider(
            type = BaseSelectPageProvider.class,
            method = "dynamicSQL"
    )
    Page<T> selectPage(T var1);
}
