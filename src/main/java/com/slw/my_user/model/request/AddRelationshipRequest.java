package com.slw.my_user.model.request;

import lombok.Data;

@Data
public class AddRelationshipRequest {
    int id;

    int relationshipType;

    int personOne;

    int personTwo;

    boolean valid;

    int operator;
}
