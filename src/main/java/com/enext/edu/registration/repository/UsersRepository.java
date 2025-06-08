package com.enext.edu.registration.repository;

import com.enext.edu.registration.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // You can add custom query methods here if needed
}

