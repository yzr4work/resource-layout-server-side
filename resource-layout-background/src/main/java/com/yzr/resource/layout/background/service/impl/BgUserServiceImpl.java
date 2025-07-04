package com.yzr.resource.layout.background.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.yzr.resource.laout.background.service.dto.overall.PageParamDtoWarp;
import com.yzr.resource.laout.background.service.dto.overall.PageReturnDtoWarp;
import com.yzr.resource.layout.background.dao.BgUserArea;
import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import com.yzr.resource.layout.background.service.BgUserService;
import com.yzr.resource.layout.background.service.dto.user.*;
import com.yzr.resource.layout.tool.BgUserTokenRuleTool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BgUserServiceImpl implements BgUserService {

    private final BgUserArea bgUserArea;

    @Value("secretKey")
    private String secretKey;

    public BgUserServiceImpl(BgUserArea bgUserArea) {
        this.bgUserArea = bgUserArea;
    }

    /**
     * 创建后台用户
     *
     * @param createBgUserDto
     */
    @Override
    public CreateBgUserResultDto createBgUser(CreateBgUserDto createBgUserDto) {
        BgUserEntity bgUserEntity = new BgUserEntity();
        bgUserEntity.setBgUserAccount(createBgUserDto.getBgUserAccount());
        bgUserEntity.setBgUserName(createBgUserDto.getBgUserName());
        bgUserEntity.setPassword(createBgUserDto.getPassword());
        if (StringUtils.isEmpty(bgUserArea.createBgUser(bgUserEntity)) ){

            return CreateBgUserResultDto.createFail();
        }else {

            return CreateBgUserResultDto.createSuccess();
        }

    }

    /**
     * 删除后台用户
     *
     * @param deleteBgUserDto
     */
    @Override
    public DeleteBgUserResultDto deleteBgUser(DeleteBgUserDto deleteBgUserDto) {
        BgUserEntity bgUser = new BgUserEntity();
        bgUser.setBgUserId(deleteBgUserDto.getBgUserId());
        bgUser.setBgUserAccount(deleteBgUserDto.getBgUserAccount());
        return new DeleteBgUserResultDto( bgUserArea.deleteBgUser(bgUser));

    }

    /**
     * 后台用户登录
     *
     * @param loginDto
     */
    @Override
    public LoginResultDto login(LoginDto loginDto) throws Exception {
        BgUserEntity bgUser = new BgUserEntity();
        bgUser.setBgUserAccount(loginDto.getBgUserAccount());
        bgUser.setPassword(loginDto.getPassword());
        BgUserEntity userInfo = bgUserArea.findBgUser(bgUser);
        if (userInfo == null){
            return null;
        }
        //创建token
        String token = BgUserTokenRuleTool.GENERATE_BG_USER_TOKEN(userInfo.getBgUserId(), userInfo.getBgUserAccount(), secretKey);
        //缓存token
        bgUserArea.cacheTokenBgUser(token, userInfo);
        LoginResultDto loginResultDto = new LoginResultDto();
        loginResultDto.setToken(token);
        loginResultDto.setBgUserName(userInfo.getBgUserName());
        return loginResultDto;
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
    public OperatorInfoResultDto getOperatorByToken(String token) {
        return null;
    }

    /**
     * 分页条件查询后台用户列表
     *
     * @param pageParam 分页条件
     * @return 分页查询结果
     */
    @Override
    public PageReturnDtoWarp<BgUserInfoListResultDto> list(PageParamDtoWarp<BgUserInfoListDto> pageParam) {
        return null;
    }

    /**
     * 获取后台用户信息
     *
     * @param userInfoDto 获取条件
     * @return 后台用户信息
     */
    @Override
    public BgUserInfoResultDto info(BgUserInfoDto userInfoDto) {
        return null;
    }
}
