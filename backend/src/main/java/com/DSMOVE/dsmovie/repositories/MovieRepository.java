package com.DSMOVE.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DSMOVE.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
