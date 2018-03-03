package com.qf.user.dao;

import com.qf.user.po.TUserdetail;
import com.qf.user.po.TUserdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserdetailMapper {
    long countByExample(TUserdetailExample example);

    int deleteByExample(TUserdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUserdetail record);

    int insertSelective(TUserdetail record);

    List<TUserdetail> selectByExample(TUserdetailExample example);

    TUserdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TUserdetail record, @Param("example") TUserdetailExample example);

    int updateByExample(@Param("record") TUserdetail record, @Param("example") TUserdetailExample example);

    int updateByPrimaryKeySelective(TUserdetail record);

    int updateByPrimaryKey(TUserdetail record);
}