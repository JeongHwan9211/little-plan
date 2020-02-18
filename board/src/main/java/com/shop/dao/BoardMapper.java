package com.shop.dao;

import org.apache.ibatis.annotations.Mapper;

import com.shop.model.BoardModel;

@Mapper
public interface BoardMapper {

	BoardModel getAll();

}
