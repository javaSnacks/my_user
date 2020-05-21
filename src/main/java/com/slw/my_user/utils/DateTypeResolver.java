package com.slw.my_user.utils;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;
import java.util.ArrayList;

public class DateTypeResolver extends JavaTypeResolverDefaultImpl {
    public DateTypeResolver(){
        super();
        super.typeMap.put(Types.ARRAY,new org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl.JdbcTypeInformation("ARRAY",new FullyQualifiedJavaType(ArrayList.class.getName())));
    }
}
