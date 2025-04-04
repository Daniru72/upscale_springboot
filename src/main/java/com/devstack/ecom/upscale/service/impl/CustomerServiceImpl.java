package com.devstack.ecom.upscale.service.impl;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import com.devstack.ecom.upscale.entity.Customer;
import com.devstack.ecom.upscale.repo.CustomerRepo;
import com.devstack.ecom.upscale.service.CustomerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor

public class CustomerServiceImpl implements CustomerServices {

    private final CustomerRepo customerRepo;

    @Override
    public void create(RequestCustomerDto dto) {
        Customer customer = Customer.builder()
                .property_id(UUID.randomUUID().toString())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .isActive(dto.isActive())
                .build();
        customerRepo.save(customer);

    }
}
