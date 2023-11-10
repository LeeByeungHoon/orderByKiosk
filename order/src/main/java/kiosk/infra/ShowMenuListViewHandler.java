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
public class ShowMenuListViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private ShowMenuListRepository showMenuListRepository;
    //>>> DDD / CQRS
}
