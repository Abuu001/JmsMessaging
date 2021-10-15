package io.lugonzo.jmsmessaging.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class Book {
    private final String bookId;
    private final String title;
}
