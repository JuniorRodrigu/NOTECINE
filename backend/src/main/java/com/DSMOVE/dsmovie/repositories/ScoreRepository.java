package com.DSMOVE.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DSMOVE.dsmovie.entities.Score;
import com.DSMOVE.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
