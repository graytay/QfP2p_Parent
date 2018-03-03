package com.qf.user.dao;

import com.qf.user.po.TRecommend;

public interface TRecommendMapper {

    int deleteByPrimaryKey(String no);

    int insert(TRecommend record);

    int insertSelective(TRecommend record);


    TRecommend selectByPrimaryKey(String no);

    int updateByPrimaryKeySelective(TRecommend record);

    int updateByPrimaryKey(TRecommend record);
}