package com.agora.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agora.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
