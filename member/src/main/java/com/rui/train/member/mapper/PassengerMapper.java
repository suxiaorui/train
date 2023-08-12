package com.rui.train.member.mapper;

import com.rui.train.member.domain.Passenger;
import com.rui.train.member.domain.PassengerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerMapper {
    long countByExample(PassengerExample example);

    int deleteByExample(PassengerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Passenger record);

    int insertSelective(Passenger record);

    List<Passenger> selectByExample(PassengerExample example);

    Passenger selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByExample(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);
}