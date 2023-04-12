package com.luongvandat.repositories;

import com.luongvandat.entities.Transaction_;
import com.luongvandat.entities.User_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User_, String> {
}