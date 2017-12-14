package com.mo.service;

import com.mo.dao.UserRepository;
import com.mo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Zhuzhuhong
 * @create 2017年12月12日 15:02
 * @desc
 **/

public interface UserService {

    UserInfo findUserById(Integer userId) throws Exception;

    UserInfo login(String userAccount, String password) throws Exception;
}
