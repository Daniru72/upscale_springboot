package com.devstack.ecom.upscale.repo;

import com.devstack.ecom.upscale.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {


}
