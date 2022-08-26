package com.akbas.springboot.PribasProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akbas.springboot.PribasProject.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
