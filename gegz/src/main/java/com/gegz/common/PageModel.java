package com.gegz.common;

/**
 * @author Martins
 * @create 2018/1/12 14:17.
 */
public class PageModel {

    private int page = 1;
    private int pageSize = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
