package com.akbas.springboot.PribasProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akbas.springboot.PribasProject.Entity.Moments;

public interface MomentsRepository extends JpaRepository<Moments, Integer> {

}
