package com.cloudbae.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public class QuesstionMapper {

    @Insert("INSERT INTO ")
    public void create(Quesstion quesstion){}
}
