package com.DSMOVE.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DSMOVE.dsmovie.dto.movieDTO;
import com.DSMOVE.dsmovie.entities.Movie;
import com.DSMOVE.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository repository;
	@Transactional(readOnly = true)
	 public Page<movieDTO> findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		Page<movieDTO> page = result.map(x -> new  movieDTO(x));
		return page;
		
	}
	 
	 @Transactional(readOnly = true)

	 public movieDTO findById(Long id){
		   Movie result = repository.findById(id).get();
		    movieDTO dto = new movieDTO(result);
		     return dto;
	                  	
}
}