package io.lugonzo.jmsmessaging.controller;

import io.lugonzo.jmsmessaging.dto.PurchaseDetails;
import io.lugonzo.jmsmessaging.pojos.Book;
import io.lugonzo.jmsmessaging.pojos.BookOrder;
import io.lugonzo.jmsmessaging.pojos.Customer;
import io.lugonzo.jmsmessaging.services.jms.BookStoreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    BookStoreOrderService bookStoreOrderService;

    @GetMapping
    public String hey(){
        return "heyy";
    }

    @PostMapping
    public String postBook(@RequestBody PurchaseDetails purchaseDetails){
        var book1 = Book.builder()
                .bookId(purchaseDetails.getBookId())
                .title(purchaseDetails.getTitle())
                .build();

        var customer1 = Customer.builder()
                .customerId(purchaseDetails.getCustomerId())
                .fullName(purchaseDetails.getFullName())
                .build();

        var bookOrder = BookOrder.builder()
                .bookOrderId(purchaseDetails.getBookOrderId())
                .book(book1)
                .customer(customer1)
                .build();

        bookStoreOrderService.send(bookOrder);
        System.out.println("Book Order --> : " + bookOrder);
        return "Book sent Sucessfuly";
    }
}
