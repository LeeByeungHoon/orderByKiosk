package kiosk.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import kiosk.config.kafka.KafkaProcessor;
import kiosk.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ShowOrderListViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private ShowOrderListRepository showOrderListRepository;
    //>>> DDD / CQRS
}
