package com.itcast.dao;

import com.itcast.domain.Items;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository //增加一个dao层的注解,完全不影响
public interface ItemsDao {
//	根据id查询商品信息
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
//    查询所有商品信息
    @Select("select * from items")
	public List<Items> findAll();
}
