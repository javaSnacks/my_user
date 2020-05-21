package com.slw.my_user.dao.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import java.sql.*;


@MappedJdbcTypes({JdbcType.OTHER})
@MappedTypes({Integer.class})
public class IntegerArrayTypeHandler extends BaseTypeHandler<Integer[]>{
    public IntegerArrayTypeHandler() {
    }

    public void setNonNullParameter(PreparedStatement ps, int i, Integer[] parameter, JdbcType jdbcType) throws SQLException {
        Connection c = ps.getConnection();
        Array inArray = c.createArrayOf("int", parameter);
        ps.setArray(i, inArray);
    }

    public Integer[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Array outputArray = rs.getArray(columnName);
        return outputArray == null ? null : (Integer[])outputArray.getArray();
    }

    public Integer[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Array outputArray = rs.getArray(columnIndex);
        return outputArray == null ? null : (Integer[])outputArray.getArray();
    }

    public Integer[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Array outputArray = cs.getArray(columnIndex);
        return outputArray == null ? null : (Integer[])outputArray.getArray();
    }
}
