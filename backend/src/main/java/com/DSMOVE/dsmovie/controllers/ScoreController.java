package com.DSMOVE.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSMOVE.dsmovie.dto.MovieDTO;
import com.DSMOVE.dsmovie.dto.ScoreDTO;
import com.DSMOVE.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
	   MovieDTO moviDTO = service.saveScore(dto);
	   return moviDTO;
	}
	                 
	}


