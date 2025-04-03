package com.devstack.ecom.upscale.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String create(){return "create()";}

    @PutMapping
    public String update(){return "update()";}

    @GetMapping("/list")
    public String findAll(){return "findAll()";}

    @GetMapping
    public String getById(){return "getById()";}

    @DeleteMapping
    public String delete(){return "delete()";}

}

// http://localhost:8001/api/v1/customers/create
