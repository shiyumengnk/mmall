package com.sym.mmall.service;

import com.sym.mmall.common.ServerResponse;
import com.sym.mmall.pojo.User;
import org.springframework.stereotype.Service;

/***
 * created by shiyumeng
 * date : 2019/9/24
 */

public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
