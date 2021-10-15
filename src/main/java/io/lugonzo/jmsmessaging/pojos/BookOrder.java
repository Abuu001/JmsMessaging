package io.lugonzo.jmsmessaging.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BookOrder {
    private final String bookOrderId;
    private final Book  book;
    private final  Customer customer;
}
