package com.yzr.resource.layout.background.service;

import com.yzr.resource.layout.background.dto.user.*;

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
    BgUserInfoDto getBgUserByToken(String token);
}
