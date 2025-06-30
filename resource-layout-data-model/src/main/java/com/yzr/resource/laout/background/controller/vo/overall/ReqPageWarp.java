package com.yzr.resource.laout.background.controller.vo.overall;

/**
 * 分页查询请求包装
 * @param <T> 查询条件对象类型
 */
public class ReqPageWarp<T> {
    private Long lastId;
    private int pageSize;
    private Long currentPage;
    private T param;

    public Long getLastId() {
        return lastId;
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "ReqPageWarp{" +
                "lastId=" + lastId +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", param=" + param +
                '}';
    }
}
