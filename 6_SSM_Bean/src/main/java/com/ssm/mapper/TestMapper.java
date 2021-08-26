package com.ssm.mapper;

import com.ssm.entity.TableForSSM;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {

    void add(TableForSSM entity);

    String get(@Param("s") String s);
}
