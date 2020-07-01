package com.agora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agora.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
