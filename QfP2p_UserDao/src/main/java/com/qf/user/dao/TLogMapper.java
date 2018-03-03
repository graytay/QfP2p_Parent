package com.qf.user.dao;

import com.qf.user.po.TLog;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogMapper {
    int insert(TLog record);
    List<TLog> selectByPage(@Param("msg") String msg, @Param("index") int index, @Param("count") int count);
    Long selectCount(String msg);

}