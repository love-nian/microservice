package com.mo.controller;

import com.mo.entity.UserInfo;
import com.mo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Zhuzhuhong
 * @create 2017年12月12日 15:07
 * @desc
 **/
@RestController
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findById/{userId}", method = RequestMethod.GET)
    public UserInfo findById(@PathVariable Integer userId) {
        UserInfo userInfo = new UserInfo();
        try {
            userInfo = userService.findUserById(userId);
        } catch (Exception e) {
            logger.error(e);
        }
        return userInfo;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInfo login(@RequestParam String userAccount, @RequestParam String password) {
        UserInfo userInfo = new UserInfo();
        try {
            userInfo = userService.login(userAccount, password);
        } catch (Exception e) {
            logger.error(e);
        }
        return userInfo;
    }

}
