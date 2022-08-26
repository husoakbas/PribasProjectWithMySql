package com.akbas.springboot.PribasProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.akbas.springboot.PribasProject.DTO.TimelineResponse;
import com.akbas.springboot.PribasProject.Entity.Timeline;

@Repository
public interface TimelineRepository extends JpaRepository<Timeline, Integer> {

	@Query("SELECT new com.akbas.springboot.PribasProject.DTO.TimelineResponse (t.description, u.userName) FROM Timeline t JOIN t.user u ")
	public List<TimelineResponse> getJoionExample();

}
