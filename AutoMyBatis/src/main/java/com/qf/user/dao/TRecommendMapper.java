package com.qf.user.dao;

import com.qf.user.po.util.TRecommend;
import com.qf.user.po.util.TRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRecommendMapper {
    long countByExample(TRecommendExample example);

    int deleteByExample(TRecommendExample example);

    int deleteByPrimaryKey(String no);

    int insert(TRecommend record);

    int insertSelective(TRecommend record);

    List<TRecommend> selectByExample(TRecommendExample example);

    TRecommend selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") TRecommend record, @Param("example") TRecommendExample example);

    int updateByExample(@Param("record") TRecommend record, @Param("example") TRecommendExample example);

    int updateByPrimaryKeySelective(TRecommend record);

    int updateByPrimaryKey(TRecommend record);
}