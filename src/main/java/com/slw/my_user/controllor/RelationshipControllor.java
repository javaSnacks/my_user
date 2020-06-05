package com.slw.my_user.controllor;

import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.request.AddRelationshipRequest;
import com.slw.my_user.service.RelationshipService;
import com.slw.my_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RelationshipControllor {

    @Autowired
    UserService userService;

    @Autowired
    RelationshipService relationshipService;

    @PostMapping("/relationship")
    @Transactional
    public boolean addOneRelationship(@RequestBody AddRelationshipRequest addRelationshipRequest){
        int relationshipRecordId  = relationshipService.addOneRelationshipRecord(addRelationshipRequest.getPersonOne(),addRelationshipRequest.getPersonTwo(),addRelationshipRequest.getRelationshipType(),addRelationshipRequest.getExpiration(),addRelationshipRequest.isValid(),addRelationshipRequest.getOperator());
        if (relationshipRecordId==-1){
            return false;
        }
        boolean flag1 = userService.insertOneRelationshipRecord(addRelationshipRequest.getPersonOne(),relationshipRecordId);
        boolean flag2 = userService.insertOneRelationshipRecord(addRelationshipRequest.getPersonTwo(),relationshipRecordId);
        return flag1&&flag2;
    }


    @GetMapping("/relationship/{id}")
    public Relationship getOneRelationship(@PathVariable int id){
        Relationship relationship = relationshipService.selectOneRelationshipById(id);
        return relationship;
    }

}
