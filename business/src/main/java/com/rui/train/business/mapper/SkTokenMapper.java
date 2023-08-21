package com.rui.train.business.mapper;

import com.rui.train.business.domain.SkToken;
import com.rui.train.business.domain.SkTokenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/8/22 0:02
 * @Version 1.0
 */
public interface SkTokenMapper {
    long countByExample(SkTokenExample example);

    int deleteByExample(SkTokenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkToken record);

    int insertSelective(SkToken record);

    List<SkToken> selectByExample(SkTokenExample example);

    SkToken selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkToken record, @Param("example") SkTokenExample example);

    int updateByExample(@Param("record") SkToken record, @Param("example") SkTokenExample example);

    int updateByPrimaryKeySelective(SkToken record);

    int updateByPrimaryKey(SkToken record);
}
