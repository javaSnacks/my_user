package com.slw.my_user.service;

import com.slw.my_user.dao.RelationshipMapper;
import com.slw.my_user.model.Relationship;
import com.slw.my_user.model.RelationshipExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RelationshipService {

    @Autowired
    RelationshipMapper relationshipMapper;

    public boolean addOneRelationship(int id, int relationshipType, int personOne, int personTwo, Date createDate, Date expireDate,Date deleteDate,boolean valid,int operator){
        Relationship relationship = new Relationship(id,relationshipType,personOne,personTwo,createDate,expireDate,deleteDate,valid,operator);
        int i = relationshipMapper.insertSelective(relationship);
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
