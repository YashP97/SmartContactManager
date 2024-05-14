package com.smartcontactmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smartcontactmanager.entities.Contacts;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long>{
	
	@Query(value = "SELECT * FROM ld_contacts where user_ld_id=?1", nativeQuery = true)
	List<Contacts> findByUserId(long id);
}
