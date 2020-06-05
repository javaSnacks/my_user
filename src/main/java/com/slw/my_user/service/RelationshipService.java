package com.slw.my_user.service;

import com.slw.my_user.dao.RelationshipMapper;
import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.ZonedDateTime;

@Service
public class RelationshipService {

    @Autowired
    UserService userService;

    @Autowired
    RelationshipMapper relationshipMapper;

    public int addOneRelationshipRecord(int personOne,int personTwo,int relationshipType,int expiration,boolean isValid,int operator){
        User user = userService.selectOneUserById(operator);
        Integer[] relationshipId = user.getRelationshipId();
        if (relationshipId!=null){
            for (int i : relationshipId) {
                Relationship relationship = selectOneRelationshipById(i);
                if (personOne==relationship.getPersonOne()&&personTwo==relationship.getPersonTwo()&&relationshipType==relationship.getRelationshipType()&&isValid==true){
                    return -1;
                }
            }
        }
        Relationship relationship = new Relationship();
        relationship.setPersonOne(personOne);
        relationship.setPersonTwo(personTwo);
        relationship.setRelationshipType(relationshipType);
        relationship.setCreateTime(ZonedDateTime.now().toEpochSecond());
        ZonedDateTime expiredTime = ZonedDateTime.now().plusYears(1);
        relationship.setExpireTime(expiredTime.toEpochSecond());
        relationship.setValid(1);
        relationship.setOperator(operator);
        relationshipMapper.insertSelective(relationship);
        return relationship.getId();
    }

    public Relationship selectOneRelationshipById(int id) {
        Relationship relationship = relationshipMapper.selectByPrimaryKey(id);
        return relationship;
    }
}
