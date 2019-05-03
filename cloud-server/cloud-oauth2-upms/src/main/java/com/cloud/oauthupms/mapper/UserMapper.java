package com.cloud.oauthupms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.oauthupms.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * User Mapper接口
 * </p>
 * @Title: UserController.java
 * @Package: com.cloud.oauthupms.mapper;
 *
 * @Author <a href="mailto:au.t@foxmail.com">au.T</a>
 * @Date: 2019-05-03 15:33:17
 * @Version: 1.0.0-SNAPSHOT
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 简单分页查询
     * @param user 
     * @return
     *   IPage<User> getUserPage(Page page, @Param("user") User user);
     */

}
