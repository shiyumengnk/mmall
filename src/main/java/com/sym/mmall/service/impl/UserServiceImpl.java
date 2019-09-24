package com.sym.mmall.service.impl;

import com.sym.mmall.common.ServerResponse;
import com.sym.mmall.dao.UserMapper;
import com.sym.mmall.pojo.User;
import com.sym.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * created by shiyumeng
 * date : 2019/9/24
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        //String md5Password = MD5Util.MD5EncodeUtf8(password);
        //User user  = userMapper.selectLogin(username,md5Password);
        User user  = userMapper.selectLogin(username,password);
        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
