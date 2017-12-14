package com.mo.dao;

import com.mo.entity.UserInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Zhuzhuhong
 * @create 2017年12月12日 15:01
 * @desc
 **/
@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer> {

    @Override
    UserInfo findOne(Integer integer);

    UserInfo findByUseraccountAndPassword(String useraccount, String password);

}
