package com.slw.my_user.controllor;

import cn.xinzhili.xutils.core.http.Response;
import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.User;
import com.slw.my_user.model.request.AddUserRelationshipRequest;
import com.slw.my_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllor {

    @Autowired
    UserService userService;

    @PostMapping
    public Response addOneUser(@RequestBody AddUserRelationshipRequest addUserRelationshipRequest){
        Response response = userService.addOneUser(addUserRelationshipRequest.getName(), addUserRelationshipRequest.getPhone());
        return response;
    }

    @GetMapping("/{id}")
    public Response<User> selectOneUserById(@PathVariable int id){
        User user = userService.selectOneUserById(id);
        return Response.instanceSuccess(user);
    }


    @DeleteMapping("/{id}")
    public Response deleteOneUserById(@PathVariable int id){
        boolean b = userService.deleteOneUserById(id);
        if (b){
            return Response.instanceSuccess();
        }
        return Response.instanceFail();
    }

    @GetMapping
    public Response<List<User>> selectAllUser(){
        List<User> list = userService.selectAllUser();
        return Response.instanceSuccess(list);
    }

    @GetMapping("/relationship/{id}")
    public Response<Integer[]> selectOneUserRelationship(@PathVariable int id){
        Integer[] relationshipRecord = userService.selectOneRelationshipRecord(id);
        return Response.instanceSuccess(relationshipRecord);
    }

}
