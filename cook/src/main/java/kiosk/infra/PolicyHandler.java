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
    CookingManagementRepository cookingManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderedMenu'"
    )
    public void wheneverOrderedMenu_StartCooking(
        @Payload OrderedMenu orderedMenu
    ) {
        OrderedMenu event = orderedMenu;
        System.out.println(
            "\n\n##### listener StartCooking : " + orderedMenu + "\n\n"
        );

        // Sample Logic //
        CookingManagement.startCooking(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelledMenu'"
    )
    public void wheneverCancelledMenu_CancelRequest(
        @Payload CancelledMenu cancelledMenu
    ) {
        CancelledMenu event = cancelledMenu;
        System.out.println(
            "\n\n##### listener CancelRequest : " + cancelledMenu + "\n\n"
        );

        // Sample Logic //
        CookingManagement.cancelRequest(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
