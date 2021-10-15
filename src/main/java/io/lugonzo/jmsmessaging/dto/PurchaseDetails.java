package io.lugonzo.jmsmessaging.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PurchaseDetails {

    private final String bookId;
    private final String customerId;
    private final String title;
    private final String fullName;
    private final String bookOrderId;
}
