package com.slw.my_user.controllor;

import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.request.AddRelationshipRequest;
import com.slw.my_user.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class RelationshipControllor {

    @Autowired
    RelationshipService relationshipService;

    @PostMapping("/relationship")
    public List<Relationship> addOneRelationship(@RequestBody AddRelationshipRequest addRelationshipRequest){
        Calendar curr = Calendar.getInstance();
        curr.set(Calendar.MONTH,curr.get(Calendar.MONTH)+1);
        Date date=curr.getTime();
        boolean b = relationshipService.addOneRelationship(addRelationshipRequest.getRelationshipType(), addRelationshipRequest.getPersonOne(), addRelationshipRequest.getPersonTwo(), new Timestamp(new Date().getTime()), new Timestamp(date.getTime()), null, addRelationshipRequest.isValid(), addRelationshipRequest.getOperator());
//        List<Relationship> relationships = relationshipService.selectOneRelationshipById();
//        System.out.println(RelationshipTypeEnum.fromIndex(relationships.get(0).getId()));
        if (b==true){
//            return relationships;
        }
        return null;
    }


    @GetMapping("/relationship/{id}")
    public List<Relationship> getOneRelationship(@PathVariable int id){
        List<Relationship> relationships = relationshipService.selectOneRelationshipById(id);
        return relationships;
    }

}
