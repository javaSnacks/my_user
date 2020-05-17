package com.slw.my_user.service;

import com.slw.my_user.dao.RelationshipMapper;
import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.RelationshipExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class RelationshipService {

    @Autowired
    RelationshipMapper relationshipMapper;

    public boolean addOneRelationship(int relationshipType, int personOne, int personTwo, Timestamp createDate, Timestamp expireDate, Timestamp deleteDate, boolean valid, int operator){
        Relationship relationship = new Relationship();
        relationship.setPersonOne(personOne);
        relationship.setPersonTwo(personTwo);
        relationship.setCreateTime(createDate);
        relationship.setExpireTime(expireDate);
        relationship.setDeleteTime(deleteDate);
        relationship.setValid(valid);
        relationship.setOperator(operator);
        int i = relationshipMapper.insert(relationship);
        if (i>0) {
            return true;
        }
        return false;
    }

    public List<Relationship> selectOneRelationshipById(int id) {
        RelationshipExample relationshipExample = new RelationshipExample();
        relationshipExample.or().andIdEqualTo(id);
        List<Relationship> relationshipList = relationshipMapper.selectByExample(relationshipExample);
        return relationshipList;
    }
}
