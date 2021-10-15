package io.lugonzo.jmsmessaging.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {
    private final String customerId;
    private final String fullName;
}
