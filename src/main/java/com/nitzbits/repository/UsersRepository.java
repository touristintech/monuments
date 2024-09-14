package com.nitzbits.repository;

import com.nitzbits.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
    Users findUsersByUsername(String username);
}
