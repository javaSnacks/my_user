package com.slw.my_user.controllor;

import com.slw.my_user.model.Relationship;
import com.slw.my_user.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class RelationshipControllor {

    @Autowired
    RelationshipService relationshipService;

    @PostMapping("/relationship")
    public List<Relationship> addOneRelationship(@RequestParam int id, @RequestParam int relationshipType, @RequestParam int personOne, @RequestParam int personTwo, @RequestParam Date createTime, @RequestParam Date expireTime, @RequestParam Date deleteTime, @RequestParam boolean valid, @RequestParam int operator){
        boolean b = relationshipService.addOneRelationship(id, relationshipType, personOne, personTwo, createTime, expireTime, deleteTime, valid, operator);
        if (b==true){
            return relationshipService.selectOneRelationshipById(id);
        }
        return null;
    }

}
