package com.yzr.resource.layout.background.service.impl;

import com.yzr.resource.layout.background.dto.user.*;
import com.yzr.resource.layout.background.service.BgUserService;
import org.springframework.stereotype.Service;

@Service
public class BgUserServiceImpl implements BgUserService {
    /**
     * 创建后台用户
     *
     * @param createBgUserDto
     */
    @Override
    public CreateBgUserResultDto createBgUser(CreateBgUserDto createBgUserDto) {
        return null;
    }

    /**
     * 删除后台用户
     *
     * @param deleteBgUserDto
     */
    @Override
    public DeleteBgUserResultDto deleteBgUser(DeleteBgUserDto deleteBgUserDto) {
        return null;
    }

    /**
     * 后台用户登录
     *
     * @param loginDto
     */
    @Override
    public LoginResultDto login(LoginDto loginDto) {
        return null;
    }

    /**
     * 后台用户登出
     *
     * @param signOutDto
     */
    @Override
    public SignOutResultDto signOut(SignOutDto signOutDto) {
        return null;
    }

    /**
     * 根据token获取后台用户
     *
     * @param token
     */
    @Override
    public BgUserInfoDto getBgUserByToken(String token) {
        return null;
    }
}
