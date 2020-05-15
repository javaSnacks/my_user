package com.slw.my_user.controllor;

import com.slw.my_user.model.User;
import com.slw.my_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllor {

    @Autowired
    UserService userService;

//    @PostMapping
//    public String addOneUser(@RequestParam int id, @RequestParam String name, @RequestParam String phone){
//        boolean b = userService.addOneUser(id, name, phone);
//        if (b==true){
//            return "success";
//        }
//        return "false";
//    }

    @GetMapping("/{id}")
    public User selectOneUserById(@PathVariable int id){
        User user = userService.selectOneUserById(id);
        return user;
    }


    @DeleteMapping("/{id}")
    public String deleteOneUserById(@PathVariable int id){
        boolean b = userService.deleteOneUserById(id);
        if (b){
            return "success";
        }
        return "false";
    }

    @GetMapping
    public List<User> selectAllUser(){
        List<User> list = userService.selectAllUser();
        return list;
    }

}