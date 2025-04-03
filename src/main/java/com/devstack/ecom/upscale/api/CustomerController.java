package com.devstack.ecom.upscale.api;

import com.devstack.ecom.upscale.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String create(@RequestBody RequestCustomerDto requestCustomerDto) {

        return "create()";
    }

    @PutMapping
    public String update(){
        return "update()";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){ // http://localhost:8001/api/v1/customers/123
        return "delete()";
    }


    @GetMapping("/{id}")
    public String getById(@PathVariable String id){ // http://localhost:8001/api/v1/customers/123
        return "getById()";
    }



    @GetMapping("/list")
    public String findAll(
            @RequestParam String searchTex,
            @RequestParam int page,
            @RequestParam int size      //  http://localhost:8001/api/v1/customers/?searchTex=bag&page=0&size=10
    ){
        return "findAll()";
    }

}

// http://localhost:8001/api/v1/customers/create
