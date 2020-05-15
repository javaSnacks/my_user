package com.slw.my_user.controllor;

import com.slw.my_user.model.Relationship;
import com.slw.my_user.service.RelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class RelationshipControllor {

    @Autowired
    RelationshipService relationshipService;

    @PostMapping("/relationship")
    public List<Relationship> addOneRelationship(@RequestParam int id, @RequestParam int relationshipType, @RequestParam int personOne, @RequestParam int personTwo, @RequestParam boolean valid, @RequestParam int operator){
        boolean b = relationshipService.addOneRelationship(id, relationshipType, personOne, personTwo, new Timestamp(new Date().getTime()), new Timestamp(new Date().getTime()  ), null, valid, operator);
        if (b==true){
            return relationshipService.selectOneRelationshipById(id);
        }
        return null;
    }

}
