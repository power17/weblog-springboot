package com.power.weblog.admin.service;

import com.power.weblog.admin.model.VO.user.UpdateAdminUserPasswordReqVO;
import com.power.weblog.common.utils.Response;

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();

}


