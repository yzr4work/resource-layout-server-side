package com.yzr.resource.layout.background.service.dto.user;

/**
 * 创建后台用户结果
 */
public class CreateBgUserResultDto {
    // 1 创建成功 2 创建失败,账号重复
    private int resultType;
    // 描述
    private String desc;

    public int getResultType() {
        return resultType;
    }

    public void setResultType(int resultType) {
        this.resultType = resultType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CreateBgUserResultDto() {
    }

    public CreateBgUserResultDto(int resultType, String desc) {
        this.resultType = resultType;
        this.desc = desc;
    }

    public static CreateBgUserResultDto createSuccess(){
        CreateBgUserResultDto resultDto = new CreateBgUserResultDto();
        resultDto.setResultType(1);
        return resultDto;
    }

    public static CreateBgUserResultDto createFail(){
        return new CreateBgUserResultDto(2,"创建失败,账号重复");
    }
}
