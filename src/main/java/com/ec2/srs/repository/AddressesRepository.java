package com.ec2.srs.repository;

import com.ec2.srs.model.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends JpaRepository<Addresses, Integer> {
    // Custom queries can be added here
}
