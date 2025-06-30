package com.yzr.resource.laout.background.service.dto.overall;

import java.util.List;

public class PageReturnDtoWarp<T> {
    private Integer currentPage;
    private Integer pageSize;
    private Integer count;
    private List<T> list;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageReturnDtoWarp{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", list=" + list +
                '}';
    }
}
