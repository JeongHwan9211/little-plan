package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.model.BoardModel;
import com.shop.service.BoardService;

@RestController
public class TestController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@RequestMapping("/query")
	public BoardModel getAll() {
		return boardService.getAll();
	}
	
}
