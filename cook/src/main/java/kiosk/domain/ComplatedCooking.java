package kiosk.domain;

import java.time.LocalDate;
import java.util.*;
import kiosk.domain.*;
import kiosk.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ComplatedCooking extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String menuName;
    private Long menuId;
    private Integer tableNo;
    private Date cookingDt;
    private String status;

    public ComplatedCooking(CookingManagement aggregate) {
        super(aggregate);
    }

    public ComplatedCooking() {
        super();
    }
}
//>>> DDD / Domain Event
