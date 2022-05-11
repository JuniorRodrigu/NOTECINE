package com.DSMOVE.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSMOVE.dsmovie.dto.movieDTO;
import com.DSMOVE.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<movieDTO> finAdll(Pageable pageable) {
		return service.findAll(pageable);
		
	}
	@GetMapping(value="/{id}")
	public movieDTO findById(@PathVariable Long id){
	    return service.findById(id);
	}
		
	}


