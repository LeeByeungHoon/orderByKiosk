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
    OrderManagementRepository orderManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ComplatedCooking'"
    )
    public void wheneverComplatedCooking_ChangeStatus(
        @Payload ComplatedCooking complatedCooking
    ) {
        ComplatedCooking event = complatedCooking;
        System.out.println(
            "\n\n##### listener ChangeStatus : " + complatedCooking + "\n\n"
        );

        // Sample Logic //
        OrderManagement.changeStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelledRequest'"
    )
    public void wheneverCancelledRequest_ChangeStatus(
        @Payload CancelledRequest cancelledRequest
    ) {
        CancelledRequest event = cancelledRequest;
        System.out.println(
            "\n\n##### listener ChangeStatus : " + cancelledRequest + "\n\n"
        );

        // Sample Logic //
        OrderManagement.changeStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelledCooking'"
    )
    public void wheneverCancelledCooking_ChangeStatus(
        @Payload CancelledCooking cancelledCooking
    ) {
        CancelledCooking event = cancelledCooking;
        System.out.println(
            "\n\n##### listener ChangeStatus : " + cancelledCooking + "\n\n"
        );

        // Sample Logic //
        OrderManagement.changeStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeactivatedTable'"
    )
    public void wheneverDeactivatedTable_NotifyToWatingCustomer(
        @Payload DeactivatedTable deactivatedTable
    ) {
        DeactivatedTable event = deactivatedTable;
        System.out.println(
            "\n\n##### listener NotifyToWatingCustomer : " +
            deactivatedTable +
            "\n\n"
        );

        // Sample Logic //
        OrderManagement.notifyToWatingCustomer(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
