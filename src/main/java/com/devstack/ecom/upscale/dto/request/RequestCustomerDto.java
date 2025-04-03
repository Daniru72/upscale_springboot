package com.devstack.ecom.upscale.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestCustomerDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private boolean isActive;

}
