package kiosk.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import kiosk.config.kafka.KafkaProcessor;
import kiosk.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    TableManagementRepository tableManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReturnedDishes'"
    )
    public void wheneverReturnedDishes_ActivateTable(
        @Payload ReturnedDishes returnedDishes
    ) {
        ReturnedDishes event = returnedDishes;
        System.out.println(
            "\n\n##### listener ActivateTable : " + returnedDishes + "\n\n"
        );

        // Sample Logic //
        TableManagement.activateTable(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StartedCooking'"
    )
    public void wheneverStartedCooking_ActivateTable(
        @Payload StartedCooking startedCooking
    ) {
        StartedCooking event = startedCooking;
        System.out.println(
            "\n\n##### listener ActivateTable : " + startedCooking + "\n\n"
        );

        // Sample Logic //
        TableManagement.activateTable(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
