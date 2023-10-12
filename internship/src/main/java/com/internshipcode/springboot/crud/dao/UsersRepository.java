package com.internshipcode.springboot.crud.dao;

import com.internshipcode.springboot.crud.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users")
public interface UsersRepository extends JpaRepository<Users,Integer> {


}
