package com.yzr.resource.layout.background.service.dto.overall;

public class PageParamDtoWarp<T> {
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
        return "PageParamDtoWarp{" +
                "lastId=" + lastId +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", param=" + param +
                '}';
    }
}
