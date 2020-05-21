package com.slw.my_user.model.request;

import lombok.Data;

@Data
public class AddRelationshipRequest {
    int relationshipType;

    int personOne;

    int personTwo;

    int expiration;

    boolean valid;

    int operator;
}
