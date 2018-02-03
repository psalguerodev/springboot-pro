package com.udemy.backendninja.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.entity.Log;

/**
 * The Interface LogRepository.
 */
@Repository("logRepository")
public interface LogRepository extends CrudRepository<Log, Serializable>{
	
}
