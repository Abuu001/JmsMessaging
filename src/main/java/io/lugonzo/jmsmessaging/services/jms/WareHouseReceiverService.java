package io.lugonzo.jmsmessaging.services.jms;

import io.lugonzo.jmsmessaging.pojos.BookOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WareHouseReceiverService {

    @JmsListener(destination = "book.order.queue")
    public void receive(BookOrder bookOrder){
        log.info("####  Inside warehouse receiver  ####");
        log.info("Message id : " + bookOrder);
    }
}
