package com.itcast.dao;

import com.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository //增加一个dao层的注解,完全不影响
public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
