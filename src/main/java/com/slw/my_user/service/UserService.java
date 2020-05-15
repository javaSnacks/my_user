package com.slw.my_user.service;

import com.slw.my_user.dao.UserMapper;
import com.slw.my_user.model.User;
import com.slw.my_user.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public boolean addOneUser(int id,String name,String phone,int relationshipId){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        user.setRelationshipId(relationshipId);
        int i = userMapper.insertSelective(user);
        if(i>0){
            return true;
        }
        return false;
    }

    public List<User> selectAllUser(){
        UserExample userExample = new UserExample();
        userExample.or().getAllCriteria();
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    public User selectOneUserById(int id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }


    public boolean deleteOneUserById(int id){
        int i = userMapper.deleteByPrimaryKey(id);
        if (i>0){
            return true;
        }
        return false;
    }
}
