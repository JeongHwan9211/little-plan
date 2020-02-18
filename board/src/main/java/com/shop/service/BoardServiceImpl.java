package com.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.BoardMapper;
import com.shop.model.BoardModel;

@Service
public class BoardServiceImpl implements BoardService {
	
		@Autowired
		private BoardMapper boardMapper;
		
		@Override
		public BoardModel getAll() {
			BoardModel boardModel = boardMapper.getAll();
			return boardModel;
			
		}
}
