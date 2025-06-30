package com.yzr.resource.layout.background.service;

import com.yzr.resource.laout.background.service.dto.overall.PageParamDtoWarp;
import com.yzr.resource.laout.background.service.dto.overall.PageReturnDtoWarp;
import com.yzr.resource.layout.background.service.dto.user.*;

public interface BgUserService {
    /**
     * 创建后台用户
     */
    CreateBgUserResultDto createBgUser(CreateBgUserDto createBgUserDto);
    /**
     * 删除后台用户
     */
    DeleteBgUserResultDto deleteBgUser(DeleteBgUserDto deleteBgUserDto);
    /**
     * 后台用户登录
     */
    LoginResultDto login(LoginDto loginDto);
    /**
     * 后台用户登出
     */
    SignOutResultDto signOut(SignOutDto signOutDto);
    /**
     * 根据token获取后台用户
     */
    OperatorInfoResultDto getOperatorByToken(String token);

    /**
     * 分页条件查询后台用户列表
     * @param pageParam 分页条件
     * @return 分页查询结果
     */
    PageReturnDtoWarp<BgUserInfoListResultDto> list(PageParamDtoWarp<BgUserInfoListDto> pageParam);

    /**
     * 获取后台用户信息
     * @param userInfoDto 获取条件
     * @return 后台用户信息
     */
    BgUserInfoResultDto info(BgUserInfoDto userInfoDto);

}
