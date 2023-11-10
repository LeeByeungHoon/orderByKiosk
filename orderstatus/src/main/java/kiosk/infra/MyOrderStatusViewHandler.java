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
public class MyOrderStatusViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MyOrderStatusRepository myOrderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderedMenu_then_CREATE_1(
        @Payload OrderedMenu orderedMenu
    ) {
        try {
            if (!orderedMenu.validate()) return;

            // view 객체 생성
            MyOrderStatus myOrderStatus = new MyOrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            myOrderStatus.setOrderId(orderedMenu.getId());
            myOrderStatus.setMenuName(orderedMenu.getMenuName());
            myOrderStatus.setPrice(orderedMenu.getPrice());
            myOrderStatus.setTableNo(
                Integer.parseInt(orderedMenu.getTableNo())
            );
            myOrderStatus.setOrderDt(orderedMenu.getOrderDt());
            myOrderStatus.setOrderStatus(orderedMenu.getStatus());
            // view 레파지 토리에 save
            myOrderStatusRepository.save(myOrderStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenStartedCooking_then_UPDATE_1(
        @Payload StartedCooking startedCooking
    ) {
        try {
            if (!startedCooking.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCancelledMenu_then_UPDATE_2(
        @Payload CancelledMenu cancelledMenu
    ) {
        try {
            if (!cancelledMenu.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenComplatedCooking_then_UPDATE_3(
        @Payload ComplatedCooking complatedCooking
    ) {
        try {
            if (!complatedCooking.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCancelledRequest_then_UPDATE_4(
        @Payload CancelledRequest cancelledRequest
    ) {
        try {
            if (!cancelledRequest.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
