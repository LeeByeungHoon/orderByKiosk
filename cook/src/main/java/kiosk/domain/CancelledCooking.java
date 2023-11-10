package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelledCooking extends AbstractEvent {

    private Long id;

    public CancelledCooking(CookingManagement aggregate) {
        super(aggregate);
    }

    public CancelledCooking() {
        super();
    }
}
//>>> DDD / Domain Event
