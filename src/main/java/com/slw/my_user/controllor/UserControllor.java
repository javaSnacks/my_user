package com.slw.my_user.controllor;

import cn.xinzhili.xutils.core.http.Response;
import com.slw.my_user.model.User;
import com.slw.my_user.model.request.AddUserRelationshipRequest;
import com.slw.my_user.model.response.GetAllUserResponse;
import com.slw.my_user.model.response.SelectUserByPageHelperResponse;
import com.slw.my_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllor {

    @Autowired
    UserService userService;

    @PostMapping
    @CacheEvict(value = "getAllUser", allEntries = true)
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
    @CacheEvict(value = "getAllUser", allEntries = true)
    public Response deleteOneUserById(@PathVariable int id){
        boolean b = userService.deleteOneUserById(id);
        if (b){
            return Response.instanceSuccess();
        }
        return Response.instanceFail();
    }

    @GetMapping
    @Cacheable(value = "getAllUser")
    public Response<GetAllUserResponse> selectAllUser(){
        System.out.println("select from db");
        List<User> list = userService.selectAllUser();
        GetAllUserResponse response = new GetAllUserResponse();
        response.setUserList(list);
        response.setCount(list.size());
        return Response.instanceSuccess(response);
    }

    @GetMapping("/relationship/{id}")
    public Response<Integer[]> selectOneUserRelationship(@PathVariable int id){
        Integer[] relationshipRecord = userService.selectOneRelationshipRecord(id);
        return Response.instanceSuccess(relationshipRecord);
    }

    @GetMapping(params = {"pageNum","pageSize"})
    public Response<SelectUserByPageHelperResponse> selectUserByPageHelper(@RequestParam int pageNum, @RequestParam int pageSize){
        SelectUserByPageHelperResponse response = userService.selectAllUserByPage(pageNum, pageSize);
        return Response.instanceSuccess(response);
    }

}
