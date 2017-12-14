package com.mo.service.impl;

import com.mo.dao.UserRepository;
import com.mo.entity.UserInfo;
import com.mo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zhuzhuhong
 * @create 2017年12月12日 15:04
 * @desc
 **/
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository repository;

    @Override
    public UserInfo findUserById(Integer userId) throws Exception {
        try {
            return repository.findOne(userId);
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }

    @Override
    public UserInfo login(String userAccount, String password) throws Exception {
        try {
            return repository.findByUseraccountAndPassword(userAccount, password);
        } catch (Exception e) {
            logger.error(e);
            throw e;
        }
    }
}
