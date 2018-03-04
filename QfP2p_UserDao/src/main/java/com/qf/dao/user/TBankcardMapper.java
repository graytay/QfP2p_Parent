package com.qf.dao.user;

import com.qf.user.po.user.TBankcard;
import com.qf.user.po.user.TBankcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBankcardMapper {
    long countByExample(TBankcardExample example);

    int deleteByExample(TBankcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBankcard record);

    int insertSelective(TBankcard record);

    List<TBankcard> selectByExample(TBankcardExample example);

    TBankcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBankcard record, @Param("example") TBankcardExample example);

    int updateByExample(@Param("record") TBankcard record, @Param("example") TBankcardExample example);

    int updateByPrimaryKeySelective(TBankcard record);

    int updateByPrimaryKey(TBankcard record);
}