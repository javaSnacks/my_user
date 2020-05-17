package com.slw.my_user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RelationshipTypeEnum {
    FRIEND("朋友",1),
    FAMILY("亲人",2),
    STRANGER("陌生人",3),
    NONE("没有关系",0);

    private String relationshipName;
    private int index;

    public static RelationshipTypeEnum fromIndex(int i){
        for(RelationshipTypeEnum relationshipTypeEnum:RelationshipTypeEnum.values()){
            if (relationshipTypeEnum.index==i) {
                return relationshipTypeEnum;
            }
        }
        return null;
    }

}
