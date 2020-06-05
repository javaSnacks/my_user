package com.slw.my_user.service;

import cn.xinzhili.xutils.core.http.Response;
import com.slw.my_user.dao.UserMapper;
import com.slw.my_user.model.User;
import com.slw.my_user.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public Response addOneUser(String name, String phone){
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setValid(1);
        userMapper.insert(user);
        return Response.instanceSuccess();
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

    public boolean insertOneRelationshipRecord(int personId,int relationshipRecord){
        User user = new User();
        user.setId(personId);
        Integer[] integers = selectOneRelationshipRecord(personId);
        List<Integer> list = new ArrayList<>();
        if (integers!=null){
            list = new ArrayList<>(Arrays.asList(integers));
        }else{
            integers = new Integer[1];
        }
        list.add(relationshipRecord);
        Integer[] array = list.toArray(integers);
        user.setRelationshipId(array);
        int i = userMapper.updateByPrimaryKeySelective(user);
        return i>0?true:false;
    }

    public Integer[] selectOneRelationshipRecord(int personId){
        User user = userMapper.selectByPrimaryKey(personId);
        Integer[] relationshipId = user.getRelationshipId();
        return relationshipId;
    }
}
