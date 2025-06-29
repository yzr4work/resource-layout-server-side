package com.yzr.resource.layout.background.service.dto.user;

/**
 * 删除后台用户结果
 */
public class DeleteBgUserResultDto {
    /**
     * 删除后台用户结果 true 成功 false 失败
     */
    private Boolean result;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public DeleteBgUserResultDto() {
    }

    public DeleteBgUserResultDto(Boolean result) {
        this.result = result;
    }
}
