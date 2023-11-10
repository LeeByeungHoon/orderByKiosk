package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReturnedDishes extends AbstractEvent {

    private Long id;
    private Integer tableNo;

    public ReturnedDishes(OrderManagement aggregate) {
        super(aggregate);
    }

    public ReturnedDishes() {
        super();
    }
}
//>>> DDD / Domain Event
