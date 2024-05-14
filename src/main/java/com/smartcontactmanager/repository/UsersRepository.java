package com.smartcontactmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartcontactmanager.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
