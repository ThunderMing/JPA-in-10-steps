package com.thunder.learning.jpa.jpain10steps.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.thunder.learning.jpa.jpain10steps.entity.User;

//@Deprecated
public interface UserRepository extends JpaRepository<User, Long>{

}