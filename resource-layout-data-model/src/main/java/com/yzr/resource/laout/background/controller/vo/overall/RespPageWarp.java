package com.yzr.resource.laout.background.controller.vo.overall;

import java.util.List;

/**
 * 返回分页对象包装
 * @param <T> 查询结果对象类型
 */
public class RespPageWarp<T> {
    private Long currentPage;
    private int pageSize;
    private Long count;
    private List<T> list;

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
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
        return "RespPageWarp{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", list=" + list +
                '}';
    }
}
