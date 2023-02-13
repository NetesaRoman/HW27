package com.example.hw27b.repository;

import com.example.hw27b.model.Address;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author Roman Netesa
 *
 */
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
